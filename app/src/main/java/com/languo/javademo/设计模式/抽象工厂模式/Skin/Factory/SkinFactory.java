package com.languo.javademo.设计模式.抽象工厂模式.Skin.Factory;

import com.languo.javademo.设计模式.抽象工厂模式.Skin.Product.Button;
import com.languo.javademo.设计模式.抽象工厂模式.Skin.Product.TextView;

/**
 * Created by Answer on 2017/12/8.
 *
 * 抽象产品接口
 *
 * 定义了需要的产品等级结构
 *
 */

public interface SkinFactory {

    public Button createButton();

    public TextView createTextView();

}
