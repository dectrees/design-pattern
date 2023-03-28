package com.lnf.dp.decorator;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 3/20/2023, Monday
 **/
public class DecoratorTest {
    public static void main(String[] args) {
        cutlery ct = new Pan();
        cutleryDecorator cd = new wildCutleryDecorator(ct);
        cd.cook();
    }
}
