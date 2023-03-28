package com.lnf.dp.memento;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 3/21/2023, Tuesday
 **/
public class Board {
    private memento mem;

    public Board(memento mem) {
        this.mem = mem;
    }
    public void addWords(String string){
        System.out.println("add words:"+string);
        mem.addMem(string);
    }
    public void showMem(){
        this.mem.showList();
    }
}
