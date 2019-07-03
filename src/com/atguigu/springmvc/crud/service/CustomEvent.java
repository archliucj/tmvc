package com.atguigu.springmvc.crud.service;

import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

public class CustomEvent extends ApplicationEvent {

    /**
	 * 
	 */
	private static final long serialVersionUID = 8332829320829131222L;

    
    public CustomEvent(Object source) {
		super(source);
	}


	public String toString(){
        return "My Custom Event";
    }

}

