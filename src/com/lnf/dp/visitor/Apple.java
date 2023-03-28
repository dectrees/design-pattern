package com.lnf.dp.visitor;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 3/21/2023, Tuesday
 **/
public class Apple extends Fruit implements Acceptable{
    protected Apple() {
        super("apple");
    }

    @Override
    public void accept(FruitVisitor fruitVisitor) {
        fruitVisitor.visit(this);
    }
}
