package com.cjy.code2;

/**
 * 设计并实现自己的链表，单链表中的节点应该具备两个属性：
 * val 和 next 。val 是当前节点的值，next 是指向下一个节点的指针/引用。
 * @author cjy
 * @version 1.0
 */
public class MyLinkedList {
    int val;
    MyLinkedList next;
    MyLinkedList head = this;


    public MyLinkedList(int val) {
        this.val = val;
    }

    public int get(int index) {
        MyLinkedList current =
    }
}

class T {
    public static void main(String[] args) {
        MyLinkedList head = new MyLinkedList(10);
        head.next = new MyLinkedList(20);
        head.next.next = new MyLinkedList(30);
        head.next.next.next = new MyLinkedList(40);
    }
}


