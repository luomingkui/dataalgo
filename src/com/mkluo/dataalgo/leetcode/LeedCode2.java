package com.mkluo.dataalgo.leetcode;

/**
 * @Description: 两数相加：https://blog.csdn.net/Luomingkui1109/article/details/90115965
 * @Author: luomingkui
 * @Date: Created in 下午3:55 2019/5/10
 * @Version: V1.0
 */

public class LeedCode2 {

    public static void main(String[] args) throws NullPointerException {
        //测试用例：2->3->4  5->6->4
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        // ListNode l1 = new ListNode(9);
        // ListNode l2 = new ListNode(1);
        // l2.next = new ListNode(9);
        // l2.next.next = new ListNode(9);
        // l2.next.next.next = new ListNode(9);
        // l2.next.next.next.next = new ListNode(9);
        // l2.next.next.next.next.next = new ListNode(9);
        // l2.next.next.next.next.next.next = new ListNode(9);
        // l2.next.next.next.next.next.next.next = new ListNode(9);
        // l2.next.next.next.next.next.next.next.next = new ListNode(9);
        // l2.next.next.next.next.next.next.next.next.next = new ListNode(9);
        LeedCode2 leedCode2 = new LeedCode2();
        ListNode resListNode = leedCode2.addTwoNumbers(l1, l2);
        //这里就打印了前三位
        System.out.println(resListNode.val + "->" + resListNode.next.val + "->" + resListNode.next.next.val);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;

            if (p != null){
                p = p.next;
            }
            if (q != null) {
                q = q.next;
            }
        }

        if (carry > 0) {
            curr.next = new ListNode(carry);
        }

        return dummyHead.next;

    }

}









