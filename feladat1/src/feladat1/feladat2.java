package feladat1;

public class feladat2 {

	public static void main(String[] args) {
	
		int szam = Integer.parseInt(args[0]);

		if (szam % 2 == 0) {

			System.out.println("A sz�m p�ros!");
		} else {
			System.out.println("A sz�m p�ratlan");
		}
		
		
		
		if (szam % 3 == 0) {

			System.out.println("A sz�m oszthat� h�rommal!");
		} else {
			System.out.println("A sz�m nem oszthat� h�rommal!");
		}
		
		

		if (szam % 5 == 0) {

			System.out.println("A sz�m osztaht� �ttel!");
		} else {
			System.out.println("A sz�m nem osztaht� �ttel!");
		}
		
	}

}
