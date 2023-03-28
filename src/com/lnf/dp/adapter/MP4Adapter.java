package com.lnf.dp.adapter;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 3/20/2023, Monday
 **/
public class MP4Adapter extends MediaPlayer {
    private VideoPlayer vp;

    public MP4Adapter(VideoPlayer vp)
    {
        this.vp = vp;
    }
    @Override
    public void play() {
        vp.play();
    }
}
