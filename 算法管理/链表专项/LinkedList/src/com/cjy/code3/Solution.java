package com.cjy.code3;

/**
 * 给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
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

        reverseList(Node1);
    }

    //双指针解法
    public static ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode pre = null;
        ListNode temp;

        while (current != null) {
            temp = current.next;
            current.next = pre;
            pre = current;
            current = temp;

        }
        return pre;
    }

}

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
