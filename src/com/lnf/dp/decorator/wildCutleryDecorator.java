package com.lnf.dp.decorator;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 3/20/2023, Monday
 **/
public class wildCutleryDecorator extends cutleryDecorator {
    public wildCutleryDecorator(cutlery ct) {
        super(ct);
    }
    @Override
    public void cook(){
        System.out.println("make a stove");
        ct.cook();
    }
}
