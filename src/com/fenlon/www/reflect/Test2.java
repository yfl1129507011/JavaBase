package com.fenlon.www.reflect;

public class Test2 {
    static {
        System.out.println("Main类被加载");
    }

    public static void main(String[] args) throws ClassNotFoundException {
        // 主动引用
        /*Son son = new Son();
        System.out.println(Son.m);*/

        // 反射也会产生主动引用
        // Class.forName("com.fenlon.www.reflect.Son");

        // 不会产生类的引用的方法
        /*
         Main类被加载
        父类被加载
        2
        */
        //System.out.println(Son.b);
        /*
            子类被加载
            100
         */
        //System.out.println(Son.m);

        /*
        Main类被加载
         */
        // Son[] arr = new Son[5];

        /*
        Main类被加载
        38
         */
        System.out.println(Son.M);
    }
}

class Father {
    static int b = 2;
    static {
        System.out.println("父类被加载");
    }
}

class Son extends Father {
    static {
        System.out.println("子类被加载");
        m = 300;
    }

    static int m = 100;
    static final int M = 38;
}