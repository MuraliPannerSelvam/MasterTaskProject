package threads;

public class Sample {
	public static void main(String[] args) {
		String[] names = { "Murali", "Prashanth", "Gokulan", "Saravanan" };
		for (int i = 0; i < names.length; i++) {
			if (names[i].equals("Prashanth")) {
				System.out.println(names[i]);
			}
		}
	}

}
