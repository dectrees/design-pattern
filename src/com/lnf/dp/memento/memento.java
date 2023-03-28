package com.lnf.dp.memento;

import java.util.LinkedList;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 3/21/2023, Tuesday
 **/
public class memento {
    private LinkedList<String> liMem = new LinkedList<>();
    public String getMem(){
        return this.liMem.getFirst();
    }
    public void addMem(String str){
        liMem.addLast(str);
    }
    public void showList(){
        for(String s:liMem){
            System.out.println("***"+s);
        }
    }
}
