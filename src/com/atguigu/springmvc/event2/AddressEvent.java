package com.atguigu.springmvc.event2;

import com.atguigu.springmvc.event.Address;
import com.atguigu.springmvc.event.User;

public class AddressEvent extends BaseEvent<Address> {
    
    public AddressEvent(Address add) {
        super(add);
    }

    public AddressEvent(Object source, Address add){
        super(source,add);
    }

}
