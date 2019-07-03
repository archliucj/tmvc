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
        add.setDizhi("������");
        //�����¼�
        applicationContext.publishEvent(new AddressEvent(add));
		//��������ҵ����
        System.out.println("���á�����handleToA");
    }
    
    public void handleToU(){
        User user = new User();
        user.setAge(11);
        user.setUsername("�����¼�11");
        //�����¼�
        applicationContext.publishEvent(new FaceEvent(user));
		//��������ҵ����
        System.out.println("���á�����11");
    }
    
    
    
    
}
