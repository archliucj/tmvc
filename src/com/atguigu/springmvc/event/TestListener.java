package com.atguigu.springmvc.event;

import java.util.concurrent.TimeUnit;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import com.atguigu.springmvc.event2.AddressEvent;

@Component
public class TestListener {

	
	/*@EventListener
    public void onApplicationEvent(AddressEvent event) {
		Address user = (Address) event.getSource();
        String name = Thread.currentThread().getName();
        System.out.println("===> �յ������¼�address:"+user.toString()+"���߳���Ϊ��"+name);
    }*/

	@Async
	@EventListener
    public void onApplicationEvent(FaceEvent event) throws Exception {
		System.out.println("�¼���ʼ����������������������������������");
		TimeUnit.SECONDS.sleep(5);
		User user = (User) event.getSource();
        String name = Thread.currentThread().getName();
        System.out.println("===> �յ������¼�:"+user.toString()+"���߳���Ϊ��"+name);
    	System.out.println("�¼���������������������������������������");
    }
	
	/*@EventListener(classes={AddressEvent.class})
	public void listen(AddressEvent event){
		System.out.println("UserService�������������¼���"+event);
	}*/
}
