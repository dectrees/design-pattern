package com.lnf.dp.bridge;

import com.sun.javafx.binding.SelectBinding;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 3/20/2023, Monday
 **/
public abstract class ColorShape {
    protected ShapeDrawer sd;
    public ColorShape(ShapeDrawer sd){
        this.sd = sd;
    }
    public abstract void draw();
}
