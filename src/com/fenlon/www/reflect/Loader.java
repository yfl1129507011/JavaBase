package com.fenlon.www.reflect;

public class Loader {
    public static void main(String[] args) throws ClassNotFoundException {
        // 获取系统类的加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);

        // 获取系统类加载器的父类加载器--》扩展类加载器
        ClassLoader parent = systemClassLoader.getParent();
        System.out.println(parent);

        // 获取扩展类加载器的父类加载器--》根加载器（c/c++）
        ClassLoader root = parent.getParent();
        System.out.println(root);

        ClassLoader classLoader = Class.forName("com.fenlon.www.reflect.Loader").getClassLoader();
        System.out.println(classLoader);
    }
}
