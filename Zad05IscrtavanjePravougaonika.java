/*	
 * ZADATAK: Napravite program koji na ekranu iscrtava pravougaonik
 * 			pri cemu su date stranice a i b pravougaonika. Za
 * 			iscrtavanje koristite znakove:
 * 				- (minus) za vodoravne linije
 * 				| (pipe) za uspravne
 * 				+ (plus) za coskove.
 * 
 * 			Primjer izlaza programa:
 * 				Unesite stranice pravougaonika: 3 6
 * 				+----+
 * 				|    |
 * 				+----+
 */

public class Zad05IscrtavanjePravougaonika {
	
	public static void main(String[] args) {	

		int sirina, visina;

		System.out.println("Unesi duzinu za dvije stranice pravougaonika: \n");
		sirina = TextIO.getInt();
		visina = TextIO.getInt();
		
		for (int i = 1; i < visina + 1; i++) {
			for (int ii = 1; ii < sirina + 1; ii++) {
				if ((i == 1 || i == visina) && (ii == 1 || ii == sirina)) {
					System.out.print("+");
				}
				else if ((i == 1 || i == visina) && (ii != 1 && ii != sirina)) {
					System.out.print("-");
				}
				else if ((i != 1 && i != visina) && (ii == 1 || ii == sirina)) {
					System.out.print("|");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
	}
}