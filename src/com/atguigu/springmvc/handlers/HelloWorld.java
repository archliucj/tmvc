package com.atguigu.springmvc.handlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.atguigu.springmvc.event.FaceEvent;
import com.atguigu.springmvc.event.FaceHandler;
import com.atguigu.springmvc.event.SpringContextUtil;
import com.atguigu.springmvc.event.User;
import com.atguigu.springmvc.service.HelloService;

@Controller
public class HelloWorld {

	 @Autowired
	 FaceHandler publisher;
	 
	 @Autowired
	 HelloService helloService;
	
	/**
	 * 1. 使用 @RequestMapping 注解来映射请求的 URL
	 * 2. 返回值会通过视图解析器解析为实际的物理视图, 对于 InternalResourceViewResolver 视图解析器, 会做如下的解析:
	 * 通过 prefix + returnVal + 后缀 这样的方式得到实际的物理视图, 然会做转发操作
	 * 
	 * /WEB-INF/views/success.jsp
	 * 
	 * @return
	 */
	@RequestMapping("/helloworld")
	public String hello(){
		helloService.hello();
		helloService.say();
		System.out.println("hello world");
		return "success";
	}
	
	@RequestMapping("/testEvent")
	public String testEvent(){
		for(int i=0;i<10;i++){
			User user = new User();
	        user.setAge(i);
	        user.setUsername("测试事件"+i);
	        //发布事件
	        SpringContextUtil.publishEvent(new FaceEvent(user));
		}
		
		System.out.println("事件开始...");
		return "success";
	}
	
}
