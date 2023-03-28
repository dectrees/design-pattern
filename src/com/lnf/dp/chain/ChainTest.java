package com.lnf.dp.chain;


/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 3/21/2023, Tuesday
 **/
public class ChainTest {
    public static void main(String[] args) {
        ChainLogger error = new ErrorLogger("error");
        ChainLogger debug = new DebugLogger("debug");
        ChainLogger info = new InfoLogger("info");
        error.setNextLogger(debug);
        debug.setNextLogger(info);

        error.log("debug","something wrong in debug");
    }
}
