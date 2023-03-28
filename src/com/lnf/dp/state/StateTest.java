package com.lnf.dp.state;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 3/21/2023, Tuesday
 **/
public class StateTest {
    public static void main(String[] args) {
        Crossing c = new Crossing(new Red());
         c.go();
         c.go();
         c.go();
         c.go();
    }
}
