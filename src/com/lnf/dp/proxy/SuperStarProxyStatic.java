package com.lnf.dp.proxy;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 3/20/2023, Monday
 **/
public class SuperStarProxyStatic implements SuperStar {
    private SuperStar star;
    public SuperStarProxyStatic(SuperStar star){
        this.star = star;
    }
    @Override
    public void sing() {
        System.out.println("proxy:pay for the singing plz");
        star.sing();
    }

    @Override
    public void dance() {
        System.out.println("proxy:pay for the dancing plz");
        star.dance();
    }
}
