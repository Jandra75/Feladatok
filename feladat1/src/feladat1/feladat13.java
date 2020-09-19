package feladat1;

public class feladat13 {

	public static void main(String[] args) {
		int szam = Integer.parseInt(args[0]);
		int osztosum = 0;
		for (int i = 1; i < szam; i++) {
			if (szam % i == 0) {
				osztosum += i;
			}

		}
		if (szam == osztosum) {
			System.out.println("A szám tökletes!");
		} else {
			System.out.println("A szám nem tökéletes!");
		}

	}

}
