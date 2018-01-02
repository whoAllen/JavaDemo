package com.languo.javademo.设计模式.抽象工厂模式.Skin;

import com.languo.javademo.设计模式.抽象工厂模式.Skin.Factory.SkinFactory;
import com.languo.javademo.设计模式.抽象工厂模式.Skin.Product.Button;
import com.languo.javademo.设计模式.抽象工厂模式.Skin.Product.TextView;

/**
 * Created by Answer on 2017/12/8.
 *
 * 假装是写一个换肤程序
 * 需要在设置之后直接更换系统的皮肤风格
 *
 */

public class Client {

    public static void main(String arg[]) {
        Button button;
        TextView textView;

        SkinFactory skinFactory = (SkinFactory) XMLUtil.getObject();
        button = skinFactory.createButton();
        textView = skinFactory.createTextView();

        button.display();
        textView.display();
    }

}
