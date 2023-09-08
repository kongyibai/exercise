package com.baiyikong.exceptiondemo;

public class ExceptionDemo3 {
    public static void main(String[] args) {
        //练习使用throw和throws,使用位置和作用都是不同的
        //throws 方法定义处，可能出现哪些异常  throw 在方法里面，手动抛出异常，下面的代码就不再执行了


        int[] arr = {1,23,4};
        int a = 5;
        int b = 5;

        int result = addNum(a, b);
        System.out.println(result);
    }

    public static int addNum(int a,int b) throws RuntimeException{
        if((a+b)==10){
            throw new RuntimeException();
        }
        return a+b;
    }
}
