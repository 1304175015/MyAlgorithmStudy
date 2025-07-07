/**
 * 
 */
package com.study.algorithm.queuestack;

/**
 * @author 作者 :yjp
 * @version 创建时间 :2025年7月6日 下午12:32:11
 * @description
 * @version V1.0
 */
public class MyCircularDeque {

	private int[] data;
	private int left, right, size, limit;

	public MyCircularDeque(int k) {
		data = new int[k];
		left = 0;
		right = 0;
		size = 0;
		limit = k;
	}

	public boolean insertFront(int value) {
		if (isFull()) {
			return false;
		} else {
			if (size != 0) {
				left = left == 0 ? limit - 1 : left - 1;
			} else {
				left = right = 0;
			}
			data[left] = value;
			size++;
			return true;
		}
	}

	public boolean insertLast(int value) {
		if (isFull()) {
			return false;
		} else {
			if (size != 0) {
				right = right == limit - 1 ? 0 : right + 1;
			} else {
				left = right = 0;
			}
			data[right] = value;
			size++;
			return true;
		}
	}

	public boolean deleteFront() {
		if (isEmpty()) {
			return false;
		} else {
			left = left == limit - 1 ? 0 : left + 1;
			size--;
			return true;
		}
	}

	public boolean deleteLast() {
		if (isEmpty()) {
			return false;
		} else {
			right = right == 0 ? limit - 1 : right - 1;
			size--;
			return true;
		}
	}

	public int getFront() {
		if (isEmpty()) {
			return -1;
		} else {
			return data[left];
		}
	}

	public int getRear() {
		if (isEmpty()) {
			return -1;
		} else {
			return data[right];
		}
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean isFull() {
		return size == limit;
	}
}
