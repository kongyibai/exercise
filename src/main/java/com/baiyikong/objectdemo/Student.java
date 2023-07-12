package com.baiyikong.objectdemo;

public class Student {
    private String name;
    private static String teacherName;


    public Student() {
    }

    public Student(String name, String teacherName) {
        this.name = name;
        this.teacherName = teacherName;
    }

    /**
     * 获取
     * @return teacherName
     */
    public static String getTeacherName() {
        return teacherName;
    }

    /**
     * 设置
     * @param teacherName
     */
    public static void setTeacherName(String teacherName) {
        Student.teacherName = teacherName;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Student{name = " + name + ", teacherName = " + teacherName + "}";
    }
}
