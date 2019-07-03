package com.atguigu.springmvc.service;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface TestLog2 {
    String desc() default "";

}

