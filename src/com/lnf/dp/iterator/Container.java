package com.lnf.dp.iterator;


/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 3/21/2023, Tuesday
 **/
public interface Container<T> {
    CIterator<T> getIterator();
}
