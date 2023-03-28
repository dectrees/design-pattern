package com.lnf.dp.adapter;



/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 3/20/2023, Monday
 **/
public abstract class MediaPlayer {
    protected MediaPlayer mp;

    public void setAdapter(MediaPlayer mp)
    {
        this.mp = mp;
    }
    public abstract void play();
}
