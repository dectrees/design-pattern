package com.lnf.dp.factory;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 3/19/2023, Sunday
 **/
public class AppleFactory implements factory {
    @Override
    public fruit creatSeed() {
        return new Apple("apple");
    }
}
