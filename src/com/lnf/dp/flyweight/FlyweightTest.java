package com.lnf.dp.flyweight;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 3/20/2023, Monday
 **/
public class FlyweightTest {
    public static void main(String[] args) {
        VideoFactory.getVideo("west");
        VideoFactory.getVideo("ghost");
    }
}
