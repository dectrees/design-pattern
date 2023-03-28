package com.lnf.dp.iterator;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 3/21/2023, Tuesday
 **/
public class Rose implements Flower {

    private  String name;
    public Rose(String name){
        this.name = name;
    }

    @Override
    public void show() {
        System.out.println("I am a rose: "+name);
    }
}
