package com.onesoft.question.revision;

import java.util.Iterator;

public class DuplicateRemove {
	public static void main(String[] args) {
		String word = "Malayalam".toLowerCase();
		char[] a = word.toCharArray();
		for (int i = 0; i < word.length(); i++) {
			for (int j = i + 1; j < word.length(); j++) {
				if (a[i] == a[j]) {
					System.out.print(a[j]);
				}
			}
		}

		String b = "abcd";
		String c = "cdef";
		String d = "";
		char[] g = b.toCharArray();
		char[] h = c.toCharArray();
		for (int i = 0; i < g.length; i++) {
			for (int j = 0; j < h.length; j++) {
				if (g[i] == h[j]) {
					d = d + g[i];
				}
			}
		}
		System.out.println("\n" + d);
	}

}
