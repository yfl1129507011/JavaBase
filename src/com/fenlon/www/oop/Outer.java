package com.fenlon.www.oop;

public class Outer {
    public void out() {
        System.out.println("外部类方法");
    }

    // 定义内部类
    public class Inner {
        public void in() {
            System.out.println("内部类方法");
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.in();
    }
}

// java类中可以定义多个class
class AA {

}