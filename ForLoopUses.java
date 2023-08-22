package com.onesoft.question.revision;

public class ForLoopUses {
	public static void main(String[] args) {
		for (int i = 5; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}

		for (int i = 5; i > 0; i--) {
			for (int j = i; i > 0; j--) {
				System.out.println(i);
			}
			System.out.println();
		}
	}
}
