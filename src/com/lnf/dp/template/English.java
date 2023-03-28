package com.lnf.dp.template;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 3/21/2023, Tuesday
 **/
public class English extends Course {
    @Override
    void register() {
        System.out.println("register english");
    }

    @Override
    void learn() {
        System.out.println("learn english");
    }

    @Override
    void exam() {
        System.out.println("take english exam");
    }
}
