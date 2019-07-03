package com.atguigu.springmvc.event;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEvent;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;

@EnableAsync
@Component
public class SpringContextUtil implements ApplicationContextAware {
	private static ApplicationContext applicationContext; // Spring应用上下文环境
 
	/*
	 * 
	 * 实现了ApplicationContextAware 接口，必须实现该方法；
	 * 
	 * 通过传递applicationContext参数初始化成员变量applicationContext
	 * 
	 */
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		SpringContextUtil.applicationContext = applicationContext;
	}
 
	public static ApplicationContext getApplicationContext() {
		return applicationContext;
	}
 
	public static<T> T getBean(Class<T> requiredType) {
		return (T) applicationContext.getBean(requiredType);
	}
 
	public static void publishEvent(ApplicationEvent event){
		applicationContext.publishEvent(event);
	}

} 
