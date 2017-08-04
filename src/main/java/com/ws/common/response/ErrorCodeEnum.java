package com.ws.common.response;

import java.io.Serializable;

/**
 *
 * Created by Jo on 2017/5/12.
 */
public enum ErrorCodeEnum implements Serializable {

    No_Error("No Error", 0),
    Error("Unknown error", 1),
    Exist_Already("已存在", 2),
    Exist_Null("不存在",3),
    Message_Send("通知发送失败", 4),
    VerifyCode_Wrong("验证码错误", 5),
    VerifyCode_OverTime("验证码已失效", 6),
    Password_Wrong("用户名或密码错误", 7),
    Token_Failure("JWT验证失效", 8),
    Token_Forbidden("JWT验证权限不足", 9),
    ;

    private String label;
    private Integer code;

    ErrorCodeEnum() {
    }

    ErrorCodeEnum(String label, Integer code) {
        this.label = label;
        this.code = code;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "ErrorCode#"+code.toString()+":"+label;
    }

    public static ErrorCodeEnum parse(int code) {
        for (ErrorCodeEnum theEnum : ErrorCodeEnum.values()) {
            if (theEnum.getCode() == code) {
                return theEnum;
            }
        }
        return No_Error;
    }
}
