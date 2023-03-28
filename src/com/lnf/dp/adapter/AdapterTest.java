package com.lnf.dp.adapter;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 3/20/2023, Monday
 **/
public class AdapterTest {
    public static void main(String[] args) {
        MediaPlayer mp = new AudioPlayer();
        MP4Adapter ma = new MP4Adapter(new MP4Player());
        mp.setAdapter(ma);
        mp.play();

    }
}
