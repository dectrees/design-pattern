package com.lnf.dp.chain;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 3/21/2023, Tuesday
 **/
public class DebugLogger extends  ChainLogger {
    public DebugLogger(String logLevel) {
        super(logLevel);
    }

    @Override
    public void writelog(String info) {
        System.out.println("DEBUG: "+info);
    }
}
