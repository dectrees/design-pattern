package com.lnf.dp.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 3/21/2023, Tuesday
 **/
public class Subject {
    private Integer state;
    private List<Observer> obList = new ArrayList<>();

    public Subject(Integer state) {
        this.state = state;
    }

    public void attach(Observer observer){
        obList.add(observer);
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
        for(Observer o:obList){
            o.advice();
        }
    }
}
