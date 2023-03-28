package com.lnf.dp.factory;

public class Apple implements fruit{

    private String name;
    public Apple(String name){
        this.name = name;
    }
    @Override
    public void grow() {
        System.out.println("we are growing apple");
    }
}
