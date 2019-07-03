package com.atguigu.springmvc.crud.service;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@EventListener(classes={CustomEvent.class})
	public void listen(CustomEvent event){
		System.out.println("UserService。。监听到的事件："+event);
	}

}
