public class DamkaBoard {
	public static void main(String[] args) {
		
		int BoardSize = Integer.parseInt(args[0]);
		String Stars = " ";
		for (int i = 0; i < BoardSize; i++) {
			Stars += "*";
		}
		
		for (int i = 0; i < BoardSize; i++) {
            if (i % 2 != 0) {
                System.out.println(Stars);
            } else {
                System.out.println(" " + Stars);
			}
        }
	}
}		
