package com.fenlon.www.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ClassInfo {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Class c1 = Class.forName("com.fenlon.www.reflect.User");
        
        // 获得类的名字
        System.out.println(c1.getName());  // com.fenlon.www.reflect.User
        System.out.println(c1.getSimpleName()); // User

        // 获得类得属性
        Field[] fields = c1.getFields(); // 获取public的属性
        Field[] declaredFields = c1.getDeclaredFields();  // 获取所有属性

        // 性能测试
        test1();
        test2();
        test3();
    }


    // 普通方法调用
    public static void test1() {
        User user = new User();

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            user.getName();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("普通方式执行10亿次："+(endTime-startTime)+"ms");
    }

    // 反射方式调用
    public static void test2() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        User user = new User();
        Class c1 = user.getClass();

        Method getName = c1.getDeclaredMethod("getName", null);

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            getName.invoke(user, null);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("反射方式执行10亿次："+(endTime-startTime)+"ms");
    }

    // 反射方式调用 关闭检测
    public static void test3() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        User user = new User();
        Class c1 = user.getClass();

        Method getName = c1.getDeclaredMethod("getName", null);
        getName.setAccessible(true);  // 关闭检测

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            getName.invoke(user, null);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("反射方式（关闭检测）执行10亿次："+(endTime-startTime)+"ms");
    }
}
