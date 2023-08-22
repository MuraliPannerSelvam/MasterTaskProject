package com.onesoft.question.revision;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayAscendingOrder {
	public static void main(String[] args) {
		int[] nums = { 2, 4, 5, 3, 1 };
		int temp = nums[0];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] > nums[j]) {
					temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
			System.out.println(nums[i]);
		}

		List<int[]> nums1 = Arrays.asList(nums);
		nums1.stream().sorted().forEach(System.out::println);

	}

}
