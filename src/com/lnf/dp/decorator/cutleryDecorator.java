package com.lnf.dp.decorator;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 3/20/2023, Monday
 **/
public abstract class cutleryDecorator {
    protected cutlery ct;
    public cutleryDecorator(cutlery ct ){
        this.ct = ct;
    }
    void cook(){
        ct.cook();
    }
}
