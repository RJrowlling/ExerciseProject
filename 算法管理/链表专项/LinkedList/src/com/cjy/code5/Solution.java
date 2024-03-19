package com.cjy.code5;

import org.junit.Test;

/**
 * @author cjy
 * @version 1.0
 */
public class Solution {
    public static void main(String[] args) {
        ListNode Node1 = new ListNode();
        ListNode Node2 = new ListNode();
        ListNode Node3 = new ListNode();
        ListNode Node4 = new ListNode();
        Node1.next = Node2;
        Node2.next = Node3;
        Node3.next = Node4;

        Test_link test_link = new Test_link();
        System.out.println(test_link.removeNthFromEnd(Node1, 1));
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

class Test_link {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;
        ListNode tempNode = head;
        while (tempNode != null) {
            length++;
            tempNode = tempNode.next;
        }

        int index = length - n;
        ListNode dummyHead = new ListNode();
        dummyHead.next = head;
        ListNode pre = dummyHead;
        ListNode current = head;
        for (int i = 0; i <= index; i++) {
            if (i == index) {
                pre.next = current.next;
                break;
            }
            pre = current;
            current = current.next;
        }
        return dummyHead.next;
    }
}