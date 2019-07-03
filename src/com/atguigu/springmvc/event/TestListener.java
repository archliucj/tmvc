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
        System.out.println("===> 收到测试事件address:"+user.toString()+"，线程名为："+name);
    }*/

	@Async
	@EventListener
    public void onApplicationEvent(FaceEvent event) throws Exception {
		System.out.println("事件开始。。。。。。。。。。。。。。。。。");
		TimeUnit.SECONDS.sleep(5);
		User user = (User) event.getSource();
        String name = Thread.currentThread().getName();
        System.out.println("===> 收到测试事件:"+user.toString()+"，线程名为："+name);
    	System.out.println("事件结束。。。。。。。。。。。。。。。。。");
    }
	
	/*@EventListener(classes={AddressEvent.class})
	public void listen(AddressEvent event){
		System.out.println("UserService。。监听到的事件："+event);
	}*/
}
