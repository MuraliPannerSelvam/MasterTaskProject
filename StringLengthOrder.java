package com.onesoft.question.revision;

public class StringLengthOrder {
	public static void main(String[] args) {
		String word = "java is a programming language";
		String words[] = word.split(" ");
		String temp = "";
		for (int i = 0; i < words.length; i++) {
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].length() >= words[j].length()) {
					temp = words[i];
					words[i] = words[j];
					words[j] = temp;
				}
			}
		}
		String b = "";
		for (int i = 0; i < words.length; i++) {
			b = b + words[i] + " ";
		}
		System.out.println(b);
// Characters count using java 8	
		String a = "india is my country";
		long count = a.chars().count();
		System.out.println(count);
	}
}
