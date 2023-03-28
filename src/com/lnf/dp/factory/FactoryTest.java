package com.lnf.dp.factory;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 3/19/2023, Sunday
 **/
public class FactoryTest {
    public static void main(String[] args) {
        factory fac = new BananaFactory();
        fruit fru = fac.creatSeed();
        fru.grow();
    }
}
