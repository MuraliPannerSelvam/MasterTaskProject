package com.onesoft.question.revision;

public class FIndMissingNumberRow {
	public static void main(String[] args) {
		int[] nums = { 1, 3, 5, 7, 9, 10 };
		int b = 0;
		for (int i = 0; i < nums[nums.length - 1]; i++) {
			if (i == nums[b]) {
				b++;
			} else {
				System.out.println(i);
			}
		}
	}

}
