/**
 * 
 */
package com.study.algorithm.linked;

import linked.MyLinkedTest.ListNode;

/**
 * @author 作者 :yjp
 * @version 创建时间 :2025年7月5日 上午10:57:00
 * @description 合并两个链表
 * @version V1.0
 */
public class MergeOrderdLinkedList {

	/**
	 * @Title: main
	 * @author: yjp
	 * @date: 2025年7月5日 上午10:57:00
	 * @description: TODO
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
	 * @Title: mergeLinkedList
	 * @author: yjp
	 * @date: 2025年7月5日 上午11:20:13
	 * @description: TODO
	 */
	private ListNode mergeLinkedList(ListNode head1, ListNode head2) {
		// TODO Auto-generated method stub
		if (head1 == null || head2 == null) {
			return head1 == null ? head2 : head1;
		}
		ListNode head = head1.value > head2.value ? head2 : head1;
		ListNode cur1 = head.next, cur2 = head == head1 ? head2 : head1;
		ListNode pre = head;
		while (cur1 != null && cur2 != null) {
			if (cur1.value > cur2.value) {
				pre.next = cur2;
				cur2 = cur2.next;
			} else {
				pre.next = cur1;
				cur1 = cur1.next;
			}
			pre = pre.next;
		}
		pre.next = cur1 == null ? cur2 : cur1;
		return null;
	}

}
