package com.languo.javademo.设计模式.单例模式一;

/**
 * Created by Answer on 2017/12/19.
 */

public class SingletonMain {

    public final static void main(String[] args) {

        //创建4个单例类
        LoadBalancer loadBalancer1 = LoadBalancer.getInstance();
        LoadBalancer loadBalancer2 = LoadBalancer.getInstance();
        LoadBalancer loadBalancer3 = LoadBalancer.getInstance();
        LoadBalancer loadBalancer4 = LoadBalancer.getInstance();

        if(loadBalancer1 == loadBalancer2 && loadBalancer1 == loadBalancer3 && loadBalancer1 == loadBalancer4) {
            System.out.println("这四个类是同一个类");
        }

        //增加 Activity
        loadBalancer1.addActivity("Activity 1");
        loadBalancer2.addActivity("Activity 2");
        loadBalancer3.addActivity("Activity 3");
        loadBalancer4.addActivity("Activity 4");

        //读取 Activity
        for (int i = 0; i < 10; i++) {
            System.out.println(loadBalancer1.getActivity());
        }
    }

}
