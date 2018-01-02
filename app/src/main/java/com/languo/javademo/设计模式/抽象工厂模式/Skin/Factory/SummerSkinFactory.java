package com.languo.javademo.设计模式.抽象工厂模式.Skin.Factory;

import com.languo.javademo.设计模式.抽象工厂模式.Skin.Product.Button;
import com.languo.javademo.设计模式.抽象工厂模式.Skin.Product.SummerButton;
import com.languo.javademo.设计模式.抽象工厂模式.Skin.Product.SummerTextView;
import com.languo.javademo.设计模式.抽象工厂模式.Skin.Product.TextView;

/**
 * Created by Answer on 2017/12/8.
 */

public class SummerSkinFactory implements SkinFactory {
    @Override
    public Button createButton() {
        return new SummerButton();
    }

    @Override
    public TextView createTextView() {
        return new SummerTextView();
    }
}
