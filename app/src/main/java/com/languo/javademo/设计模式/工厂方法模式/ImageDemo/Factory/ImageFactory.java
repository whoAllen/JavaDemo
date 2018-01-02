package com.languo.javademo.设计模式.工厂方法模式.ImageDemo.Factory;


import com.languo.javademo.设计模式.工厂方法模式.ImageDemo.Product.Image;

/**
 * Created by Answer on 2017/12/5.
 */

public abstract class ImageFactory {

   public abstract Image createImage();

   public void writeImage() {
       this.createImage().writeImage();
   }
}
