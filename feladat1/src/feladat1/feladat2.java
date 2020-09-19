package feladat1;

public class feladat2 {

	public static void main(String[] args) {
	
		int szam = Integer.parseInt(args[0]);

		if (szam % 2 == 0) {

			System.out.println("A szám páros!");
		} else {
			System.out.println("A szám páratlan");
		}
		
		
		
		if (szam % 3 == 0) {

			System.out.println("A szám osztható hárommal!");
		} else {
			System.out.println("A szám nem osztható hárommal!");
		}
		
		

		if (szam % 5 == 0) {

			System.out.println("A szám osztahtó öttel!");
		} else {
			System.out.println("A szám nem osztahtó öttel!");
		}
		
	}

}
