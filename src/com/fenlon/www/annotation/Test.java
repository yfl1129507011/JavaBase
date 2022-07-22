package com.fenlon.www.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class aClass = Class.forName("com.fenlon.www.annotation.InitDemo");
        Method[] methods = aClass.getMethods();
        if (methods != null) {
            for (Method method : methods) {
                boolean annotationPresent = method.isAnnotationPresent(InitMethod.class);
                //System.out.println(method.getName()+":"+annotationPresent);
                if (annotationPresent) {
                    method.invoke(aClass.getConstructor(null).newInstance(null), null);
                }
            }
        }
    }
}
