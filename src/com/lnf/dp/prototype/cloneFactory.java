package com.lnf.dp.prototype;

import sun.security.jca.GetInstance;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 3/19/2023, Sunday
 **/
public class cloneFactory {
    private static prototype pt= new prototype(1,"mate");
    public static prototype getInstance(){
        try {
            return pt.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
