package com.ws.http.mvc.service.impl;

import com.ws.common.response.ErrorCodeEnum;
import com.ws.common.session.TokenManager;
import com.ws.common.session.VerifyCodeManager;
import com.ws.common.response.DataWrapper;
import com.ws.common.utils.HttpUtil;
import com.ws.common.utils.encryption.SingleEnUtil;
import com.ws.http.mvc.dao.UserDao;
import com.ws.http.mvc.pojo.UserPojo;
import com.ws.http.mvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    private final
    UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public DataWrapper<Void> signUp(Map<String, String> user) {
        DataWrapper<Void> dataWrapper = new DataWrapper<Void>();
        String phone = user.get("phone");
        if (checkExist(phone)) {
            dataWrapper.setErrorCode(ErrorCodeEnum.Exist_Already);
        } else {
            String serverCode = VerifyCodeManager.getCode(phone);
            if (serverCode == null) {
                dataWrapper.setErrorCode(ErrorCodeEnum.VerifyCode_OverTime);
            } else if (!serverCode.equals(user.get("verifyCode"))) {
                dataWrapper.setErrorCode(ErrorCodeEnum.VerifyCode_Wrong);
            } else {
                String password = encrypt(user.get("password"));
                user.put("password", password);
                int i = userDao.addUser(user);
                if (i != 1) {
                    dataWrapper.setErrorCode(ErrorCodeEnum.Error);
                } else {
                    VerifyCodeManager.removeCode(phone);
                }
            }
        }
        return dataWrapper;
    }

    public DataWrapper<Void> getVerifyCode(String phone) {
        DataWrapper<Void> dataWrapper = new DataWrapper<Void>();
        String code = VerifyCodeManager.newCode(phone);
        boolean send$B = HttpUtil.sendMassage(phone, "54362", code, "5");
        if (!send$B) dataWrapper.setErrorCode(ErrorCodeEnum.Message_Send);
        return dataWrapper;
    }

    public DataWrapper<String> login(String phone, String password, String key) {
        DataWrapper<String> dataWrapper = new DataWrapper<String>();
        if (!checkExist(phone)) {
            dataWrapper.setErrorCode(ErrorCodeEnum.Exist_Null);
        } else {
            int userId = getUser(phone, password);
            if (userId == -1) {
                dataWrapper.setErrorCode(ErrorCodeEnum.Password_Wrong);
            } else {
                Map<String, String> userInfo = new HashMap<String, String>();
                userInfo.put("lmt", "2");
                userInfo.put("aud", phone);
                userInfo.put("uid", String.valueOf(userId));
                String token = TokenManager.getToken(userInfo);
                dataWrapper.setData(token);
            }
        }
        return dataWrapper;
    }

    @Override
    public DataWrapper<Void> forgetPassword(String phone, String verifyCode, String newPwd) {
        DataWrapper<Void> dataWrapper = new DataWrapper<Void>();
        if (!checkExist(phone)) {
            dataWrapper.setErrorCode(ErrorCodeEnum.Exist_Null);
        } else {
            String serverCode = VerifyCodeManager.getCode(phone);
            if (serverCode == null) {
                dataWrapper.setErrorCode(ErrorCodeEnum.VerifyCode_OverTime);
            } else if (!serverCode.equals(verifyCode)) {
                dataWrapper.setErrorCode(ErrorCodeEnum.VerifyCode_Wrong);
            } else {
                String enPwd = encrypt(newPwd);
                int i = userDao.updatePassword(phone, enPwd);
                if (i != 1) {
                    dataWrapper.setErrorCode(ErrorCodeEnum.Error);
                } else {
                    VerifyCodeManager.removeCode(phone);
                }
            }
        }
        return dataWrapper;
    }

    @Override
    public DataWrapper<Void> changePassword(String phone, String password, String newPwd) {
        DataWrapper<Void> dataWrapper = new DataWrapper<Void>();
        if (!checkExist(phone)) {
            dataWrapper.setErrorCode(ErrorCodeEnum.Exist_Null);
        } else {
            int userId = getUser(phone, password);
            if (userId == -1) {
                dataWrapper.setErrorCode(ErrorCodeEnum.Password_Wrong);
            } else {
                String enPwd = encrypt(newPwd);
                int i = userDao.updatePassword(phone, enPwd);
                if (i != 1) {
                    dataWrapper.setErrorCode(ErrorCodeEnum.Error);
                }
            }
        }
        return dataWrapper;
    }

    @Override
    public DataWrapper<Void> updateInfo(Map<String, String> param) {
        DataWrapper<Void> dataWrapper = new DataWrapper<Void>();
        int i = userDao.updateInfo(param);
        if (i != 1) {
            dataWrapper.setErrorCode(ErrorCodeEnum.Error);
        }
        return dataWrapper;
    }

    @Override
    public DataWrapper<UserPojo> getInfo(int userId) {
        DataWrapper<UserPojo> dataWrapper = new DataWrapper<UserPojo>();
        UserPojo user = userDao.getInfo(userId);
        dataWrapper.setData(user);
        return dataWrapper;
    }

    private boolean checkExist(String phone) {
        return userDao.checkExist(phone) == 1;
    }

    private int getUser(String phone, String password) {
        String enPwd = encrypt(password);
        String userId = userDao.getUser(phone, enPwd);
        if (userId == null) {
            return -1;
        } else {
            return Integer.parseInt(userId);
        }
    }

    private String encrypt(String word) {
        return SingleEnUtil.SHA(word);
    }
}
