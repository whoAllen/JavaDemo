package com.languo.javademo.设计模式.抽象工厂模式.Skin.Product;

/**
 * Created by Answer on 2017/12/8.
 *
 * 具体产品类：最终需要的对象
 *
 */

public class SummerButton implements Button {
    @Override
    public void display() {
        System.out.println("显示 Summer 按钮");
    }
}
