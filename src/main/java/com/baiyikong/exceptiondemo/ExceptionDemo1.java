package com.baiyikong.exceptiondemo;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        int[] arr = {1,23,45,1};

        try{
            System.out.println(arr[2]);
        }
        catch (RuntimeException e){
            System.out.println("运行时异常");
        }
        System.out.println("看看我执行了嘛？");

        try{
            System.out.println(arr[10]);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("数组越界异常");
        }
        catch (RuntimeException e){
            System.out.println("运行时异常");
        }
    }
}
