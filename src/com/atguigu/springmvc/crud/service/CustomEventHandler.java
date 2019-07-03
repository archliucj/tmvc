package com.atguigu.springmvc.crud.service;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
@Component
public class CustomEventHandler implements ApplicationListener<CustomEvent> {

	
	
    public CustomEventHandler() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
    public void onApplicationEvent(CustomEvent event) {
        // TODO Auto-generated method stub
        System.out.println(event.toString());
    }

}
