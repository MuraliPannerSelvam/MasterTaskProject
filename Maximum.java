package com.onesoft.question.revision;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Maximum {
	public static void main(String[] args) {
		Integer[] nums = { 10, 20, 34, 36, 75, 58 };
		int max = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > max) {
				max = nums[i];
			}
		}
		System.out.println("Maximum is " + max);
// Another method 		
		int c, b;
		b = nums.length;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i; j < nums.length; j++) {
				if (nums[i] > nums[j]) {
					c = nums[i];
					nums[i] = nums[j];
					nums[j] = c;
				}
			}
		}
		System.out.println("Maximum is " + nums[b - 1]);
// Using Stream maximum
		List<Integer> nums1 = Arrays.asList(nums);
		int maximum = nums1.stream().max(Integer::compare).get();
		System.out.println("Maximum is " + maximum);
// using reduce()	for max	
		Stream<Integer> numbers = Stream.of(10, 5, 8, 20, 3);
		Optional<Integer> max1 = numbers.reduce(Integer::max);
		max1.ifPresent(result -> System.out.println("Max: " + result));
// Using reduce() for sums	
		Stream<Integer> numbers1 = Stream.of(1, 2, 3, 4, 5);
        Optional<Integer> sum = numbers1.reduce((x, y) -> x + y);
        sum.ifPresent(result -> System.out.println("Sum: " + result));
	}
}
