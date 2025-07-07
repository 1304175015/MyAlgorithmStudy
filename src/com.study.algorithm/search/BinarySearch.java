/**
 * 
 */
package com.study.algorithm.search;

import java.util.Arrays;

/**
 * @author 作者 :yjp
 * @version 创建时间 :2025年7月4日 上午10:35:38
 * @description
 * @version V1.0
 */
public class BinarySearch {

	/**
	 * @Title: main
	 * @author: yjp
	 * @date: 2025年7月4日 上午10:35:38
	 * @description: TODO
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * System.out.println("测试开始"); int n = 100; int v = 10000; int testTime =
		 * 100000; for (int i = 0; i < testTime; i++) { int[] arr = randomArray(n, v);
		 * Arrays.sort(arr); int num = (int) Math.random() * v; if (binarySearch(arr,
		 * num) != forceSearch(arr, num)) { System.out.println("出错了!"); } }
		 * System.out.println("测试结束");
		 */

		System.out.println("测试开始");
		int n = 100;
		int v = 10000;
		int testTime = 100000;
		for (int i = 0; i < testTime; i++) {
			int[] arr = randomArray(n, v);
			Arrays.sort(arr);
			int num = (int) Math.random() * v;
			if (findRight(arr, num) != forceSearchRight(arr, num)) {
				System.out.println("出错了!");
			}
		}
		System.out.println("测试结束");
	}

	/**
	 * @Title: randomArray
	 * @author: yjp
	 * @date: 2025年7月4日 上午11:10:13
	 * @description: TODO
	 */
	private static int[] randomArray(int n, int v) {
		// TODO Auto-generated method stub
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * v) + 1;
		}
		return arr;
	}

	/**
	 * @Title: binarySearch
	 * @author: yjp
	 * @date: 2025年7月4日 上午11:16:08
	 * @description: TODO
	 */
	private static boolean binarySearch(int[] arr, int n) {
		// TODO Auto-generated method stub
		int left = 0, right = arr.length - 1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (arr[mid] == n) {
				return true;
			}
			if (arr[mid] > n) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return false;
	}

	/**
	 * @Title: forceSearch
	 * @author: yjp
	 * @date: 2025年7月4日 上午11:19:16
	 * @description: TODO
	 */
	private static boolean forceSearch(int[] arr, int n) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				return true;
			}
		}
		return false;
	}

	/**
	 * @Title: findLeft
	 * @author: yjp
	 * @date: 2025年7月4日 下午4:24:29
	 * @description: TODO
	 */
	private static int findLeft(int[] arr, int num) {
		// TODO Auto-generated method stub
		int left = 0, m = 0, right = arr.length - 1;
		int ans = -1;
		while (left <= right) {
			m = left + ((right - left) >> 1);
			if (arr[m] >= num) {
				ans = m;
				right = m - 1;
			} else {
				left = m + 1;
			}
		}
		return ans;
	}

	/**
	 * @Title: forceSearch
	 * @author: yjp
	 * @date: 2025年7月4日 上午11:19:16
	 * @description: TODO
	 */
	private static int forceSearchLeft(int[] arr, int n) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= n) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * @Title: findLeft
	 * @author: yjp
	 * @date: 2025年7月4日 下午4:24:29
	 * @description: TODO
	 */
	private static int findRight(int[] arr, int num) {
		// TODO Auto-generated method stub
		int left = 0, right = arr.length - 1, m = 0;
		int ans = -1;
		while (left <= right) {
			m = left + (right - left) >> 1;
			if (arr[m] <= num) {
				ans = m;
				left = m + 1;
			} else {
				right = m - 1;
			}
		}
		return ans;
	}

	/**
	 * @Title: forceSearch
	 * @author: yjp
	 * @date: 2025年7月4日 上午11:19:16
	 * @description: TODO
	 */
	private static int forceSearchRight(int[] arr, int n) {
		// TODO Auto-generated method stub
		for (int i = arr.length - 1; i > 0; i--) {
			if (arr[i] <= n) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * @Title: findPeak
	 * @author: yjp
	 * @date: 2025年7月4日 下午5:19:35
	 * @description: TODO
	 */
	private static int findPeak(int[] arr) {
		// TODO Auto-generated method stub
		if (arr.length == 1 || arr[0] > arr[1]) {
			return 0;
		}
		if (arr[arr.length - 1] > arr[arr.length - 2]) {
			return arr.length - 1;
		}
		int left = 1, right = arr.length - 2, m = 0;
		while (left <= right) {
			m = left + ((right - left) >> 1);
			if (arr[m - 1] > arr[m]) {
				right = m - 1;
			} else if (arr[m + 1] > arr[m]) {
				left = m + 1;
			} else {
				return m;
			}
		}
		return -1;
	}
}
