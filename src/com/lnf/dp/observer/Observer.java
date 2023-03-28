package com.lnf.dp.observer;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 3/21/2023, Tuesday
 **/
public abstract class Observer {
    protected Subject subject;
    public abstract void advice();
    public Observer(Subject subject){
        this.subject = subject;
        subject.attach(this);
    }
}
