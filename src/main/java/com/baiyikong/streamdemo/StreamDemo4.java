package com.baiyikong.streamdemo;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo4 {
    /**
     * ### 2.6Stream流综合练习【应用】
     *
     * - 案例需求
     *
     *   现在有两个ArrayList集合，分别存储6名男演员名称和6名女演员名称，要求完成如下的操作
     *
     *   - 男演员只要名字为3个字的前三人
     *   - 女演员只要姓林的，并且不要第一个
     *   - 把过滤后的男演员姓名和女演员姓名合并到一起
     *   - 把上一步操作后的元素作为构造方法的参数创建演员对象,遍历数据
     *
     *   演员类Actor已经提供，里面有一个成员变量，一个带参构造方法，以及成员变量对应的get/set方法
     *
     * - 代码实现
     *
     *   演员类
     */

    public static void main(String[] args) {
        //创建集合
        ArrayList<String> manList = new ArrayList<String>();
        manList.add("周润发");
        manList.add("成龙");
        manList.add("刘德华");
        manList.add("吴京");
        manList.add("周星驰");
        manList.add("李连杰");

        ArrayList<String> womanList = new ArrayList<String>();
        womanList.add("林心如");
        womanList.add("张曼玉");
        womanList.add("林青霞");
        womanList.add("柳岩");
        womanList.add("林志玲");
        womanList.add("王祖贤");

        Stream<String> manListStream = manList.stream().filter(m -> m.length() == 3).limit(3);
        Stream<String> womanListStream = womanList.stream().filter(wm -> wm.charAt(0) == '林').skip(1);

        Stream<String> stream = Stream.concat(manListStream,womanListStream);
        stream.forEach(s -> {
            Actor actor = new Actor(s);
        });
    }
}
