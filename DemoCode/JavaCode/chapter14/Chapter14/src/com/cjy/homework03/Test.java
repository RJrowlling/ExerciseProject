package com.cjy.homework03;

import java.util.HashMap;
import java.util.Map;

/**
 * @author cjy
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Test {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("jack",650);
        map.put("tom",1200);
        map.put("smith",2900);
        map.replace("jack",2600);
        System.out.println(map.get("jack"));
        map.replace("jack",(int)(map.get("jack"))+100);
        map.replace("tom",(int)(map.get("tom"))+100);
        map.replace("smith",(int)(map.get("smith"))+100);


        System.out.println(map.keySet());
        System.out.println(map.values());
    }
}
