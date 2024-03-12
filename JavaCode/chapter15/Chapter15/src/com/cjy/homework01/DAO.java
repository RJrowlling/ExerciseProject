package com.cjy.homework01;

import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/**
 * @author cjy
 * @version 1.0
 */
public class DAO<T> {
    HashMap<String,T> map = new HashMap<>();

    public void save(String id,T entity) {
        map.put(id,entity);
    }

    public T get(String id) {
        return map.get(id);
    }

    public void update(String id,T entity) {
        map.replace(id,entity);
    }

    public HashSet<T> list() {
        HashSet<T> ts = new HashSet<>();
        Iterator<Map.Entry<String, T>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, T> next = iterator.next();
            ts.add(next.getValue());
        }
        return ts;
    }

    public void delete(String id) {
        map.remove(id);
    }
}

class T {
    @Test
    public void test() {
        DAO<Object> dao = new DAO<>();
        dao.save("1",new User(1,23,"陈俊宇"));
        dao.save("2",new User(2,23,"小明"));
        System.out.println(dao.list());

        System.out.println(dao.get("1"));

        dao.update("2",new User(2,24,"小红"));
        System.out.println(dao.list());

        dao.delete("2");
        System.out.println(dao.list());

    }
}

