package com.fenlon.www.oop;

public class Student extends Person{
    String name = "Student";

    public Student() {
        super("name"); // 调用父类构造方法
    }

    public static void testStatic() {
        System.out.println("Student-Static");
    }

    @Override
    public void testOverride() {
        System.out.println("Student-testOverride");
    }
}
