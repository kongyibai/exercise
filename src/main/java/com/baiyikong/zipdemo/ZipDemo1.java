package com.baiyikong.zipdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipDemo1 {
    public static void main(String[] args) throws IOException {
        //一个压缩文件，a文件夹和b.txt，a文件夹里面是a.txt
        //a文件夹和a.txt文件
        File fileA = new File("E:\\21.Solution\\a\\a");
        if(!fileA.exists()){
            fileA.mkdirs();
        }
        String fileName = "a.txt";
        File fileSrc = new File(fileA,fileName);
        FileOutputStream fileOutputStreamA = new FileOutputStream(fileSrc);
        byte[] aa = "请给我一首歌的时间".getBytes();
        fileOutputStreamA.write(aa);
        fileOutputStreamA.close();
        //b.txt
        File fileB = new File("E:\\21.Solution\\a\\b.txt");
        FileOutputStream fileOutputStreamB = new FileOutputStream(fileB);
        byte[] bb = "就像老鼠爱大米".getBytes();
        fileOutputStreamB.write(bb);
        fileOutputStreamB.close();

        //压缩流来了
        File src = new File("E:\\21.Solution\\a");
        File dest = new File("E:\\21.Solution","a.zip");
        FileOutputStream srcOut = new FileOutputStream(dest);
        ZipOutputStream zipOutputStream = new ZipOutputStream(srcOut);

        System.out.println(src.getName());
        toZip(src,zipOutputStream,src.getName(),1);
        zipOutputStream.close();

    }

    public static void toZip(File src,ZipOutputStream zos,String name,int count) throws IOException {
        //1.进入src文件夹
        File[] files = src.listFiles();
        //计数器判断第一层
        //2.遍历数组
        for (File file : files) {
            if(file.isFile()){
                //3.判断-文件，变成ZipEntry对象，放入到压缩包当中
                ZipEntry entry;
                if(count == 1){
                     entry = new ZipEntry(file.getName());
                }
                else{
                    entry = new ZipEntry(name + "\\" + file.getName());
                }
                zos.putNextEntry(entry);
                //读取文件中的数据，写到压缩包
                FileInputStream fis = new FileInputStream(file);
                int b;
                while((b = fis.read()) != -1){
                    zos.write(b);
                }
                fis.close();
                zos.closeEntry();
            }else{
                //4.判断-文件夹，递归
                count++;
                toZip(file,zos,file.getName(),count);
                count--;
                //     no1            aaa   \\   no1
            }
        }
    }
}
