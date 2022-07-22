package com.fenlon.www.annotation;

import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.TYPE})   // 元注解：给方法加注解
@Retention(RetentionPolicy.RUNTIME)  // 元注解： 运行时执行注解
@Documented  // 注解抽取到api文档中
@Inherited  // 注解被子类继承
public @interface InitMethod {
    int age();
    String name() default "yfl";

    String[] strs() default {"a"};
}
