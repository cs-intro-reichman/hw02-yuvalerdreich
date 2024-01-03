public class DamkaBoard {
	public static void main(String[] args) {
		
		int BoardSize = Integer.parseInt(args[0]);

        for (int i = 0; i < BoardSize; i++) {
            for (int j = 0; j < BoardSize; j++) {
                if (i % 2 == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print(" *");
                }
            }
            System.out.println();
		}
	}
}	
