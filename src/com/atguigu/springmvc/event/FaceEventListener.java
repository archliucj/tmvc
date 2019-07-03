package com.atguigu.springmvc.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;


//@Component
public class FaceEventListener implements ApplicationListener<FaceEvent> {

    @Override
    public void onApplicationEvent(FaceEvent event) {
            User user = (User) event.getSource();
            System.out.println("===> 收到测试事件:  {}"+event);
    }
}
