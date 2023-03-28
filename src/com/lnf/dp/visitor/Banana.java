package com.lnf.dp.visitor;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 3/21/2023, Tuesday
 **/
public class Banana extends Fruit implements Acceptable {
    protected Banana() {
        super("banana");
    }

    @Override
    public void accept(FruitVisitor fruitVisitor) {
        fruitVisitor.visit(this);
    }
}
