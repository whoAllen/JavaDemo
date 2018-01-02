package com.languo.javademo.设计模式.工厂方法模式.ImageDemo;

import com.languo.javademo.设计模式.工厂方法模式.ImageDemo.Factory.ImageFactory;
import com.languo.javademo.设计模式.工厂方法模式.ImageDemo.Product.Image;

/**
 * Created by Answer on 2017/12/5.
 */

public class Client {

    public static void main(String[] args) {
        ImageFactory imageFactory;
        imageFactory = (ImageFactory) XMLUtil.getObject();
        imageFactory.writeImage();
    }
}
