package com.lnf.dp.prototype;

import sun.security.util.AuthResources_it;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 3/19/2023, Sunday
 **/
public class prototype implements Cloneable {
    private int num;
    private String str;


    public prototype(int num, String str){
        this.num = num;
        this.str = str;
    }
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    protected prototype clone() throws CloneNotSupportedException {
        prototype pt = (prototype)super.clone();
/*        pt.num = num;
        pt.str = str;
        System.out.println("doing clone:"+num+":str:"+str);*/
        return pt;
    }

    @Override
    public String toString() {
        return "prototype{" +
                "num=" + num +
                ", str='" + str + '\'' +
                '}';
    }
}
