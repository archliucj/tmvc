package com.atguigu.springmvc.service;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mysql.fabric.xmlrpc.base.Data;

@Service
public class HelloServiceImpl implements HelloService{

	@Autowired
    ScheduledExecutorService delayQueue;
	
	@TestLog
	@TestLog2
	public void hello(){
		System.out.println("hello.....service");
		
		delayQueue.schedule(()->{
           testd();
        },30, TimeUnit.SECONDS);
		
	}
	
	public void testd(){
		System.out.println("霞編delay。。。。。。。。。。。。。。。。。。。。。。。。。。。"+new Data());
	}
	
	@TestLog
	@TestLog2
	public void say(){
		System.out.println("say....................start");
		int i=0;
//		int y = 1/i;
		System.out.println("say......................end");
	}
}
