/**
 * 
 */
package queuestack;

import java.util.Stack;

/**
 * @author 作者 :yjp
 * @version 创建时间 :2025年7月6日 上午11:24:22
 * @description
 * @version V1.0
 */
public class MinStack {

	private Stack<Integer> data;

	private Stack<Integer> min;

	public MinStack() {
		data = new Stack<Integer>();
		min = new Stack<Integer>();
	}

	public void push(int val) {
		data.push(val);
		if (min.empty() || val < min.peek()) {
			min.push(val);
		} else {
			min.push(min.peek());
		}
	}

	public void pop() {
		data.pop();
		min.pop();
	}

	public int top() {
		return data.peek();
	}

	public int getMin() {
		return min.peek();
	}
}
