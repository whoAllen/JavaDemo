package com.languo.javademo.设计模式.工厂方法模式.ImageDemo.Factory;


import com.languo.javademo.设计模式.工厂方法模式.ImageDemo.Product.Image;
import com.languo.javademo.设计模式.工厂方法模式.ImageDemo.Product.JPGImage;

/**
 * Created by Answer on 2017/12/5.
 */

public class JPGImageFactory extends ImageFactory {
    @Override
    public Image createImage() {
        return new JPGImage();
    }
}
