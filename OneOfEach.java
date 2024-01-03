public class OneOfEach {
	public static void main(String[] args) {
		
		boolean GirlBorn = false;
		boolean BoyBorn = false;
		String ChildrenCount = "";
		int count = 0;
		
		while(!(BoyBorn && GirlBorn)) {
			if (Math.random() < 0.5) {
				ChildrenCount += " g";
			    GirlBorn = true;
			
		    } else {
			    ChildrenCount += " b";
				BoyBorn = true;
			}
			count++;
		}
		System.out.println(ChildrenCount);
		System.out.println("You made it... and you have " + count + " children");
	}
}