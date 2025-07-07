/**
 * 
 */
package com.study.algorithm.queuestack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author 作者 :yjp
 * @version 创建时间 :2025年7月6日 上午9:58:40
 * @description
 * @version V1.0
 */
public class MyQueueAndStack {

	/**
	 * @Title: main
	 * @author: yjp
	 * @date: 2025年7月6日 上午9:58:40
	 * @description: TODO
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	class MyQueue {
		public Stack<Integer> in;
		public Stack<Integer> out;

		/**
		 * 
		 */
		public MyQueue() {
			// TODO Auto-generated constructor stub
			this.in = new Stack<Integer>();
			this.out = new Stack<Integer>();
		}

		private void inToOut() {
			if (out.empty()) {
				while (!in.empty()) {
					out.push(in.pop());
				}
			}
		}

		/**
		 * @Title: push
		 * @author: yjp
		 * @date: 2025年7月6日 上午10:21:32
		 * @description: TODO
		 */
		private void push(int x) {
			// TODO Auto-generated method stub
			in.push(x);
		}

		/**
		 * @Title: pop
		 * @author: yjp
		 * @date: 2025年7月6日 上午10:21:53
		 * @description: TODO
		 */
		private int pop() {
			// TODO Auto-generated method stub
			inToOut();
			return out.pop();
		}

		/**
		 * @Title: peek
		 * @author: yjp
		 * @date: 2025年7月6日 上午10:23:01
		 * @description: TODO
		 */
		private int peek() {
			// TODO Auto-generated method stub
			inToOut();
			return out.peek();
		}

		/**
		 * @Title: empty
		 * @author: yjp
		 * @date: 2025年7月6日 上午10:22:22
		 * @description: TODO
		 */
		private boolean empty() {
			// TODO Auto-generated method stub
			return in.empty() && out.empty();
		}
	}

	class MyStack {
		private Queue<Integer> queue;

		/**
		 * 
		 */
		public MyStack() {
			// TODO Auto-generated constructor stub
			queue = new LinkedList<Integer>();
		}

		/**
		 * @Title: push
		 * @author: yjp
		 * @date: 2025年7月6日 上午10:32:39
		 * @description: TODO
		 */
		private void push(int x) {
			// TODO Auto-generated method stub
			int n = queue.size();
			queue.offer(x);
			for (int i = 0; i < n; i++) {
				queue.offer(queue.poll());
			}
		}

		/**
		 * @Title: pop
		 * @author: yjp
		 * @date: 2025年7月6日 上午10:39:26
		 * @description: TODO
		 */
		private int pop() {
			// TODO Auto-generated method stub
			return queue.poll();
		}

		/**
		 * @Title: peek
		 * @author: yjp
		 * @date: 2025年7月6日 上午10:39:46
		 * @description: TODO
		 */
		private int peek() {
			// TODO Auto-generated method stub
			return queue.peek();
		}

		/**
		 * @Title: empty
		 * @author: yjp
		 * @date: 2025年7月6日 上午10:40:06
		 * @description: TODO
		 */
		private boolean empty() {
			// TODO Auto-generated method stub
			return queue.isEmpty();
		}
	}
}
