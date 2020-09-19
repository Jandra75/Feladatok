package feladat1;

public class feladat7 {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);

		if (a == 0) {
			System.out.println("Az egyenlet nem másodfokú");
			double x = (double) -c / b;
			System.out.println("x= " + x);

		} else {
			double diszkriminans = (b * b) - (4 * a * c);
			System.out.println(diszkriminans);
			
			if (diszkriminans >= 0) {
				diszkriminans = Math.sqrt(diszkriminans);
				double x1 = (-b + diszkriminans) / (2 * a);
				double x2 = (-b - diszkriminans) / (2 * a);
				System.out.println("x1 = "+ x1 + " x2= "+ x2);

			} else {
				System.out.println("Nincs megoldás!");
			}

		}

	}

}
