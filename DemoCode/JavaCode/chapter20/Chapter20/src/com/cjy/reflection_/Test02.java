package com.cjy.reflection_;

import java.lang.annotation.ElementType;
import java.util.Comparator;

/**
 * @author cjy
 * @version 1.0
 */
public class Test02 {
    public static void main(String[] args) {
        Class<Object> objectClass = Object.class;
        Class<Comparator> comparatorClass = Comparator.class;
        Class<String[]> aClass = String[].class;
        Class<ElementType> elementTypeClass = ElementType.class;
        Class<Override> overrideClass = Override.class;
        Class<Integer> integerClass = int.class;
        Class<Void> voidClass = void.class;

        System.out.println(objectClass);
        System.out.println(comparatorClass);
        System.out.println(aClass);
        System.out.println(elementTypeClass);
        System.out.println(overrideClass);
        System.out.println(integerClass);
        System.out.println(voidClass);

    }
}
