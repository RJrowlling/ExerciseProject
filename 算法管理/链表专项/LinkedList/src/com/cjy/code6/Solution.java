package com.cjy.code6;

/**
 * 给你两个单链表的头节点 headA 和 headB ，请你找出并返回两个单链表相交的起始节点。如果两个链表没有交点，返回 null 。
 * @author cjy
 * @version 1.0
 */
public class Solution {
    public static void main(String[] args) {
        ListNode Node1 = new ListNode(1);
        ListNode Node2 = new ListNode(2);
        ListNode Node3 = new ListNode(3);
        ListNode Node4 = new ListNode(4);

        Node1.next = Node2;
        Node2.next = Node3;
        Node3.next = Node4;

        Solution solution = new Solution();
        solution.getLength(Node1);
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengthA = getLength(headA);
        int lengthB = getLength(headB);
        ListNode currentA = headA;
        ListNode currentB = headB;
        if (lengthA > lengthB) {
            for (int i = 0; i < lengthA - lengthB; i++) {
                currentA = currentA.next;
            }
        }
        if (lengthA < lengthB) {
            for (int i = 0; i < lengthB - lengthA; i++) {
                currentB = currentB.next;
            }
        }

        while (currentA != currentB) {
            currentA = currentA.next;
            currentB = currentB.next;
        }
        return currentA;
    }

    public int getLength(ListNode current) {
        int length = 0;
        while (current != null) {
            length++;
            current = current.next;
        }
        System.out.println(length);
        return length;
    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}