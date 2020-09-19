package feladat1;

public class feladat4 {

	public static void main(String[] args) {

		int szam = Integer.parseInt(args[0]);

		if (0 < szam && szam <= 1000000) {
			if (szam > 999999) {
				System.out.println("A szám  hétjegyû!");
			} else if (szam > 99999) {
				System.out.println("A szám hatjegyû!");
			} else if (szam > 9999) {
				System.out.println("A szám ötjegyû!");
			} else if (szam > 999) {
				System.out.println("A szám négyjegyû!");
			} else if (szam > 99) {
				System.out.println("A szám háromjegyû!");
			} else if (szam > 9) {
				System.out.println("A szám kettõjegyû!");
			} else if (szam > 0) {
				System.out.println("A szám egyjegyû!");
			}

		} else {
			System.out.println("A számnak 1 és 1 000 000 között kell lennie!");
		}

	}

}
