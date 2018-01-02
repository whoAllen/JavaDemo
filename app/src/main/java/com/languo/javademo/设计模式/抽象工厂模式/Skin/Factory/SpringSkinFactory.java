package com.languo.javademo.设计模式.抽象工厂模式.Skin.Factory;

import com.languo.javademo.设计模式.抽象工厂模式.Skin.Product.Button;
import com.languo.javademo.设计模式.抽象工厂模式.Skin.Product.SpringButton;
import com.languo.javademo.设计模式.抽象工厂模式.Skin.Product.SpringTextView;
import com.languo.javademo.设计模式.抽象工厂模式.Skin.Product.TextView;

/**
 * Created by Answer on 2017/12/8.
 *
 * 具体产品工厂
 *
 * 用于创建产品族
 *
 */

public class SpringSkinFactory implements SkinFactory {
    @Override
    public Button createButton() {
        return new SpringButton();
    }

    @Override
    public TextView createTextView() {
        return new SpringTextView();
    }
}
