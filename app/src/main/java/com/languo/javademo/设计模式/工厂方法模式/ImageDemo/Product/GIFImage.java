package com.languo.javademo.设计模式.工厂方法模式.ImageDemo.Product;

/**
 * Created by Answer on 2017/12/5.
 */

public class GIFImage extends Image {
    @Override
    public void writeImage() {
        System.out.println("输出 GIF 格式的图片");
    }
}
