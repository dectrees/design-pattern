package com.lnf.dp.observer;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 3/21/2023, Tuesday
 **/
public class ObserverLisa extends Observer {
    public ObserverLisa(Subject subject) {
        super(subject);
    }

    @Override
    public void advice() {
        System.out.println("state update notify in Lisa:"+subject.getState());
    }
}
