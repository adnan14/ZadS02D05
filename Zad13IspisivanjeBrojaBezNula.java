/* ZADATAK: Napisati program koji ucitava broj od korisnika a zatim
 * 			ispisuje taj broj ali bez nula koje se pojavljuju u broju.
 * 			Npr. za unos 10200304005 program treba ispisati 12345.
 * 			Prisjetiti se da broj % 10 daje zadnju cifru nekog broja.
 * 			I da ako neki broj okrenete pa ga opet okrenete dobijete
 * 			taj isti broj.
 *	
 * NAPOMENA: Pretpostavka je da je uneseni broj >= 1.
 */

public class Zad13IspisivanjeBrojaBezNula {
	
	public static void main(String[] args) {	

		int uneseniBroj, ostatakDijeljenja;
		int konacniBroj = 0;
		int pozicijaCifre = 1;
		
		System.out.println("Unesi broj (kojeg trebam ispisati bez svih nula koje sadrzi): ");
		uneseniBroj = TextIO.getInt();
		int brojZaDijeljenje = uneseniBroj;

		while (brojZaDijeljenje >= 10) {
			ostatakDijeljenja = brojZaDijeljenje%10;
			if (ostatakDijeljenja != 0) {
				konacniBroj = konacniBroj + ostatakDijeljenja * pozicijaCifre;
				pozicijaCifre = pozicijaCifre * 10;
			}
			brojZaDijeljenje = brojZaDijeljenje / 10;
		}
		konacniBroj = konacniBroj + brojZaDijeljenje * pozicijaCifre;		
		System.out.printf("Broj bez nula: %d", konacniBroj);
	}
}