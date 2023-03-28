package com.lnf.dp.template;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 3/21/2023, Tuesday
 **/
public class TemplateTest {
    public static void main(String[] args) {
        Course c = new Math();
        c.getScore();
        c = new English();
        c.getScore();
    }
}
