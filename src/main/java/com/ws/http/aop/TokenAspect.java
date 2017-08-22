package com.ws.http.aop;

import com.ws.common.response.DataWrapper;
import com.ws.common.response.ErrorCodeEnum;
import com.ws.common.session.TokenManager;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * Created by Jo on 2017/7/20.
 */
@Component
@Aspect
public class TokenAspect {

    @Around("execution(* com.ws.http.mvc.controller.store.*Controller.*(..))")
    public Object checkUser(ProceedingJoinPoint point) {
        DataWrapper<String> dataWrapper = new DataWrapper<String>();
        dataWrapper.setErrorCode(ErrorCodeEnum.Token_Failure);

        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        String token = request.getHeader("Token");

        if (TokenManager.checkToken(token)) {
            return dataWrapper;
        } else {
            Object object = null;
            try {
                object = point.proceed();
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }
            return object;
        }
    }
}
