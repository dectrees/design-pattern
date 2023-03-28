package com.lnf.dp.iterator;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 3/21/2023, Tuesday
 **/
public class IteratorTest {
    public static void main(String[] args) {
        Container c = new RoseContainer();
        CIterator<Rose> itr = c.getIterator();
        while(itr.hasNext()){
            Flower s = itr.next();
            s.show();
        }
    }
}
