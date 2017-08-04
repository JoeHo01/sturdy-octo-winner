package com.ws.http.aop;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 *
 * Created by Jo on 2017/7/20.
 */
@Component
@Aspect
public class SessionAspect {

//    @Around("execution(* com.ws.http.mvc.controller.store.*Controller.*(..))")
//    public Object checkUser(ProceedingJoinPoint point) {
//        DataWrapper<String> dataWrapper = new DataWrapper<String>();
//        dataWrapper.setErrorCode(ErrorCodeEnum.Limitation_Forbidden);
//
//        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
//        String token = request.getHeader("Token");
//
//        if (TokenManager.checkToken(token)) {
//            return dataWrapper;
//        } else {
//            Object object = null;
//            try {
//                object = point.proceed();
//            } catch (Throwable throwable) {
//                throwable.printStackTrace();
//            }
//            return object;
//        }
//    }
}
