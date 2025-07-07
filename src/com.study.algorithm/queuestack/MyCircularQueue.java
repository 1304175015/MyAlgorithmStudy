/**
 * 
 */
package com.study.algorithm.queuestack;

/**
 * @author 作者 :yjp
 * @version 创建时间 :2025年7月6日 上午10:54:42
 * @description
 * @version V1.0
 */
public class MyCircularQueue {

	/**
	 * @Title: main
	 * @author: yjp
	 * @date: 2025年7月6日 上午10:54:42
	 * @description:
	 */
	public static void main(String[] args) {

	}

	private int left, right, size, limit;
	private int[] queue;

	public MyCircularQueue(int k) {
		queue = new int[k];
		limit = k;
		this.left = 0;
		this.right = 0;
		this.size = 0;
	}

	public boolean enQueue(int value) {
		if (isFull()) {
			return false;
		} else {
			queue[right] = value;
			right = right == limit - 1 ? 0 : right + 1;
			size++;
			return true;
		}
	}

	public boolean deQueue() {
		if (isEmpty()) {
			return false;
		} else {
			left = left == limit - 1 ? 0 : left + 1;
			size--;
			return true;
		}
	}

	public int Front() {
		if (isEmpty()) {
			return -1;
		} else {
			return queue[left];
		}
	}

	public int Rear() {
		if (isEmpty()) {
			return -1;
		} else {
			int last = right == 0 ? limit - 1 : right - 1;
			return queue[last];
		}
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean isFull() {
		return size == limit;
	}
}
