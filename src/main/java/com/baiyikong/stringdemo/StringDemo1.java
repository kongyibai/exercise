package com.baiyikong.stringdemo;

public class StringDemo1 {
    public static void main(String[] args) {
        //1.定义字符串
        String str1 = "cccc";
        String str2 = "cccc";

        //2.旋转字符串方法

        //3.进行比较
        System.out.println(stringRotateCompare(str1, str2));
    }

    //该方法旋转字符串
    public static String stringRotate(String str) {
        //字符串截取方法
//        char c = str.charAt(0);
//        String substr = str.substring(1);
//        return  substr + c;
        //char数组方法
        char[] chars = str.toCharArray();
        char temp = chars[0];
        for (int i = 1; i < chars.length; i++) {
            chars[i - 1] = chars[i];
        }
        chars[chars.length - 1] = temp;
        return new String(chars);
    }

    public static boolean stringRotateCompare(String str1, String str2) {
        for (int i = 0; i < str1.length(); i++) {
            if (str1.equals(str2)) {
                return true;
            }
            str1 = stringRotate(str1);
        }
        return false;
    }
}
