package com.lnf.dp.memento;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 3/21/2023, Tuesday
 **/
public class MementoTest {
    public static void main(String[] args) {
        Board board = new Board(new memento());
        board.addWords("hello world");
        board.addWords("mate");
        board.addWords("you alright?");
        board.addWords("byebye");
        board.showMem();
    }
}
