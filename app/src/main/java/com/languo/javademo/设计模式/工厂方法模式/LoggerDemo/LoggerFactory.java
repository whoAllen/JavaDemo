package com.languo.javademo.设计模式.工厂方法模式.LoggerDemo;


/**
 * Created by Answer on 2017/11/27.
 * 两种工厂方法模式：
 * 1：简单工厂方法模式  只有一个创建工厂类的抽象方法
 * <p>
 * 2：隐藏工厂方法  抽象类，多以一个产品对象的业务方法
 */

//方法一： 原始的工厂方法模式
//public interface LoggerFactory {
//    Logger createLogger();
//}

//方法二： 隐藏工厂方法
abstract class LoggerFactory {
    abstract Logger createLogger();

    public void writeLogger() {
        this.createLogger().writeLog();
    }
}
