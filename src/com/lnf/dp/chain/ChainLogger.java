package com.lnf.dp.chain;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 3/21/2023, Tuesday
 **/
public abstract  class ChainLogger {
    private String logLevel;
    private ChainLogger cl;

    public void setNextLogger(ChainLogger cl){
        this.cl = cl;
    }
    public ChainLogger(String logLevel){
        this.logLevel = logLevel;
    }
    public abstract  void writelog(String info);

    public void log(String logLevel,String info){
        if(logLevel.equals(this.logLevel)){
            this.writelog(info);
        }
        else this.cl.log(logLevel,info);
    }
}
