package com.languo.javademo.设计模式.工厂方法模式.LoggerDemo;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

/**
 * Created by Answer on 2017/11/29.
 * xml 文件解析工具类
 *
 * 反射类时，需要全名（包括路径）
 */

public class XMLUtil {

    public static Object getObject() {
        try {
            //创建 Document 文档对象
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(new File("config.xml"));

            //获取包含类名的文本节点
            NodeList nodeList = document.getElementsByTagName("className");
            Node classNode = nodeList.item(0).getFirstChild();
            String cName = classNode.getNodeValue();

            System.out.print("NAME: " + cName);

            //通过类名生成实例对象并将其返回
            Class c = Class.forName("com.languo.javademo.设计模式.工厂方法模式.LoggerDemo." + cName);
            Object obj = c.newInstance();
            return obj;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
