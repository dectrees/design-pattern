package com.lnf.dp.bridge;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 3/20/2023, Monday
 **/
public class BridgeTest {
    public static void main(String[] args) {
        ColorShape cs = new RedShape("red",new CircleDrawer());
        cs.draw();
        cs = new RedShape("red",new SquareDrawer());
        cs.draw();
    }
}
