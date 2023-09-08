package com.baiyikong.exceptiondemo;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        //学习异常体系的常用方法
        int[] arr = {1,2,3,45,7};

        try {
            System.out.println(arr[8]);
        }
        catch (IndexOutOfBoundsException iobe){
            iobe.printStackTrace();
        }
    }
}
