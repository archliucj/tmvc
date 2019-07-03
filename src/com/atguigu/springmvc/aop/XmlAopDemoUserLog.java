package com.atguigu.springmvc.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by admin on 2015/9/2.
 */
public class XmlAopDemoUserLog {
//    ����ִ��ǰ֪ͨ
    public void beforeLog() {
        System.out.println("��ʼִ��ǰ��֪ͨ  ��־��¼");
    }
//    ����ִ�����֪ͨ
    public void afterLog() {
        System.out.println("��ʼִ�к���֪ͨ ��־��¼");
    }
//    ִ�гɹ���֪ͨ
    public void afterReturningLog() {
        System.out.println("�����ɹ�ִ�к�֪ͨ ��־��¼");
    }
//    �׳��쳣��֪ͨ
    public void afterThrowingLog(JoinPoint joinPoint,Throwable throwable) {
        System.out.println(throwable.getMessage());
        System.out.println("�����׳��쳣��ִ��֪ͨ ��־��¼");
        System.out.println(joinPoint.getTarget().getClass().getSimpleName());
        
    }

//    ����֪ͨ
    public Object aroundLog(ProceedingJoinPoint joinpoint) {
        Object result = null;
        try {
            System.out.println("����֪ͨ��ʼ ��־��¼");
            long start = System.currentTimeMillis();

            //�з��ز��� ���践��ֵ
            result =  joinpoint.proceed();

            long end = System.currentTimeMillis();
            System.out.println("�ܹ�ִ��ʱ��" + (end - start) + " ����");
            System.out.println("����֪ͨ���� ��־��¼");
        } catch (Throwable t) {
            System.out.println("���ִ���");
        }
        return result;
    }
}