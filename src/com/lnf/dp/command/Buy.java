package com.lnf.dp.command;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 3/21/2023, Tuesday
 **/
public class Buy implements Order {
    private WareHouse wh;
    private Integer num;
    public Buy(WareHouse wh, Integer num){
        this.wh = wh;
        this.num = num;
    }
    @Override
    public void action() {
        this.wh.buy(this.num);
    }
}
