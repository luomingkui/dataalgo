package com.mkluo.dataalgo.leetcode;

/**
 * @Description: 两数相加：https://blog.csdn.net/Luomingkui1109/article/details/90115965
 * @Author: luomingkui
 * @Date: Created in 下午3:55 2019/5/10
 * @Version: V1.0
 */

/**
 已完成
 执行用时: 0 ms
 输入
 [2,4,3]
 [5,6,4]
 输出
 [7,0,8]
 预期结果
 [7,0,8]
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class LeedCode2 {

    public static void main(String[] args) {
        LeedCode2 leedCode2 = new LeedCode2();
        ListNode l1 = new ListNode(243);
        ListNode l2 = new ListNode(564);
        ListNode listNode = leedCode2.addTwoNumbers(l1, l2);
        System.out.println(listNode.toString());

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







