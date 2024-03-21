package com.cjy.code7;

/**
 * 给定一个链表的头节点  head ，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。
 * <p>
 * 如果链表中有某个节点，可以通过连续跟踪 next 指针再次到达，则链表中存在环。 为了表示给定链表中的环，评测系统内部使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。如果 pos 是 -1，则在该链表中没有环。注意：pos 不作为参数进行传递，仅仅是为了标识链表的实际情况。
 * <p>
 * 不允许修改 链表。
 *
 * @author cjy
 * @version 1.0
 */
public class Solution {
    public static void main(String[] args) {
        ListNode Node1 = new ListNode(3);
        ListNode Node2 = new ListNode(2);
        ListNode Node3 = new ListNode(0);
        ListNode Node4 = new ListNode(4);

        Node1.next = Node2;


        System.out.println(detectCycle(Node1).val);
    }
    public static ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        do {
            try {
                fast = fast.next.next;
            } catch (Exception e) {
                return null;
            }
            slow = slow.next;
        } while (fast != slow);

        ListNode current = head;
        while (current != slow) {
            current = current.next;
            slow = slow.next;
        }
        return current;
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
