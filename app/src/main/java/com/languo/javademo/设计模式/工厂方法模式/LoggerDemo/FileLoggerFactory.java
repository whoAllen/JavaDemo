package com.languo.javademo.设计模式.工厂方法模式.LoggerDemo;

/**
 * Created by Answer on 2017/11/29.
 */

// 常规
//public class FileLoggerFactory implements LoggerFactory {
//    @Override
//    public Logger createLogger() {
//        Logger logger = new FileLogger();
//        return logger;
//    }
//}

//隐藏
public class FileLoggerFactory extends LoggerFactory {

    @Override
    Logger createLogger() {
        FileLogger fileLogger = new FileLogger();
        return fileLogger;
    }
}
