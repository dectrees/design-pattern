package com.lnf.dp.singleton;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 3/19/2023, Sunday
 **/
public class SingletonTest {
    public static void main(String[] args) {
//        Singleton s = new Singleton();
//        Singleton s = Singleton.getInstance();
        com.lnf.dp.singleton.SingletonLazy s = com.lnf.dp.singleton.SingletonLazy.getInstance();
        s.showMSG();
    }
}
