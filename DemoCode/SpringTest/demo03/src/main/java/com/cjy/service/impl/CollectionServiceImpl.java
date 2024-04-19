package com.cjy.service.impl;

import com.cjy.service.CollectionService;

import java.util.*;

/**
 * @Author cjy
 * @Date 2024/4/11 15:12
 * @Version 1.0
 * @Description: 集合注入
 */
public class CollectionServiceImpl implements CollectionService {
    private int[] array;
    private List<String> list;
    private Set<String> set;
    private Map<String,String> map;
    private Properties properties;

    public void setArray(int[] array) {
        this.array = array;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public void save() {
        System.out.println("CollectionService running ...");
        System.out.println("数组："+ Arrays.toString(array));
        System.out.println("列表："+list);
        System.out.println("集合："+set);
        System.out.println("map："+map);
        System.out.println("配置："+properties);
    }
}
