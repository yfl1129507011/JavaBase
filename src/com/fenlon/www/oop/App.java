package com.fenlon.www.oop;

public class App {
    {
        System.out.println("匿名代码块");
    }

    // 只执行一次
    static {
        System.out.println("静态代码块");
    }

    public App() {
        System.out.println("构造方法");
    }

    public static void main(String[] args) {
        App app = new App();
        /* 输出如下：
            静态代码块
            匿名代码块
            构造方法
         */
        App app1 = new App();
        /* 输出如下：
            匿名代码块
            构造方法
         */


        Person person = new Person("fenlon");
        System.out.println(person.name);

        Student student = new Student();
        student.testStatic();  // Student-Static

        Person p = new Student();
        p.testStatic(); // Person-Static

        student.testOverride();  // Student-testOverride
        p.testOverride();  // Student-testOverride

        Student.testStatic();   // Student-Static
        Person.testStatic();   // Person-Static

        double num = 1000+19.31+21.36+11.6+328
                +12.92+8.9+34.92+37.7+231.34
                +517-411+49+411+38.64+32.3+437-12.5
                +484+15.5+70-393.99+414.99+33.2+14+60.82
                +168+500;

        try {
            System.out.println(num);
        } catch (ArithmeticException e) {
            System.out.println(0);
        } finally {
            System.out.println(-1);
        }

        // Ctrl + Alt + T
        try {
            System.out.println(1/0);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
    }
}
