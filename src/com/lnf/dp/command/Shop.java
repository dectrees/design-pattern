package com.lnf.dp.command;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 3/21/2023, Tuesday
 **/
public class Shop {
    private Order order;
    public void setOrder(Order order){
        this.order = order;
    }
    public void makeOrder(){
        order.action();
    }
}
