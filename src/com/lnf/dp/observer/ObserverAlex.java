package com.lnf.dp.observer;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 3/21/2023, Tuesday
 **/
public class ObserverAlex extends Observer {

    public ObserverAlex(Subject subject) {
        super(subject);
    }

    @Override
    public void advice() {
        System.out.println("state update notify in Alex:"+subject.getState());
    }
}
