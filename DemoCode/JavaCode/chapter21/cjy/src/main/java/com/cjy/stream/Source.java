package com.cjy.stream;

import lombok.val;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author cjy
 * @version 1.0
 */
public class Source {
    private static List<Author> getAuthors() {
        //数据初始化
        Author author = new Author(1L, "蒙多", 33, "一个从菜刀中明悟哲理的祖安人", null);
        Author author2 = new Author(2L, "亚拉索", 15, "狂风也追逐不上他的思考速度", null);
        Author author3 = new Author(3L, "易", 14, "是这个世界在限制他的思维", null);
        Author author4 = new Author(3L, "易", 14, "是这个世界在限制他的思维", null);

        //书籍列表
        List<Book> books1 = new ArrayList();
        List<Book> books2 = new ArrayList();
        List<Book> books3 = new ArrayList();

        books1.add(new Book(1L, "刀的两侧是光明与黑暗", "哲学,爱情", 88, "用一把刀划分了爱恨"));
        books1.add(new Book(2L, "一个人不能死在同一把刀下", "个人成长,爱情", 99, "讲述如何从失败中明悟真理"));

        books2.add(new Book(3L, "那风吹不到的地方", "哲学", 85, "带你用思维去领略世界的尽头"));
        books2.add(new Book(3L, "那风吹不到的地方", "哲学", 85, "带你用思维去领略世界的尽头"));
        books2.add(new Book(4L, "吹或不吹", "爱情,个人传记", 56, "一个哲学家的恋爱观注定很难把他所在的时代理解"));

        books3.add(new Book(5L, "你的剑就是我的剑", "爱情", 56, "无法想象一个武者能对他的伴侣这么的宽容"));
        books3.add(new Book(6L, "风与剑", "个人传记", 100, "两个哲学家灵魂和肉体的碰撞会激起怎么样的火花呢？"));
        books3.add(new Book(6L, "风与剑", "个人传记", 100, "两个哲学家灵魂和肉体的碰撞会激起怎么样的火花呢？"));

        author.setBooks(books1);
        author2.setBooks(books2);
        author3.setBooks(books3);
        author4.setBooks(books3);

        List<Author> authorList = new ArrayList(Arrays.asList(author, author2, author3, author4));
        return authorList;
    }

    public static void main(String[] args) {
//        test01();
//        test02();
//        test03();
//        test04();
//        test05();
//        test06();
//        test07();
//        test08();
//        test09();
//        test10();
//        test11();
//        test12();
//        test13();
//        test14();
//        test15();
//        test16();
//        test17();
//        test18();
//        test19();
        test20();




    }

    private static void test20() {

    }

    private static void test19() {
        List<Author> authors = getAuthors();
        Integer reduce = authors.stream()
                .distinct()
                .map(author -> author.getAge())
                .reduce(0, (integer, integer2) -> integer + integer2);
        System.out.println(reduce);
    }

    private static void test18() {
        List<Author> authors = getAuthors();
        Optional<Author> first = authors.stream()
                .distinct()
                .sorted((o1, o2) -> o1.getAge() - o2.getAge())
                .findFirst();
        System.out.println(first);
    }

    private static void test17() {
        List<Author> authors = getAuthors();
        Optional<Author> someOne = authors.stream()
                .distinct()
                .filter(author -> author.getAge() > 18)
                .findAny();
        System.out.println(someOne);
    }

    private static void test16() {
        List<Author> authors = getAuthors();
        boolean b = authors.stream()
                .distinct()
                .allMatch(author -> author.getAge() >= 18);
        System.out.println(b);
    }

    private static void test15() {
        List<Author> authors = getAuthors();
        boolean b = authors.stream()
                .distinct()
                .anyMatch(author -> author.getAge() > 29);
        System.out.println(b);
    }

    private static void test14() {
        List<Author> authors = getAuthors();
        List<Author> list = authors.stream()
                .collect(Collectors.toList());

        Set<Author> set = authors.stream()
                .collect(Collectors.toSet());

        Map<String, List<Book>> map = authors.stream()
                .distinct()
                .collect(Collectors.toMap(author -> author.getName(), author  -> author.getBooks()));
        System.out.println(map);

    }

    private static void test13() {
        List<Author> authors = getAuthors();
        Optional<Book> max = authors.stream()
                .distinct()
                .flatMap(author -> author.getBooks().stream())
                .max(new Comparator<Book>() {
                    @Override
                    public int compare(Book o1, Book o2) {
                        return o1.getScore() - o2.getScore();
                    }
                });
        System.out.println(max.get());

        Optional<Book> min = authors.stream()
                .distinct()
                .flatMap(author -> author.getBooks().stream())
                .min((o1, o2) -> o1.getScore() - o2.getScore());
        System.out.println(min.get());
    }

    private static void test12() {
        List<Author> authors = getAuthors();
        long count = authors.stream()
                .distinct()
                .flatMap(author -> author.getBooks().stream())
                .map(book -> book.getName())
                .distinct()
                .count();
        System.out.println(count);
    }

    private static void test11() {
        List<Author> authors = getAuthors();
        authors.stream()
                .distinct()
                .flatMap(author -> author.getBooks().stream())
                .distinct()
                .flatMap(book -> Arrays.stream(book.getCategory().split(",")))
                .distinct()
                .forEach(name -> System.out.println(name));


    }

    private static void test10() {
        List<Author> authors = getAuthors();
        authors.stream()
                .distinct()
                .flatMap( author -> author.getBooks().stream())
                .distinct()
                .forEach(book -> System.out.println(book.getName()));
    }

    private static void test09() {
        List<Author> authors = getAuthors();
        authors.stream()
                .distinct()
                .sorted((author1, author2) -> author2.getAge() - author1.getAge())
                .skip(1)
                .forEach(author -> System.out.println(author.getName()));
    }

    private static void test08() {
        List<Author> authors = getAuthors();
        authors.stream()
                .distinct()
                .sorted((o1, o2) -> o2.getAge() - o1.getAge())
                .limit(2)
                .forEach(author -> System.out.println(author.getName()));
    }

    private static void test07() {
        List<Author> authors = getAuthors();
        authors.stream()
                .distinct()
                .map(author -> author.getAge())
                .sorted((o1, o2) -> o2 - o1)
                .forEach(age -> System.out.println(age));
    }

    private static void test06() {
        List<Author> authors = getAuthors();
        authors.stream()
                .distinct()
                .map(author -> author.getName())
                .forEach(name -> System.out.println(name));
    }

    private static void test05() {
        List<Author> authors = getAuthors();
        authors.stream()
                .map(author -> author.getName())
                .forEach(name -> System.out.println(name));
    }

    private static void test04() {
        List<Author> authors = getAuthors();
        authors.stream()
                .filter(author -> author.getName().length() > 1)
                .forEach(author -> System.out.println(author.getName()));
    }

    private static void test03() {
        HashMap<Object, Object> map = new HashMap<>();
        map.put("蜡笔小新", 19);
        map.put("黑子", 17);
        map.put("日向翔阳", 16);
        Stream<Map.Entry<Object, Object>> stream2 = map.entrySet().stream();
    }

    private static void test02() {

        int[] arr = {1, 2, 3, 4, 5};
        IntStream stream1 = Arrays.stream(arr);
        Stream<int[]> arr1 = Stream.of(arr);
    }

    private static void test01() {
        List<Author> authors = getAuthors();
        Stream<Author> stream = authors.stream();
    }
}
