package com.fenlon.www;

public class Function {
    /*
     * 方法重载规则
     * 1. 方法名必须相同
     * 2. 参数列表必须不同（个数不同、类型不同、或参数排列顺序不同）
     * 3. 方法的返回类型可以相同也可以不同
     * 4。 仅仅返回类型不同不足以成为方法的重载
     */
    public static double max(double num1, double num2) {
        return num1 > num2 ? num1 : num2;
    }
    public static int max(int num1, int num2) {
        return num1 > num2 ? num1 : num2;
    }

    public static void main(String[] args) {
        double num = max(1, 3);
        System.out.println(num);  // 3.0
        int result = max(1, 3);
        System.out.println(result);  // 3

        /*
        问题： 错误: 编码 GBK 的不可映射字符 (0x82)
        解决：E:\Learn\Java\Code\Base\src\com\fenlon\www> javac -encoding UTF-8 Function.java
        E:\Learn\Java\Code\Base\src> java com.fenlon.www.Function a b c
         */
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
