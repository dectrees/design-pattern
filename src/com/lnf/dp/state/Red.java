package com.lnf.dp.state;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 3/21/2023, Tuesday
 **/
public class Red implements State {
    private String color;
    public Red(){
        this.color = "red";
    }
    @Override
    public State doAction() {
        System.out.println("red:wait 30 seconds");
        return new Yellow();
    }
}
