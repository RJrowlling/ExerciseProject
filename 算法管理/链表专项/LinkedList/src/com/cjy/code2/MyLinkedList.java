package com.cjy.code2;

import java.util.LinkedList;

/**
 * 设计并实现自己的链表，单链表中的节点应该具备两个属性：
 * val 和 next 。val 是当前节点的值，next 是指向下一个节点的指针/引用。
 * @author cjy
 * @version 1.0
 */
//采用虚拟头结点
public class MyLinkedList {
    class Node {
        int val;
        Node next;
        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    int size;
    Node dummyHead;

    public MyLinkedList() {
        size = 0;
        dummyHead = new Node(0);
    }

    public int get(int index) {
        if (index<0 || index >= size) {
            return -1;
        }

        Node current = dummyHead;
        int i = 0;
        while (true) {
            if (index == i) {
                return current.next.val;
            }
            i++;
            current = current.next;
        }
    }

    public void addAtHead(int val) {
        Node node = new Node(val);
        node.next = dummyHead.next;
        dummyHead.next = node;
        size++;
    }

    public void addAtTail(int val) {
        Node node = new Node(val);

        Node current = dummyHead;
        while (current.next != null) {
            current = current.next;
        }
        current.next = node;
        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index<0 || index >size ) {
            return;
        }
        if (index == size) {
            addAtTail(val);
            return;
        }

        Node node = new Node(val);
        Node current = dummyHead;
        int i = 0;
        while (true) {
            if (i == index) {
                node.next = current.next;
                current.next = node;
                size++;
                return;
            }
            current = current.next;
            i++;
        }
    }

    public void deleteAtIndex(int index) {
        if (index<0 || index >= size) {
            return;
        }
        Node current = dummyHead;
        int i = 0;
        while (true) {
            if (index == i) {
                current.next = current.next.next;
                size--;
                return;
            }
            i++;
            current = current.next;
        }
    }
}

class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(5);
        myLinkedList.addAtIndex(1, 2);
        myLinkedList.get(1);
        myLinkedList.addAtHead(6);
        myLinkedList.addAtTail(2);
        myLinkedList.get(3);
        myLinkedList.addAtTail(1);
        myLinkedList.get(5);
        myLinkedList.addAtHead(2);
        myLinkedList.get(2);
        myLinkedList.addAtHead(6);
    }
}


