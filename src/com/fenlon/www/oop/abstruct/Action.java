package com.fenlon.www.oop.abstruct;

// 抽象类
/*
    不能实例化，只能被继承
 */
public abstract class Action {

    // 抽象方法
    public abstract void print();

    // 抽象类中的普通类
    public void add() {
        System.out.println("add");
    }
}
