package com.onesoft.question.revision;

public class RepeatedCounts {
	public static void main(String[] args) {
		String a = "onesofttechnologies";
		char[] a1 = a.toCharArray();
		for (int i = 0; i < a1.length; i++) {
			int count = 1;
			for (int j = i + 1; j < a1.length; j++) {
				if(a1[i]==a1[j]) {
					count++;
					a1[j]='0';
				}
			}
			if(count>1&&a1[i]!='0') {
				System.out.println(a1[i]+ " repeated "+ count+ " times ");
			}
		}
	}

}
