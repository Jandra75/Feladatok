package feladat1;

public class feladat4 {

	public static void main(String[] args) {

		int szam = Integer.parseInt(args[0]);

		if (0 < szam && szam <= 1000000) {
			if (szam > 999999) {
				System.out.println("A sz�m  h�tjegy�!");
			} else if (szam > 99999) {
				System.out.println("A sz�m hatjegy�!");
			} else if (szam > 9999) {
				System.out.println("A sz�m �tjegy�!");
			} else if (szam > 999) {
				System.out.println("A sz�m n�gyjegy�!");
			} else if (szam > 99) {
				System.out.println("A sz�m h�romjegy�!");
			} else if (szam > 9) {
				System.out.println("A sz�m kett�jegy�!");
			} else if (szam > 0) {
				System.out.println("A sz�m egyjegy�!");
			}

		} else {
			System.out.println("A sz�mnak 1 �s 1 000 000 k�z�tt kell lennie!");
		}

	}

}
