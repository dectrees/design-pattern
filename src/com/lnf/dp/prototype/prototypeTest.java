package com.lnf.dp.prototype;

import java.sql.SQLOutput;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 3/19/2023, Sunday
 **/
public class prototypeTest {
    public static void main(String[] args) {

        com.lnf.dp.prototype.prototype pt1 = com.lnf.dp.prototype.cloneFactory.getInstance();
        System.out.println(pt1.toString());
        pt1.setNum(99);
        pt1.setStr("dude");
        System.out.println(pt1.toString());
        com.lnf.dp.prototype.prototype pt2 = com.lnf.dp.prototype.cloneFactory.getInstance();
        System.out.println(pt2.toString());
    }
}
