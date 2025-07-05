/**
 * 
 */
package linked;

import linked.MyLinkedTest.ListNode;

/**
 * @author 作者 :yjp
 * @version 创建时间 :2025年7月5日 下午10:01:42
 * @description
 * @version V1.0
 */
public class PartitionList {

	/**
	 * @Title: main
	 * @author: yjp
	 * @date: 2025年7月5日 下午10:01:42
	 * @description: TODO
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(4);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(2);
		ListNode node5 = new ListNode(5);
		ListNode node6 = new ListNode(2);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		ListNode head = partition(node1, 3);
	}

	public static ListNode partition(ListNode head, int x) {
		ListNode leftHead = null, leftTail = null, rightHead = null, rightTail = null, next = null;
		while (head != null) {
			next = head.next;
			head.next = null;
			if (head.value < x) {
				if (leftHead == null) {
					leftHead = head;
					leftTail = head;
				} else {
					leftTail.next = head;
					leftTail = leftTail.next;
				}
			} else {
				if (rightHead == null) {
					rightHead = head;
					rightTail = head;
				} else {
					rightTail.next = head;
					rightTail = rightTail.next;
				}
			}
			head = next;
		}
		if (leftTail == null) {
			return rightHead;
		}
		leftTail.next = rightHead;
		return leftHead;
	}
}
