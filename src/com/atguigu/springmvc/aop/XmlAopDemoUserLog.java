package com.atguigu.springmvc.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by admin on 2015/9/2.
 */
public class XmlAopDemoUserLog {
//    方法执行前通知
    public void beforeLog() {
        System.out.println("开始执行前置通知  日志记录");
    }
//    方法执行完后通知
    public void afterLog() {
        System.out.println("开始执行后置通知 日志记录");
    }
//    执行成功后通知
    public void afterReturningLog() {
        System.out.println("方法成功执行后通知 日志记录");
    }
//    抛出异常后通知
    public void afterThrowingLog(JoinPoint joinPoint,Throwable throwable) {
        System.out.println(throwable.getMessage());
        System.out.println("方法抛出异常后执行通知 日志记录");
        System.out.println(joinPoint.getTarget().getClass().getSimpleName());
        
    }

//    环绕通知
    public Object aroundLog(ProceedingJoinPoint joinpoint) {
        Object result = null;
        try {
            System.out.println("环绕通知开始 日志记录");
            long start = System.currentTimeMillis();

            //有返回参数 则需返回值
            result =  joinpoint.proceed();

            long end = System.currentTimeMillis();
            System.out.println("总共执行时长" + (end - start) + " 毫秒");
            System.out.println("环绕通知结束 日志记录");
        } catch (Throwable t) {
            System.out.println("出现错误");
        }
        return result;
    }
}