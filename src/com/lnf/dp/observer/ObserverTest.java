package com.lnf.dp.observer;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 3/21/2023, Tuesday
 **/
public class ObserverTest {
    public static void main(String[] args) {
        Subject subject = new Subject(99);
        Observer alex = new ObserverAlex(subject);
        Observer lisa = new ObserverLisa(subject);
        subject.setState(88);
    }
}
