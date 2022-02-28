package com.fenlon.www;

public class DataType {
    // 类变量
    static String className = "DataType";

    // 实例（对象）变量
    String name;
    int age;

    // 类（静态）常量
    static final double PI = 3.1415926;

    public static void main(String[] args) {
        System.out.println("打印类变量className=" + className);
        System.out.println("打印类（静态）常量PI=" + PI);
        DataType dt = new DataType();
        System.out.println("打印实例变量name=" + dt.name + "; age=" + dt.age);


        // 局部变量
        int i = 10;
        long num = 10_0000_0000L;
        System.out.println("打印局部变量num=" + num);

        // 局部常量
        final int DAY_HOURS = 24;
        System.out.println("打印局部常量DAY_HOURS=" + DAY_HOURS);

        // 数据类型隐式转换
        float money = 92323.27F;
        double price = money;  // 低数据类型转换为高数据类型
        System.out.println("打印数据类型隐式转换float money=" + money + "; double=" + price);

        // 数据类型强制转换
        int age = 128;
        byte age1 = (byte) age;  // 高数据类型转换为低数据类型
        System.out.println("打印数据类型强制转换int age=" + age + "; byte age1=" + age1);
    }
}
