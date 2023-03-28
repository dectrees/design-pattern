package com.lnf.dp.visitor;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 3/21/2023, Tuesday
 **/
public interface Acceptable {
    void accept(FruitVisitor fruitVisitor);
}
