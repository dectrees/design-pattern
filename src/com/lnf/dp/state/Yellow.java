package com.lnf.dp.state;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 3/21/2023, Tuesday
 **/
public class Yellow implements State {
    private String color;
    public Yellow(){
        this.color = "yellow";
    }
    @Override
    public State doAction() {
        System.out.println("yellow, wait for another 10 seconds");
        return new Green();
    }
}
