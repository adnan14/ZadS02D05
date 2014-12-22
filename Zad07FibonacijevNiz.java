/*	
 * ZADATAK: Fibonacijev niz je niz u kome je svaki elemenat jednak zbiru
 * 			prethodna dva elementa.
 * 			Fibonacijev niz glasi: 1, 1, 2, 3, 5, 8, 13...; jer je:
 * 			2=1+1, 3=2+1, 5=3+2, 8=5+3, 13=8+5...
 * 			Prva dva elementa Fibonacijevog niza su 1, 1.
 * 			Vas zadatak je da ispisete n-ti elemenat Fibonacijevog niza.
 * 			Npr. za n = 6, R = 8 (1, 1, 2, 3, 5, 8, 13, ...)
 * 			Ogranicenja:
 * 				(0	< n <= 50);
 * 			Ukoliko unos ne zadovoljava ogranicenja, program treba da
 * 			ispise gresku i da se zavrsi.
 */

public class Zad07FibonacijevNiz {
	
	public static void main(String[] args) {	

		int prvi = 1, drugi = 1, treci = prvi + drugi;
		int redniBrojElementa, brojacElemenata;
		
		System.out.println("Unesi redni broj (izmedju 1-50) elementa Fibonacijevog niza za kojeg zelis saznati vrijednost: ");
		redniBrojElementa = TextIO.getInt();

		if (redniBrojElementa < 1 || redniBrojElementa > 50) {
			System.out.println("Unijeli ste neispravan broj. Zavrsavam!");
			return;
		}

		if (redniBrojElementa == 1 || redniBrojElementa == 2) {
			System.out.printf("Vrijednost %d. elementa je 1", redniBrojElementa);
			return;
		}

		else {
			brojacElemenata = 3;
			while (brojacElemenata < redniBrojElementa) {
				prvi = drugi;
				drugi = treci;
				treci = prvi + drugi;
				brojacElemenata++;
			}
			System.out.printf("Vrijednost %d. elementa je %d", redniBrojElementa, treci);			
		}
	}
}