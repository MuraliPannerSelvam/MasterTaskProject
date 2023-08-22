package threads;

public class StringWordReverse {
	public static void main(String[] args) {
		String word = "I am from Bangalore";
		StringBuilder revString = new StringBuilder();
		StringBuilder result = new StringBuilder();
		for (int i = word.length() - 1; i >= 0; i--) {
			char c = word.charAt(i);
			if (c != ' ') {	
				result.insert(0, c);
			} else {
				if (result.length() > 0) {
					revString.append(result).append(' ');
					result.setLength(0);
				}
			}
		}
		if (result.length() > 0) {
			revString.append(result);
		}
		System.out.println(revString.toString());
	}
}
