package com.languo.javademo.设计模式.简单工厂模式;

/**
 * Created by Answer on 2017/11/8.
 */

public class ShapeClient {

    public static void main(String[] args) {
        Circle circle = (Circle) Shape.getShape("circle");
        circle.draw();
        circle.erase();
    }
}
