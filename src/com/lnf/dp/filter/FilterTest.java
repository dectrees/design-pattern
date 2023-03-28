package com.lnf.dp.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 3/21/2023, Tuesday
 **/
public class FilterTest {
    public static void main(String[] args) {
        Criteria c = new HeightFilter();
        List<Person> pList = new ArrayList<>();
        pList.add(new Person("alex",20));
        pList.add(new Person("Jimmy",8));
        List<Person> temp = c.filter(pList);
        for(Person p:temp){
            System.out.println(p.getName()+p.getHeight());
        }
    }
}
