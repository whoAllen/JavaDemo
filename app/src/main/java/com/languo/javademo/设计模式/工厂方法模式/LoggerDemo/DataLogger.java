package com.languo.javademo.设计模式.工厂方法模式.LoggerDemo;

/**
 * Created by Answer on 2017/11/29.
 */

public class DataLogger implements Logger {
    @Override
    public void writeLog() {
        System.out.println("打印——数据库日志记录");
    }
}
