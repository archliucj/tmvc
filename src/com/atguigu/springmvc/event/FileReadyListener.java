package com.atguigu.springmvc.event;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionalEventListener;

import com.atguigu.springmvc.event2.AddressEvent;

//@Component
public class FileReadyListener   {



    @TransactionalEventListener
    @Async
    public void FileReadyListener(AddressEvent fileReadyEvent){
        System.out.println("ÏìÓ¦ÊÂ¼þ:{}--AddressEvent---"+fileReadyEvent);
    }

}
