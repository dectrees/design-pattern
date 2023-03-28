package com.lnf.dp.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 3/20/2023, Monday
 **/
public class HeightFilter implements Criteria<Person> {
    List<Person> tlist = new ArrayList<>();
    @Override
    public List<Person> filter(List<Person> list) {
        for(Person p:list){
            if(p.getHeight() > 5){
                tlist.add(p);
            }
        }
        return tlist;
    }
}
