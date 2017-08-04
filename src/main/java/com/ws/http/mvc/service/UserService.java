package com.ws.http.mvc.service;

import com.ws.common.response.DataWrapper;
import com.ws.http.mvc.pojo.UserPojo;

import java.util.Map;

public interface UserService {

    DataWrapper<Void> signUp(Map<String, String> user);

    DataWrapper<Void> getVerifyCode(String phone);

    DataWrapper<Void> forgetPassword(String phone, String verifyCode, String newPwd);

    DataWrapper<String> login(String phone, String password, String key);

    DataWrapper<Void> changePassword(String phone, String password, String newPwd);

    DataWrapper<Void> updateInfo(Map<String, String> param);

    DataWrapper<UserPojo> getInfo(int userId);

}
