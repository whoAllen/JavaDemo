package com.languo.javademo.设计模式.工厂方法模式.LoggerDemo;

/**
 * Created by Answer on 2017/11/29.
 */

public class FileLogger implements Logger {
    @Override
    public void writeLog() {
        System.out.println("打印——文件日志记录");
    }
}
