package com.atguigu.springmvc.event;

public class FaceEvent extends BaseEvent {

    /**
    * @author 94977
    * @time 2018/7/22 15:50
    * @param * @param null
    * @return
    * @description  ����Ҫʵ�ֵĹ��췽��
    */
    public FaceEvent(User user) {
        super(user);
    }
}
