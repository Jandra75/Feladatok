package feladat1;

public class Feladat1 {

	public static void main(String[] args) {

		int szam = Integer.parseInt(args[0]);

		if (szam % 2 == 0) {

			System.out.println("A szám páros!");
		} else {
			System.out.println("A szám páratlan");
		}

		/* String eredmeny = szam % 2 == 0 ? "Páros" :"Páratlan";
		 * System.out.println(eredmeny);   Az elõzõ röviden  
	   */

		
	}

}
