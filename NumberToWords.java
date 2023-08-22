package com.onesoft.question.revision;

public class NumberToWords {
	public static void main(String[] args) {
		int a = 4;
		int b = 22;
		if (a == 4 && b == 22) {
			String aWords = convertToWords(a);
			String bWords = convertToWords(b);

			System.out.println(aWords + " and " + bWords);
		}
	}

	public static String convertToWords(int number) {
		String[] units = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
				"Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" };

		String[] tens = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };

		if (number >= 0 && number < 20) {
			return units[number];
		} else if (number >= 20 && number < 100) {
			int tensDigit = number / 10;
			int unitsDigit = number % 10;
			return tens[tensDigit] + (unitsDigit != 0 ? " " + units[unitsDigit] : "");
		}

		return "Number out of range";
	}

}
