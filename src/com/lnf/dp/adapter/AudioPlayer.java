package com.lnf.dp.adapter;

import java.util.Optional;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 3/20/2023, Monday
 **/
public class AudioPlayer extends MediaPlayer {

//    public void setAdapter(MediaPlayer mp)
//    {
//        this.mp = mp;
//    }
    @Override
    public void play() {
/*        Optional.ofNullable(mp).ifPresent(m->m.play());
        Optional.ofNullable(mp).orElse(mp.play());*/
        if(null == mp)
        {
            System.out.println("play audio");
        }
        else {
            mp.play();
        }
    }

//    public void playMP4()
//    {
//        Optional.ofNullable(mp).ifPresent(m->m.play());
//    }
}
