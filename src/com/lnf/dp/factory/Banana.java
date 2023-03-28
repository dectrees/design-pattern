package com.lnf.dp.factory;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 3/19/2023, Sunday
 **/
public class Banana implements fruit {

    private String name;
    public Banana(String name){
        this.name = name;
    }
    @Override
    public void grow() {
        System.out.println("we are growing banana");
    }
}
