package com.lnf.dp.visitor;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 3/21/2023, Tuesday
 **/
public class FruitVisitorImp implements FruitVisitor {
    @Override
    public void visit(Apple apple) {
        System.out.println("eating: "+apple.getName());
    }

    @Override
    public void visit(Banana banana) {
        System.out.println("eating: "+banana.getName());
    }

    @Override
    public void visit(Grape grape) {
        System.out.println("eating: "+grape.getName() );
    }
}
