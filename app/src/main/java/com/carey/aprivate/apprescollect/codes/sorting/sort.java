package com.carey.aprivate.apprescollect.codes.sorting;


import net.sourceforge.pinyin4j.PinyinHelper;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

/**
 * Created by LiuJie on 2015/9/11.
 */
public class sort {
    public static void main(String[] strs) {
        List<String> list1 = new ArrayList<String>();
        list1.add("女子足球小组赛9场");
        list1.add("男子足球小组赛9场");
        list1.add("男子足球小组赛10场");
        list1.add("男子足球小组赛8场");
        list1.add("女子足球小组赛10场");
        list1.add("男子足球小组赛13场");
        list1.add("男子足球小组赛12场");
        list1.add("男子足球小组赛10场");
        list1.add("女子足球小组赛8场");
        list1.add("男子足球小组赛11场");
        list1.add("男子足球小组赛5场");
        List<String> list2 = new ArrayList<String>();
        list2.add("女子足球小组赛9场");
        list2.add("男子足球小组赛9场");
        list2.add("男子足球小组赛10场");
        list2.add("男子足球小组赛8场");
        list2.add("女子足球小组赛10场");
        list2.add("男子足球小组赛13场");
        list2.add("男子足球小组赛12场");
        list2.add("男子足球小组赛10场");
        list2.add("女子足球小组赛8场");
        list2.add("男子足球小组赛11场");
        list2.add("男子足球小组赛5场");
        List<String> list3 = new ArrayList<String>();
        list3.add("女子足球小组赛9场");
        list3.add("男子足球小组赛9场");
        list3.add("男子足球小组赛10场");
        list3.add("男子足球小组赛8场");
        list3.add("女子足球小组赛10场");
        list3.add("男子足球小组赛13场");
        list3.add("男子足球小组赛12场");
        list3.add("男子足球小组赛10场");
        list3.add("女子足球小组赛8场");
        list3.add("男子足球小组赛11场");
        list3.add("男子足球小组赛5场");
        System.out.println(Arrays.toString(list1.toArray()));
        Comparator com = Collator.getInstance(Locale.CHINA);
        Collections.sort(list1);
        Collections.sort(list2, Collator.getInstance(Locale.CHINA));
        Collections.sort(list3, Collections.reverseOrder());
        System.out.println(Arrays.toString(list1.toArray()));
        System.out.println(Arrays.toString(list2.toArray()));
        System.out.println(Arrays.toString(list3.toArray()));
    }

    /**
     * 汉字按照拼音排序的比较器
     *
     * @author KennyLee 2009-2-23 10:08:59
     */
    public static class PinyinComparator implements Comparator<Object> {
        public int compare(Object o1, Object o2) {
            char c1 = ((String) o1).charAt(0);
            char c2 = ((String) o2).charAt(0);
            return concatPinyinStringArray(PinyinHelper.toHanyuPinyinStringArray(c1)).compareTo(concatPinyinStringArray(PinyinHelper.toHanyuPinyinStringArray(c2)));
        }

        private String concatPinyinStringArray(String[] pinyinArray) {
            StringBuffer pinyinSbf = new StringBuffer();
            if ((pinyinArray != null) && (pinyinArray.length > 0)) {
                for (int i = 0; i < pinyinArray.length; i++) {
                    pinyinSbf.append(pinyinArray[i]);
                }
            }
            return pinyinSbf.toString();
        }
    }
}
