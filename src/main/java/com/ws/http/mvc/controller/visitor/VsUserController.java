package com.ws.http.mvc.controller.visitor;

import com.ws.common.response.DataWrapper;
import com.ws.common.utils.encryption.KeyUtil;
import com.ws.http.annotation.Logger;
import com.ws.http.mvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * Created by Jo on 2017/7/19.
 *
 */
@RequestMapping("api/visitor/user")
@Controller
public class VsUserController {
    private final
    UserService userService;

    @Autowired
    public VsUserController(UserService userService) {
        this.userService = userService;
    }

    /**
     *
     * @param param
     *      phone:注册手机
     *      password:密码
     *      verifyCode:验证码
     * @return null
     */
    @RequestMapping(value = "signUp",method = RequestMethod.POST)
    @ResponseBody
    public DataWrapper<Void> signUp(
            @RequestParam Map<String,String> param

    ){
        return userService.signUp(param);
    }

    /**
     *
     * @param phone 注册手机
     * @return null
     */
    @RequestMapping(value = "getVerifyCode",method = RequestMethod.GET)
    @ResponseBody
    public DataWrapper<Void> getVerifyCode(
            @RequestParam("phone") String phone
    ){
        return userService.getVerifyCode(phone);
    }

    /**
     *
     * @param phone 手机号
     * @param password 密码
     * @return null
     */
    @RequestMapping(value = "login",method = RequestMethod.POST)
    @ResponseBody
    public DataWrapper<String> login(
            HttpServletRequest request,
            @RequestParam("phone") String phone,
            @RequestParam("password") String password
    ){
        String key = KeyUtil.requestKey(request);
        return userService.login(phone,password,key);
    }

    /**
     *
     * @param phone 手机号
     * @param verifyCode 验证码
     * @param newPwd 新密码
     * @return null
     */
    @RequestMapping(value = "forgetPassword",method = RequestMethod.POST)
    @ResponseBody
    public DataWrapper<Void> forgetPassword(
            @RequestParam("phone") String phone,
            @RequestParam("verifyCode") String verifyCode,
            @RequestParam("newPwd") String newPwd
    ){
        return userService.forgetPassword(phone,verifyCode,newPwd);
    }

    /**
     *
     * @param phone 手机号
     * @param password 密码
     * @param newPwd 新密码
     * @return null
     */
    @RequestMapping(value = "changePassword",method = RequestMethod.POST)
    @ResponseBody
    public DataWrapper<Void> changePassword(
            @RequestParam("phone") String phone,
            @RequestParam("password") String password,
            @RequestParam("newPwd") String newPwd
    ){
        return userService.changePassword(phone,password,newPwd);
    }
}
