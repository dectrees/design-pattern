package com.lnf.dp.builder;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 3/19/2023, Sunday
 **/
public class BuilderTest {
    public static void main(String[] args) {
        Building building = new Building();
        Builder builder = new House();
        building.makeBuilder(builder);
        building.work();
        builder = new Flat();
        building.makeBuilder(builder);
        building.work();
    }
}
