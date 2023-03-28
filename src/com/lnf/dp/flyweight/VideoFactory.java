package com.lnf.dp.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 3/20/2023, Monday
 **/
public class VideoFactory {
    private static final Map<String,Video> videoBox = new HashMap<>();
    public static Video getVideo(String name){
        Video v = videoBox.get(name);
        if(null == v){
            String str = "ghost";
            Movie m = new Movie(str);
            videoBox.put("ghost",m);
            System.out.println("creat a movie: "+str);
            return m;
        }
        System.out.println("get a movie from BOX:"+name);
        return v;
    }
}
