package com.lnf.dp.proxy;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 3/20/2023, Monday
 **/
public class ProxyTest {
    public static void main(String[] args) {
//        SuperStarProxy proxy = new SuperStarProxy(new AndyLau());
//        SuperStar star = (SuperStar)proxy.getProxy();
//        star.sing();
//        star.dance();
        SuperStarProxyStatic proxy = new SuperStarProxyStatic(new AndyLau());
        proxy.sing();
        proxy.dance();
    }
}
