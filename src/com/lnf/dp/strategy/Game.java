package com.lnf.dp.strategy;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 3/21/2023, Tuesday
 **/
public class Game implements Strategy {
    private String fun;
    public Game(String fun){
        this.fun = fun;
    }
    @Override
    public void haveFun() {
        System.out.println("have fun via:"+fun);
    }
}
