package com.cjy.homework01;

import java.util.ArrayList;

/**
 * @author cjy
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Test {
    public static void main(String[] args) {
        News news1 = new News("全国政协十四届二次会议举行闭幕会 习近平等党和国家领导人出席");
        News news2 = new News("周处除三害:传统典故的银幕新说");
        ArrayList arrayList = new ArrayList();
        arrayList.add(news1);
        arrayList.add(news2);
        for (int i = 0; i < arrayList.size(); i++) {
            int j = arrayList.size() - 1 - i;
            System.out.println(arrayList.get(j));
        }
    }
}
