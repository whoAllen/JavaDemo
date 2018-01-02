package com.languo.javademo.设计模式.单例模式一;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Answer on 2017/12/19.
 *
 * 单例类
 *
 * 模拟 Activity 管理类
 *
 * 私有构造方法（不能让外部调用，保证本类的唯一性）
 * 静态方法 获取单例类（供外部类直接调用）
 *
 *
 */

public class LoadBalancer {

    //私有静态成员变量，存储唯一实例
    private static LoadBalancer loadBalancer;

    private List activityList;

    //私有构造函数
    private LoadBalancer() {
        activityList = new ArrayList();
    }

    //公有静态成员方法，返回唯一实例
    public static LoadBalancer getInstance() {
        if(loadBalancer == null) {
            loadBalancer = new LoadBalancer();
        }
        return loadBalancer;
    }

    //加入 Activity
    public void addActivity(String activity) {
        activityList.add(activity);
    }

    //删除 Activity
    public void deleteActivity(String activity) {
        activityList.remove(activity);
    }

    //随机获取 Activity
    public String getActivity() {
        Random random = new Random();
        int i = random.nextInt(activityList.size());
        return (String) activityList.get(i);
    }

}
