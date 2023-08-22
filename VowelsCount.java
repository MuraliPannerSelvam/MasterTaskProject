package com.onesoft.question.revision;

import java.util.Arrays;
import java.util.List;

public class VowelsCount {
	public static void main(String[] args) {
		String word="I am the king of the jungle".toLowerCase();
		int count=1;
		for (int i = 0; i < word.length(); i++) {
			if(word.charAt(i)=='a'||word.charAt(i)=='e'||word.charAt(i)=='i'||word.charAt(i)=='o'||word.charAt(i)=='u') {
				count=count+1;
			}
		}
		System.out.println(count);
		
		
		long count1=word.chars().filter(i->i=='a'||i=='e'||i=='o'||i=='i'||i=='u').count();
		System.out.println(count1);
		
		long count2=Arrays.stream(word.split("")).filter(i->i.equals("a")||i.equals("e")||i.equals("i")||i.equals("o")||i.equals("u ")).count();
		System.out.println(count2);
		
		long count3=Arrays.stream(word.split("")).filter(character->"AEIOU".contains(character.toUpperCase())).count();
		System.out.println(count3);
	}

}
