package com.lnf.dp.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 3/21/2023, Tuesday
 **/
public class VisitorTest {
    public static void main(String[] args) {
        List<Acceptable> list = new LinkedList<>();
        list.add(new Apple());
        list.add(new Banana());
        list.add(new Grape());
        FruitVisitor fv = new FruitVisitorImp();
        for(Acceptable f:list){
            f.accept(fv);
        }
    }
}
