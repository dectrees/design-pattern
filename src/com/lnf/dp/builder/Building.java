package com.lnf.dp.builder;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 3/19/2023, Sunday
 **/
public class Building {
    private Builder builder;
    public void makeBuilder(Builder builder) {
        this.builder = builder;
    }
    public void work(){
        builder.buildWall();
        builder.buidRoof();
    }
}
