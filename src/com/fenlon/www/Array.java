package com.fenlon.www;

import java.util.Arrays;

public class Array {

    public static int[] reverseArray(int[] array) {
        int len = array.length;
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            result[len-1-i] = array[i];
        }
        return result;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        // 数组定义和初始化
        /*int[] nums;
        nums = new int[10];

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]); // 0
        }*/

        // 数组静态初始化
        /*int[] a = {1, 2, 3, 4, 5};
        for (int i : a) {
            System.out.println(i);
        }
        int[] aa = reverseArray(a);
        printArray(aa);*/

        // 数组动态初始化
        int[] b = new int[10];

        int[] data = {2, 21, 23, 12, 5, 67, 32, 89, 11, 22, 8};
        System.out.println(Arrays.toString(data));
        int[] sortData = bubbleSort(data);
        System.out.println(Arrays.toString(sortData));
    }

    public static int[] bubbleSort(int[] data) {
        int times = data.length - 1;  // 循环比较的次数
        while (times > 0) {
            boolean isSort = true;
            for (int i = 0; i < times; i++) {
                if (data[i] > data[i+1]) {
                    isSort = false;
                    int temp = data[i];
                    data[i] = data[i+1];
                    data[i+1] = temp;
                }
            }
            if (isSort) {  // 代表初始data就是排序好的
                break;
            }
            times--;
        }
        return data;
    }
}
