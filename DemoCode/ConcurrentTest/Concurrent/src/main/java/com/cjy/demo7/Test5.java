package com.cjy.demo7;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author cjy
 * @Date 2024/3/27 17:18
 * @Version 1.0
 * @Description:
 */
public class Test5 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

//        for (int i = 0; i < 20; i++) {
//            map.put(String.valueOf(i), UUID.randomUUID().toString().substring(0,5));
//            System.out.println(map);
//        }

//        for (int i = 0; i < 20; i++) {
//            int finalI = i;
//            new Thread(() -> {
//                map.put(String.valueOf(finalI), UUID.randomUUID().toString().substring(0,5));
////                System.out.println(map);
////            }).start();
//        }

//        Map<String, String> tempMap = Collections.synchronizedMap(map);
//        for (int i = 0; i < 20; i++) {
//            tempMap.put(String.valueOf(i), UUID.randomUUID().toString().substring(0,5));
//            System.out.println(tempMap);
//        }

        ConcurrentHashMap<String, String> ConcurrentHashMap = new ConcurrentHashMap<>();
        for (int i = 0; i < 20; i++) {
            int finalI = i;
            new Thread(() -> {
                ConcurrentHashMap.put(String.valueOf(finalI), UUID.randomUUID().toString().substring(0,5));
                System.out.println(ConcurrentHashMap);
            }).start();
        }
    }
}
