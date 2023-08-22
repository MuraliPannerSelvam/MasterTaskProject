package com.onesoft.question.revision;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamIntegerSum {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 20, 30, 10, 25, 35);
		int sum = list.stream().collect(Collectors.summingInt(Integer::intValue));
		System.out.println("Summing Integer are = " + sum);

		List<String> word = Arrays.asList("Murali", "", "Vijay", "Murali", "", "Yadhav");
		List<String> words = word.stream().filter(x -> !x.equals("")).collect(Collectors.toList());
		System.out.println(words);
		words.forEach(x -> System.out.println(x));
		
	}
}
