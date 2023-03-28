package com.lnf.dp.template;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 3/21/2023, Tuesday
 **/
public class Math extends Course {
    @Override
    void register() {
        System.out.println("register math");
    }

    @Override
    void learn() {
        System.out.println("learn math");
    }

    @Override
    void exam() {
        System.out.println("take math exam");
    }
}
