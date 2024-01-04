public class Reverse {
	public static void main(String[] args) {
		String s = args[0];
		int length = s.length();
		int i = s.length() -1;
		
		while(i >= 0) {
			System.out.print(s.charAt(i));
			i--;
		}
		int middleChar = length / 2 - 1;
		System.out.println("\nThe middle character is " + s.charAt(middleChar));
	}
}
