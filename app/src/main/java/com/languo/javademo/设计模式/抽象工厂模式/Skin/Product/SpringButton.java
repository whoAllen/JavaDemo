package com.languo.javademo.设计模式.抽象工厂模式.Skin.Product;

import com.languo.javademo.设计模式.抽象工厂模式.Skin.Factory.SpringSkinFactory;

/**
 * Created by Answer on 2017/12/8.
 */

public class SpringButton implements Button{
    @Override
    public void display() {
        System.out.println("显示 Spring 按钮");
    }
}
