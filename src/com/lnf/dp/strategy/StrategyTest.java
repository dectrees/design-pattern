package com.lnf.dp.strategy;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 3/21/2023, Tuesday
 **/
public class StrategyTest {
    public static void main(String[] args) {
        CheerUP cu = new CheerUP();
        cu.setStrategy(new Drink("beer"));
        cu.cheer();

        cu.setStrategy(new Game("playing WOW"));
        cu.cheer();
    }
}
