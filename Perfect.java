public class Perfect {
	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		
		int num = 1;
		int sum = 0;
		String divisors = x + " is a perfect number since " + x + " = ";
		while (num <= x / 2) {
			if (x % num == 0) {
				sum += num;
				divisors += num;
				if (num < x / 2) {
					divisors += " + ";
			    }
			}
		    num++;
		}
		if (sum == x) {
			System.out.println(divisors);					
	    }
		else {
			System.out.println(x + " is not perfect number");
		}
	}
}

			
		
