/**
 * 
 */
package com.study.algorithm.sort;

import java.util.Arrays;

/**
 * @author 作者  :yjp
 * @version 创建时间 :2025年7月4日 上午9:58:19
 * @description 
 * @version V1.0   
 */
public class InsertSort {

	public static void main(String[] args) {
		int nums[] = {5, 1, 4, 2, 3};
		sort(nums);
		System.out.println(Arrays.toString(nums));
	}
	
	/**
	 * @Title: sort
	 * @author: yjp
	 * @date: 2025年7月4日 上午9:59:09
	 * @description: TODO
	 */
	private static void sort(int[] arr) {
		// TODO Auto-generated method stub
		if (arr == null || arr.length < 2) {
			return;
		}
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0 && arr[j] < arr[j-1]; j--) {
				swap(arr, j, j-1);
			}
		}
	}
	
	/**
	 * @Title: swap
	 * @author: yjp
	 * @date: 2025年7月4日 上午9:59:53
	 * @description: TODO
	 */
	private static void swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
