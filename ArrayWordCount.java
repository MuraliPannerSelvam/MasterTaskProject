package threads;

import java.util.LinkedHashMap;

public class ArrayWordCount {
	public static void main(String[] args) {
		int[] nums = {10,25,30,25,10};
		
		LinkedHashMap<Integer, Integer> number = new LinkedHashMap<>();
		
		for(Integer x:nums) {
			if(number.containsKey(x)) {
				number.put(x, number.get(x)+1);
			}
			else {
				number.put(x, 1);
			}
		}
		System.out.println(number);
		
	}

}
