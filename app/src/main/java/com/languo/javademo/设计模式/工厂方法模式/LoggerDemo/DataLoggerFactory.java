package com.languo.javademo.设计模式.工厂方法模式.LoggerDemo;

/**
 * Created by Answer on 2017/11/29.
 */

//public class DataLoggerFactory implements LoggerFactory {
//    @Override
//    public Logger createLogger() {
//        Logger logger = new DataLogger();
//        return logger;
//    }
//}

public class DataLoggerFactory extends LoggerFactory {
    @Override
    public Logger createLogger() {
        Logger logger = new DataLogger();
        return logger;
    }
}