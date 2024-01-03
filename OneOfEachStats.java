import java.util.Random;

public class OneOfEachStats {
	public static void main(String[] args) {
		
		int T = Integer.parseInt(args[0]);
		int seed = Integer.parseInt(args[1]);
		
		int countT = 0;
		int TwoChildren = 0;
		int ThreeChildren = 0;
		int FourOrMore = 0;
		
		int max = 0;
		String MostCommon = "";
		
		for(int i = 0; i < T; i++) {
			boolean GirlBorn = false;
		    boolean BoyBorn = false;
			int count = 0;
			
			Random generator = new Random(seed);
			
			while(!(BoyBorn && GirlBorn)) {
				if (generator.nextDouble() <= 0.5) {
			        GirlBorn = true;
			
		    }   
			    else {
				    BoyBorn = true;
			}
			count++;
		}
		countT += count;
		
		if (count == 2) {
			TwoChildren++;
		} else if (count == 3) {
			ThreeChildren++;
		} else {
			FourOrMore++;
		}
		if (count > max) {
			max = count;
		}
		
		if (TwoChildren >= ThreeChildren && TwoChildren >= FourOrMore) {
			MostCommon = "2.";
		} else if (ThreeChildren >= FourOrMore) {
			MostCommon = "3.";
		} else {
			MostCommon = "4 or more.";
		}
			
	}	
		System.out.println("Average: " + (countT) / (double) T + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + TwoChildren);
		System.out.println("Number of families with 3 children: " + ThreeChildren);
		System.out.println("Number of families with 4 or more children: " + FourOrMore);
		System.out.println("The most common number of children: " + MostCommon);
	}
}