package com.lnf.dp.command;


/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 3/21/2023, Tuesday
 **/
public class WareHouse {
    Integer count;
    public WareHouse(Integer init){
        this.count = init;
    }
    public void buy(int num){
        System.out.println("buy goods with the num:"+num);
        count += num;
        System.out.println("after buy the count is:"+this.count);
    }
    public void sell(int num){
        System.out.println("sell goods with the num:"+num);
        count -= num;
        System.out.println("after sell the count is:"+this.count);
    }
}
