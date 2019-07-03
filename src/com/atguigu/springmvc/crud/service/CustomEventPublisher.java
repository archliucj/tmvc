package com.atguigu.springmvc.crud.service;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component
public class CustomEventPublisher implements ApplicationEventPublisherAware {

    public CustomEventPublisher() {
		super();
		// TODO Auto-generated constructor stub
	}

	private ApplicationEventPublisher publisher;
    
    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        // TODO Auto-generated method stub
        this.publisher = applicationEventPublisher;
    }
    
    public void publish(){
        CustomEvent ce = new CustomEvent(this);
        publisher.publishEvent(ce);
    }

}
