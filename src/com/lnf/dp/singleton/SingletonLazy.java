package com.lnf.dp.singleton;

import sun.security.jca.GetInstance;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 3/19/2023, Sunday
 **/
public class SingletonLazy {
    private static SingletonLazy instance;
    private SingletonLazy(){}
    public static synchronized SingletonLazy getInstance(){
        if(null == instance){
            synchronized (SingletonLazy.class){
                if(null == instance){
                    return new SingletonLazy();
                }
            }
        }
        return null;
    }
    public void showMSG(){
        System.out.println("hello mate Lazy Singleton");
    }
}
