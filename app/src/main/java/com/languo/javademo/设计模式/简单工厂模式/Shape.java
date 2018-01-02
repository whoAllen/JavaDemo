package com.languo.javademo.设计模式.简单工厂模式;

/**
 * Created by Answer on 2017/11/8.
 */

public abstract class Shape {

    abstract void draw();

    abstract void erase();

    public static Shape getShape(String type) {
        if(type.equals("circle")) {
            System.out.println("创建圆形");
            return new Circle();
        } else if(type.equals("rectangle")) {
            System.out.println("创建矩形");
            return new Rectangle();
        } else {
            //TODO:错误类
            return null;
        }
    }
}
