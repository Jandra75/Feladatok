package feladat1;

public class feladat5 {

	public static void main(String[] args) {
		int szam1 = Integer.parseInt(args[0]);
		int szam2 = Integer.parseInt(args[1]);
				
		if(args.length == 2 ) {
			
			if(szam1>szam2) {
				System.out.println("Az elsõ szám nagyobb!");
			}else if (szam1 <szam2) {
				System.out.println("Az elsõ szám kisebb!");
			}else 
				System.out.println("A két szám egyenlõ!");
				
		}else {
			System.out.println("Két számot adj meg!");
		}
		

	}

}
