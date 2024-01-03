public class Divisors {
	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		
		for (int num = 1; num <= x; num++) {
			if (x % num == 0) {
				System.out.println(num);
			}
		}
	}
}
