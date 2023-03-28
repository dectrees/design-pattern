package com.lnf.dp.template;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 3/21/2023, Tuesday
 **/
public abstract class Course {
    abstract void register();
    abstract void learn();
    abstract void exam();

    public void getScore(){
        register();
        learn();
        exam();
    }
}
