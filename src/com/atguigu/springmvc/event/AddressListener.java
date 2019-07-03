package com.atguigu.springmvc.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.atguigu.springmvc.event2.AddressEvent;


//@Component
public class AddressListener implements ApplicationListener<AddressEvent> {

    @Override
    public void onApplicationEvent(AddressEvent event) {
            Address add = (Address) event.getSource();
            System.out.println("AddressListener===> 收到测试事件:  {}"+event);
    }
}
