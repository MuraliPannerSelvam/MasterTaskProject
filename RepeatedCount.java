package com.onesoft.question.revision;

public class RepeatedCount {
	public static void main(String[] args) {
		String word="JAVA";
		int count=1;
		for (int i = 0; i < word.length(); i++) {
			for (int j = i+1; j < word.length(); j++) {
				if(word.charAt(i)==word.charAt(j)) {
					count++;
					break;
				}
				else {
					count=1;
				}
			}
			System.out.println(word.charAt(i)+ " is "+count + " times ");
		}
	}

}
