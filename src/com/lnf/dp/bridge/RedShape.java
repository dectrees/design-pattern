package com.lnf.dp.bridge;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 3/20/2023, Monday
 **/
public class RedShape extends ColorShape {
    private String color;

    public RedShape(String color,ShapeDrawer shapeDrawer){
        super(shapeDrawer);
        this.color = color;
    }
    @Override
    public void draw() {
        System.out.println("draw with color red:");
        sd.drawShape();
    }
}
