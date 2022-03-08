package com.fenlon.www.reflect;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        Class cl = Class.forName("com.fenlon.www.reflect.User");
        System.out.println(cl);
    }
}

// 实体类
class User {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Alt + Insert 自动添加类方法
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
