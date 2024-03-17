package com.cjy.code4;

/**
 * 给你一个链表，两两交换其中相邻的节点，并返回交换后链表的头节点。你必须在不修改节点内部的值的情况下完成本题
 * （即，只能进行节点交换）。
 * @author cjy
 * @version 1.0
 */
public class Solution {
    public static void main(String[] args) {

    }

    public ListNode swapPairs(ListNode head) {
        ListNode dummyHead = new ListNode();
        dummyHead.next = head;
        ListNode current = dummyHead;

        while (current.next != null && current.next.next != null) {
            ListNode temp = current.next;
            ListNode temp2 = current.next.next.next;
            current.next = current.next.next;
            current.next.next = temp;
            temp.next = temp2;

            current = current.next.next;
        }
        return dummyHead.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
