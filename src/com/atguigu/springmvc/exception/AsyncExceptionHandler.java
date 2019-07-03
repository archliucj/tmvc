package com.atguigu.springmvc.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.interceptor.SimpleAsyncUncaughtExceptionHandler;

import java.lang.reflect.Method;

public class AsyncExceptionHandler extends SimpleAsyncUncaughtExceptionHandler {

    Logger logger = LoggerFactory.getLogger(AsyncExceptionHandler.class);

    @Override
    public void handleUncaughtException(Throwable throwable, Method method, Object... objects) {

        logger.debug("**********************lcj标记:{}----------",throwable+"---线程"+Thread.currentThread().getName());
    }
}
