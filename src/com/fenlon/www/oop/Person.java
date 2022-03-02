package com.fenlon.www.oop;

// 在Java中所有的类都默认集成Object类
public class Person {
    String name = "person";

    // 定义有参构造函数, 则无参构造函数不会内部自动生成
    public Person(String name) {
        this.name = name;
    }

    public static void testStatic() {
        System.out.println("Person-Static");
    }

    public void testOverride() {
        System.out.println("Person-testOverride");
    }
}
