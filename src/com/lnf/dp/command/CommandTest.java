package com.lnf.dp.command;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 3/21/2023, Tuesday
 **/
public class CommandTest {
    public static void main(String[] args) {
        WareHouse wh = new WareHouse(100);
        Shop shop = new Shop();
        shop.setOrder(new Buy(wh,2));
        shop.makeOrder();
        shop.setOrder(new Sell(wh,33));
        shop.makeOrder();
    }
}
