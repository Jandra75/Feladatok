package feladat1;

public class Feladat1 {

	public static void main(String[] args) {

		int szam = Integer.parseInt(args[0]);

		if (szam % 2 == 0) {

			System.out.println("A sz�m p�ros!");
		} else {
			System.out.println("A sz�m p�ratlan");
		}

		/* String eredmeny = szam % 2 == 0 ? "P�ros" :"P�ratlan";
		 * System.out.println(eredmeny);   Az el�z� r�viden  
	   */

		
	}

}
