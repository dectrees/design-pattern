package com.lnf.dp.flyweight;

import com.lnf.dp.adapter.VideoPlayer;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 3/20/2023, Monday
 **/
public class Movie implements Video {
    private String name;
    public Movie(String name){
        this.name = name;
    }
    @Override
    public void play() {
        System.out.println("play movie:"+name);
    }
}
