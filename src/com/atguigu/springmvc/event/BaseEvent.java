package com.atguigu.springmvc.event;

import org.springframework.context.ApplicationEvent;

/**
 * event�Ļ���
 *
 * @author 94977
 * @create 2018/7/22
 */
public abstract class BaseEvent extends ApplicationEvent {
    public BaseEvent(Object source) {
        super(source);
    }
}
