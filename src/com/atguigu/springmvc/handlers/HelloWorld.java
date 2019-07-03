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
	 * 1. ʹ�� @RequestMapping ע����ӳ������� URL
	 * 2. ����ֵ��ͨ����ͼ����������Ϊʵ�ʵ�������ͼ, ���� InternalResourceViewResolver ��ͼ������, �������µĽ���:
	 * ͨ�� prefix + returnVal + ��׺ �����ķ�ʽ�õ�ʵ�ʵ�������ͼ, Ȼ����ת������
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
	        user.setUsername("�����¼�"+i);
	        //�����¼�
	        SpringContextUtil.publishEvent(new FaceEvent(user));
		}
		
		System.out.println("�¼���ʼ...");
		return "success";
	}
	
}
