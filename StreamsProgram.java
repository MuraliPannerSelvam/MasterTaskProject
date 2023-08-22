package com.onesoft.question.revision;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsProgram {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2, 3, 7, 1, 9, 200, 21, 3, 17);

// Sorted Ascending Order		

		List<Integer> list1 = list.stream().sorted().collect(Collectors.toList());
		System.out.println(list1);

		List<Integer> list2 = list.stream().sorted((x, y) -> x - y).toList();
		System.out.println(list2);

// Sorted Descending Order

		List<Integer> list3 = list.stream().sorted(Comparator.comparing(Integer::intValue).reversed()).toList();
		System.out.println(list3);

		List<Integer> list4 = list.stream().sorted((x, y) -> y - x).toList();
		System.out.println(list4);

		List<Integer> list5 = list.stream().sorted(Comparator.reverseOrder()).distinct().toList();
		System.out.println(list5);

// Position 3 to 5 Only print	

		List<Integer> list6 = list.stream().skip(2).limit(3).toList();
		System.out.println(list6);

// Above 8 print the first number	

		int list7 = list.stream().filter(x -> x > 8).findFirst().get();
		System.out.println(list7);

// If 2 is there means that numbers are only print	

		List<Integer> list8 = list.stream().filter(x -> x.toString().startsWith("2")).toList();
		System.out.println(list8);

// If 2 is there means that numbers are only print

		List<Integer> list9 = list.stream().map(x -> String.valueOf(x)).filter(x -> x.startsWith("2"))
				.map(x -> Integer.valueOf(x)).sorted((x, y) -> y - x).toList();
		System.out.println(list9);

// Find Maximum Value

		int list10 = list.stream().max(Integer::compare).get();
		System.out.println("Maximum1 is " + list10);

		int list11 = list.stream().max((x, y) -> x - y).get();
		System.out.println("Maximum2 is " + list11);

		int list12 = list.stream().reduce((x, y) -> x > y ? x : y).get();
		System.out.println("Maximum3 is " + list12);

		long list13 = list.stream().collect(Collectors.summarizingInt(Integer::intValue)).getMax();
		System.out.println("Maximum4 is " + list13);

// Find Minimum Value

		int list14 = list.stream().min(Integer::compare).get();
		System.out.println("Minimum1 is " + list14);

		int list15 = list.stream().max((x, y) -> y - x).get();
		System.out.println("Minimum2 is " + list15);

		int list16 = list.stream().reduce((x, y) -> x < y ? x : y).get();
		System.out.println("Minimum3 is " + list16);

		long list17 = list.stream().collect(Collectors.summarizingInt(Integer::intValue)).getMin();
		System.out.println("Minimum4 is " + list17);

// Find Summing Value		

		int list18 = list.stream().reduce((x, y) -> x + y).get();
		System.out.println("Summing is " + list18);

		long list19 = list.stream().collect(Collectors.summarizingInt(Integer::intValue)).getSum();
		System.out.println("Summing is " + list19);

// Find Average

		double list20 = list.stream().collect(Collectors.summarizingInt(Integer::intValue)).getAverage();
		System.out.println("Average is " + list20);

// Find Count

		long list21 = list.stream().count();
		System.out.println("Count is " + list21);

		long list22 = list.stream().collect(Collectors.summarizingInt(Integer::intValue)).getCount();
		System.out.println("Count is " + list22);
		
		String a="india is my country";
		long b=a.chars().count();
		System.out.println(b);

	}
}
