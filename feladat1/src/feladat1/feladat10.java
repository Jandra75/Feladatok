package feladat1;

public class feladat10 {

	public static void main(String[] args) {
		int tol= Integer.parseInt(args[0]);
		int ig= Integer.parseInt(args[1]);
				
		for (int i = tol; i < ig; i++) {
			if (i % 3 == 0)
				System.out.print(i + " ");
		}
	}

}
