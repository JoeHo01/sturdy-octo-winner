package com.ws.http.annotation;

import java.lang.annotation.*;

/**
 *
 * Created by Jo on 2017/8/4.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface Logger {
    String log();
}
