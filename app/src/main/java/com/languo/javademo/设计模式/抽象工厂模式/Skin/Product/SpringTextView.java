package com.languo.javademo.设计模式.抽象工厂模式.Skin.Product;

/**
 * Created by Answer on 2017/12/8.
 */

public class SpringTextView implements TextView {
    @Override
    public void display() {
        System.out.println("显示 Spring 文本框");
    }
}
