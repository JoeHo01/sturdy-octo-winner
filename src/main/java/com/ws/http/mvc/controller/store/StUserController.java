package com.ws.http.mvc.controller.store;

import com.ws.common.session.TokenManager;
import com.ws.common.response.DataWrapper;
import com.ws.http.mvc.pojo.UserPojo;
import com.ws.http.mvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created by Jo on 2017/7/19.
 */
@RequestMapping("api/store/user")
@Controller
public class StUserController {
    private final
    UserService userService;

    @Autowired
    public StUserController(UserService userService) {
        this.userService = userService;
    }

    /**
     * @param token 用户验证
     * @return 用户信息
     */
    @RequestMapping(value = "getInfo", method = RequestMethod.POST)
    @ResponseBody
    public DataWrapper<UserPojo> getInfo(
            @RequestParam String token
    ) {
        Map<String,String> payload = TokenManager.getPayload(token);
        assert payload != null;
        int userId = Integer.parseInt(payload.get("uid"));
        return userService.getInfo(userId);
    }

    /**
     * @param param token 用户验证
     *              weChat 微信号
     *              sex 性别 0保密/1男/2女
     *              portrait 头像
     *              sign 签名
     * @return null
     */
    @RequestMapping(value = "updateInfo", method = RequestMethod.POST)
    @ResponseBody
    public DataWrapper<Void> updateInfo(
            @RequestParam Map<String, String> param
    ) {
        Map<String,String> payload = TokenManager.getPayload(param.get("token"));
        assert payload != null;
        String userId = payload.get("uid");
        param.put("userId", userId);
        return userService.updateInfo(param);
    }
}
