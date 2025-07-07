/**
 * 
 */
package com.study.algorithm.linked;

import linked.MyLinkedTest.ListNode;

/**
 * @author 作者 :yjp
 * @version 创建时间 :2025年7月5日 下午9:31:24
 * @description
 * @version V1.0
 */
public class AddTwoLinkedNum {

	/**
	 * @Title: main
	 * @author: yjp
	 * @date: 2025年7月5日 下午9:31:24
	 * @description: TODO
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		ListNode node6 = new ListNode(6);
		node1.next = node2;
		node2.next = node3;

		node4.next = node5;
		node5.next = node6;

		ListNode node = addTwoLinkedNum(node1, node4);
		MyLinkedTest.printLinkedList(node);
	}

	/**
	 * @Title: addTwoLinkedNum
	 * @author: yjp
	 * @date: 2025年7月5日 下午9:35:05
	 * @description: TODO
	 */
	private static ListNode addTwoLinkedNum(ListNode l1, ListNode l2) {
		// TODO Auto-generated method stub
		ListNode ans = null, cur = null;
		int carry = 0;
		for (int num, val; l1 != null
				|| l2 != null; l1 = l1 == null ? null : l1.next, l2 = l2 == null ? null : l2.next) {
			val = (l1 == null ? 0 : l1.value) + (l2 == null ? 0 : l2.value) + carry;
			num = val % 10;
			carry = val / 10;
			if (ans == null) {
				ans = new ListNode(num);
				cur = ans;
			} else {
				cur.next = new ListNode(num);
				cur = cur.next;
			}
		}
		if (carry != 0) {
			cur.next = new ListNode(carry);
		}
		return ans;
	}

}
