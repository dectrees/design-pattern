package com.lnf.dp.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 3/20/2023, Monday
 **/
public class SuperStarProxy  {
    private Object star;
    public SuperStarProxy(Object star){
        this.star = star;
    }
    public Object getProxy(){
        return Proxy.newProxyInstance(star.getClass().getClassLoader(), star.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if(method.getName().equals("sing")){
                    System.out.println("proxy:please pay for the sing");
                    return method.invoke(star,args);
                }
                else if(method.getName().equals("dance")){
                    System.out.println("proxy:please pay for the dance");
                    return method.invoke(star,args);
                }
                return null;
            }
        });
    }
}
