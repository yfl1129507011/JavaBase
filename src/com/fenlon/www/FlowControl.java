package com.fenlon.www;

import java.util.Scanner;

public class FlowControl {

    public static void testIf() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入姓名：");
        String name = scanner.nextLine();
        if (name.equals("exit")) {
            scanner.close();
            return;
        } else {
            System.out.println("Hello " + name);
        }

        System.out.println("请输入年龄：");
        int age = scanner.nextInt();
        if (age > 0 && age < 128) {
            System.out.println("你的年龄为：" + age + "岁");
        } else {
            System.out.println("年龄输入有误");
        }

        scanner.close();
    }

    public static void testFor() {
        for (int i = 1; i < 10; i++) {
            for (int i1 = 1; i1 <= i; i1++) {
                System.out.print(i + " * " + i1 + "= " + i*i1 + "\t");
            }
            System.out.println();
        }
    }

    public static void testSwitch() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入彩票号码：");
        int num = scanner.nextInt();
        switch (num) {
            case 8:
                System.out.println("恭喜你，获得三等奖！");
                break;
            case 88:
                System.out.println("恭喜你，获得二等奖！");
                break;
            case 888:
                System.out.println("恭喜你，获得一等奖！");
                break;
            default:
                System.out.println("谢谢参与！");
                break;
        }

        scanner.close();
    }

    public static void testForeach() {
        int[] numbers = {1, 2, 3, 4, 5};
        for (int x:numbers) {
            System.out.println(x);
        }
    }

    public static void testWhile() {
        int sum = 0;
        byte i = 1;
        while (i <= 100) {
            sum += i;
            i++;
        }
        System.out.println("1+2+3...+100="+sum);

        int num = 1, result = 0;
        do {
            result += num;
            num++;
        } while (num <= 1000);
        System.out.println("1+2+3...+1000="+result);
    }

    public static void main(String[] args) {
        // testFor();
        // testSwitch();
        // testForeach();
        testWhile();
    }
}
