/* ZADATAK: Traziti od korisnika broj a zatim ispisati sumu cifara tog
 * 			broja. Npr. ako korisnik unese 123 program treba ispisati
 * 			6 jer je 1 + 2 + 3 = 6.
 */


/*	
 * NAPOMENA: Postavio sam dodatni uslov da broj za unos treba biti u
 * 			 rasponu 0 - 999999.
 */

public class Zad12SumaCifaraUnesenogBroja {
	
	public static void main(String[] args) {	

		int uneseniBroj;
		int indikatorDuzine = 0, suma = 0;

		System.out.println("Unesi broj u rasponu 0 - 999999: ");
		uneseniBroj = TextIO.getInt();
		
		if (uneseniBroj < 0 || uneseniBroj > 999999) {
			System.out.println("Unio si pogresan broj. Zavrsavam program!");
			return;
		}
		
		int medjubroj = uneseniBroj;
		
		if (uneseniBroj >= 0) {
			indikatorDuzine = 1;
		}
		if (uneseniBroj >= 10) {
			indikatorDuzine = 10;
		}
		if (uneseniBroj >= 100) {
			indikatorDuzine = 100;
		}
		if (uneseniBroj >= 1000) {
			indikatorDuzine = 1000;
		}
		if (uneseniBroj >= 10000) {
			indikatorDuzine = 10000;
		}
		if (uneseniBroj >= 100000) {
			indikatorDuzine = 100000;
		}		
		
		while (indikatorDuzine >= 1) {
			while (medjubroj >= indikatorDuzine) {
				medjubroj = medjubroj - indikatorDuzine;
				suma++;
			}
			indikatorDuzine = indikatorDuzine / 10;
		}
			
		System.out.printf("Suma cifara unesenog broja iznosi %d", suma);
		
	}
}