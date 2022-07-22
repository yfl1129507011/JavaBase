package com.fenlon.www.annotation;

public class InitDemo {

    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @InitMethod(age = 1)
    public void init() {
        System.out.println("init");
    }

    @Override
    public String toString() {
        return "InitDemo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
