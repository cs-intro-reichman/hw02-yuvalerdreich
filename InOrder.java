public class InOrder {
    public static void main(String[] args) {
  
        int x = (int)(10.0 * Math.random());
		System.out.print( x + " ");
        int y = (int)(10.0 * Math.random());
			
			
        while (x <= y) { 
		    System.out.print( y + " ");
		    x = y;
		    y = (int)(10.0 * Math.random());
		}
    }
}
