/**
 * 
 */
package com.study.algorithm.sort;

import java.util.Arrays;

/**
 * @author 作者  :yjp
 * @version 创建时间 :2025年7月4日 上午9:24:49
 * @description 
 * @version V1.0   
 */
public class SelectionSort {

	/**
	 * @Title: main
	 * @author: yjp
	 * @date: 2025年7月4日 上午9:24:49
	 * @description: TODO
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("==========");
		int nums[] = {5, 1, 4, 2, 3};
        sort(nums);
        System.out.println(Arrays.toString(nums));
	}
	
	/**
	 * @Title: sort
	 * @author: yjp
	 * @date: 2025年7月4日 上午9:27:43
	 * @description: TODO
	 */
	private static void sort(int[] arr) {
		// TODO Auto-generated method stub
		if (arr == null || arr.length < 2) {
			return;
		}
		int length = arr.length;
		for (int min, i = 0; i < length; i++) {
			min = i;
			for (int j = i + 1; j < length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			swap(arr, min, i);
		}
	}
	
	/**
	 * @Title: swap
	 * @author: yjp
	 * @date: 2025年7月4日 上午9:26:34
	 * @description: TODO
	 */
	private static void swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
