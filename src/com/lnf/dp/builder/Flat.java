package com.lnf.dp.builder;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 3/19/2023, Sunday
 **/
public class Flat implements Builder {
    @Override
    public void buildWall() {
        System.out.println("build flat wall");
    }

    @Override
    public void buidRoof() {
        System.out.println("build flat roof");
    }
}
