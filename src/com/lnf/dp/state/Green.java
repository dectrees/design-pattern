package com.lnf.dp.state;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 3/21/2023, Tuesday
 **/
public class Green implements State {
    private String color;
    public Green(){
        this.color = "green";
    }
    @Override
    public State doAction() {
        System.out.println("Green, go go go");
        return new Red();
    }
}
