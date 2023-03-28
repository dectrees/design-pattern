package com.lnf.dp.strategy;

import com.sun.xml.internal.ws.model.AbstractWrapperBeanGenerator;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 3/21/2023, Tuesday
 **/
public class CheerUP {
    private Strategy strategy;

    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }
    public void cheer(){
        System.out.println("I need a cheerup!");
        this.strategy.haveFun();
    }
}
