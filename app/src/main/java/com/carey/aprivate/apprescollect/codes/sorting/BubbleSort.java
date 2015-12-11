package com.carey.aprivate.apprescollect.codes.sorting;

import java.util.ArrayList;
import java.util.List;

/**
 * 冒牌排序
 * Created by LiuJie on 2015/9/8.
 */
public class BubbleSort {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        List<String> list = new ArrayList<String>();
        list.add("0");
        list.add("2");
        list.add("10");
        list.add("13");
        list.add("15");
        list.add("24");
        list.add("7");
        list.add("5");
        list.add("3");
        list.add("1");
        list.add("20");
        getSorting(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static List<String> getSorting(List<String> contents) {
        for (int i = 0; i < contents.size(); i++) {
            for (int j = i + 1; j < contents.size(); j++) {
                if (Integer.valueOf(contents.get(i)) > Integer.valueOf(contents.get(j))) {
                    String str1 = contents.get(j);
                    contents.set(j, contents.get(i));
                    contents.set(i, str1);
                }
            }
        }
        return contents;
    }
}
