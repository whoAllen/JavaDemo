package com.languo.javademo.设计模式.工厂方法模式.LoggerDemo;

/**
 * Created by Answer on 2017/11/29.
 *
 * 使用 工程方法模式 在新增对象类的时候，
 * 方式一：
 * 不用去修改工厂类，直接在工程中新建一个需要新增的对象和对应的工厂类。然后在客户端创建工厂类
 *
 * 方式二： 使用反射原理
 * 在新建号工厂类和对象类之后，直接修改 xml 文件，就可以调用新的对象类。完全不用对已有代码进行修改，符合 开闭原则
 */

public class LoggerClient {

    public static void main(String args[]) {
//        method_1();

//        method_2();

        method_3();
    }

    /**
     * 反射：在程序运行过程中获取已知名称的类，或已有对象的相关信息的一直机制。
     * 例：通过类名，生成实例对象，并返回
     *      Class c = Class.forName("String");
     *      Object o = c.newInstance();
     *      return o;
     */
    //利用反射原理
    private static void method_2() {
        LoggerFactory loggerFactory = (LoggerFactory) XMLUtil.getObject();
        Logger logger = loggerFactory.createLogger();
        logger.writeLog();
    }

    private static void method_1() {
        LoggerFactory loggerFactory;
        Logger logger;
        loggerFactory = new DataLoggerFactory();//可引入配置文件实现
        logger = loggerFactory.createLogger();
        logger.writeLog();
    }

    private static void method_3() {
        Logger logger;
        LoggerFactory loggerFactory;
        loggerFactory = (LoggerFactory) XMLUtil.getObject();
        loggerFactory.writeLogger();
    }
}
