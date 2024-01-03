public class InOrder {
    public static void main(String[] args) {
  
        double x = (10.0 * Math.random());
		System.out.print((int) x + " ");
        double y = (10.0 * Math.random());
			
			
        while (y <= x) { 
		    System.out.print((int) y + " ");
		    x = y;
		    y = (10.0 * Math.random());
		}
    }
}

