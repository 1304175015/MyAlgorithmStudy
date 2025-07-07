/**
 * 
 */
package com.study.algorithm.sort;

import java.util.Arrays;

/**
 * @author 作者  :yjp
 * @version 创建时间 :2025年7月4日 上午9:44:12
 * @description 
 * @version V1.0   
 */
public class BubblingSort {

	public static void main(String[] args) {
		int nums[] = {5, 1, 4, 2, 3};
		bubblingSort(nums);
		System.out.println(Arrays.toString(nums));
	}
	
	/**
	 * @Title: bubblingSort
	 * @author: yjp
	 * @date: 2025年7月4日 上午9:48:29
	 * @description: TODO
	 */
	private static void bubblingSort(int[] arr) {
		// TODO Auto-generated method stub
		if (arr == null || arr.length < 2) {
			return;
		}
		for (int end = arr.length - 1; end > 0; end--) {
			for (int i = 0; i < end; i++) {
				if (arr[i] > arr[i+1]) {
					swap(arr, i, i+1);
				}
			}
		}
	}
	
	/**
	 * @Title: swap
	 * @author: yjp
	 * @date: 2025年7月4日 上午9:45:03
	 * @description: TODO
	 */
	private static void swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		arr[i] = arr[i] ^ arr[j];
		arr[j] = arr[i] ^ arr[j];
		arr[i] = arr[i] ^ arr[j];
	}
}
