package feladat1;

public class feladat5 {

	public static void main(String[] args) {
		int szam1 = Integer.parseInt(args[0]);
		int szam2 = Integer.parseInt(args[1]);
				
		if(args.length == 2 ) {
			
			if(szam1>szam2) {
				System.out.println("Az els� sz�m nagyobb!");
			}else if (szam1 <szam2) {
				System.out.println("Az els� sz�m kisebb!");
			}else 
				System.out.println("A k�t sz�m egyenl�!");
				
		}else {
			System.out.println("K�t sz�mot adj meg!");
		}
		

	}

}
