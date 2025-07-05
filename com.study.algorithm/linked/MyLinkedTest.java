/**
 * 
 */
package linked;

/**
 * @author 作者 :yjp
 * @version 创建时间 :2025年7月5日 上午9:12:42
 * @description
 * @version V1.0
 */
public class MyLinkedTest {

	public static void main(String[] args) {
		/*
		 * ListNode node1 = new ListNode(1); ListNode node2 = new ListNode(2); ListNode
		 * node3 = new ListNode(3); ListNode node4 = new ListNode(4); ListNode node5 =
		 * new ListNode(5); ListNode node6 = new ListNode(6); node1.next = node2;
		 * node2.next = node3; node3.next = node4; node4.next = node5; node5.next =
		 * node6; ListNode head = reverseListNode(node1); printLinkedList(head);
		 */

		DoubleListNode node1 = new DoubleListNode(1);
		DoubleListNode node2 = new DoubleListNode(2);
		DoubleListNode node3 = new DoubleListNode(3);
		DoubleListNode node4 = new DoubleListNode(4);
		DoubleListNode node5 = new DoubleListNode(5);
		DoubleListNode node6 = new DoubleListNode(6);
		node1.next = node2;
		node2.pre = node1;
		node2.next = node3;
		node3.pre = node2;
		node3.next = node4;
		node4.pre = node3;
		node4.next = node5;
		node5.pre = node4;
		node5.next = node6;
		node6.pre = node5;
		DoubleListNode head = reverseDoubleListNode(node1);
		printDoubleLinkedList(head);
	}

	public static class ListNode {
		public int value;
		public ListNode next;

		public ListNode(int data) {
			this.value = data;
		}
	}

	/**
	 * @Title: printLinkedList
	 * @author: yjp
	 * @date: 2025年7月5日 上午9:16:14
	 * @description: TODO
	 */
	private static void printLinkedList(ListNode head) {
		// TODO Auto-generated method stub
		while (head != null) {
			System.out.print(head.value + "-->");
			head = head.next;
		}
	}

	/**
	 * @Title: reverseListNode
	 * @author: yjp
	 * @date: 2025年7月5日 上午9:13:34
	 * @description: TODO
	 */
	private static ListNode reverseListNode(ListNode head) {
		// TODO Auto-generated method stub
		ListNode pre = null, next = null;
		while (head != null) {
			next = head.next;
			head.next = pre;
			pre = head;
			head = next;
		}
		return pre;
	}

	public static class DoubleListNode {
		public int value;
		public DoubleListNode next;
		public DoubleListNode pre;

		public DoubleListNode(int data) {
			this.value = data;
		}
	}

	/**
	 * @Title: reverseDoubleListNode
	 * @author: yjp
	 * @date: 2025年7月5日 上午9:29:37
	 * @description: TODO
	 */
	private static DoubleListNode reverseDoubleListNode(DoubleListNode head) {
		// TODO Auto-generated method stub
		DoubleListNode pre = null, next = null;
		while (head != null) {
			next = head.next;
			head.next = pre;
			head.pre = next;
			pre = head;
			head = next;
		}
		return pre;
	}

	/**
	 * @Title: printLinkedList
	 * @author: yjp
	 * @date: 2025年7月5日 上午9:16:14
	 * @description: TODO
	 */
	private static void printDoubleLinkedList(DoubleListNode head) {
		// TODO Auto-generated method stub
		while (head != null) {
			System.out.print(head.value + "-->");
			head = head.next;
		}
	}
}
