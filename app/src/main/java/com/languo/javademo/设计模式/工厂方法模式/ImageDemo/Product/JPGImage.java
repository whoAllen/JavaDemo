package com.languo.javademo.设计模式.工厂方法模式.ImageDemo.Product;

import com.languo.javademo.设计模式.工厂方法模式.ImageDemo.Product.Image;

/**
 * Created by Answer on 2017/12/5.
 */

public class JPGImage extends Image {
    @Override
    public void writeImage() {
        System.out.println("输出 JPG 格式的图片");
    }
}
