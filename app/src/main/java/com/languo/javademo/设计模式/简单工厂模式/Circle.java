package com.languo.javademo.设计模式.简单工厂模式;

/**
 * Created by Answer on 2017/11/8.
 */

public class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("绘制圆形");
    }

    @Override
    void erase() {
        System.out.println("擦除圆形");
    }
}
