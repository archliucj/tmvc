package com.atguigu.springmvc.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import com.atguigu.springmvc.event2.AddressEvent;

@Service
public class FaceHandler {

    @Autowired
    private ApplicationContext applicationContext;

    public void handleToA(){
        Address add = new Address();
        add.setDizhi("北京市");
        //发布事件
        applicationContext.publishEvent(new AddressEvent(add));
		//进行其他业务处理
        System.out.println("调用。。。handleToA");
    }
    
    public void handleToU(){
        User user = new User();
        user.setAge(11);
        user.setUsername("测试事件11");
        //发布事件
        applicationContext.publishEvent(new FaceEvent(user));
		//进行其他业务处理
        System.out.println("调用。。。11");
    }
    
    
    
    
}
