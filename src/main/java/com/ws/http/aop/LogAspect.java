package com.ws.http.aop;

import com.ws.http.annotation.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

/**
 *
 * Created by Jo on 2017/8/4.
 */
@Component
@Aspect
public class LogAspect {

    @Before("@annotation(com.ws.http.annotation.Logger)")
    public void log(JoinPoint point){
        MethodSignature signature = (MethodSignature) point.getSignature();
        Logger logger = signature.getMethod().getAnnotation(Logger.class);
        String log = logger.log();
        // TODO: 2017/8/7 日志记录
    }
}
