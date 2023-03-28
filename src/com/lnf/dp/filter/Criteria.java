package com.lnf.dp.filter;

import java.util.List;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 3/20/2023, Monday
 **/
public interface Criteria<T>   {
    List<T> filter(List<T> list);
}
