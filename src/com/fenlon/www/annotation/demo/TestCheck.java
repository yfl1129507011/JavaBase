package com.fenlon.www.annotation.demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestCheck {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, IOException {
        Calc calc = new Calc();
        Class aClass = calc.getClass();
        Method[] methods = aClass.getMethods();

        int num = 0;
        BufferedWriter writer = new BufferedWriter(new FileWriter("bug.log"));
        for (Method method : methods) {
            if (method.isAnnotationPresent(Check.class)) {
                try {
                    Object invoke = method.invoke(calc);
                } catch (Exception e) {
                    num++;
                    writer.write("["+method.getName()+"]方法出现异常");
                    writer.newLine();
                    writer.write("异常名称："+e.getCause().getClass().getSimpleName());
                    writer.newLine();
                    writer.write("异常的原因："+e.getCause().getMessage());
                    writer.newLine();
                    writer.write("**************************");
                    writer.newLine();
                }
            }
        }

        writer.write("本次一共出现"+num+"次异常");
        writer.flush();
        writer.close();
    }
}
