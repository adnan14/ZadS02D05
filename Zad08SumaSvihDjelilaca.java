/*	
 * ZADATAK: Napisite program koji trazi da se sa tastature unese prirodan broj n.
 *			U slucaju da korisnik unese nesto sto nije prirodan broj treba ispisati 
 *			poruku upozorenja, i ponoviti unos. Ukoliko je unos ispravan, program
 *			treba da izracuna i ispise sumu svih djelilaca broja n.
 * 			Na primjer, za n = 12 treba ispisati vrijednost 28, jer su djelioci
 *  		broja 12 brojevi 1, 2, 3, 4, 6 i 12, a 1 + 2 + 3 + 4 + 6 + 12 = 28.
 *   		Nakon toga, program treba da trazi unos novog broja i da ponavlja
 *    		postupak sve dok se kao broj ne unese nula.
 */

public class Zad08SumaSvihDjelilaca {
		
	public static void main(String[] args) {	
		
		int prirodanBroj;
		
		do {
			System.out.println("Unesi jedan prirodan broj: ");
			prirodanBroj = TextIO.getlnInt();
			int sumaDjelilaca = 0;

			// trebalo bi ispitivati i da li je unesen, recimo, decimalni broj,
			// ali nisam to znao rijesiti (pa je ostala samo provjera "prirodanBroj < 0")
			if (prirodanBroj < 0) {
				System.out.println("Niste unijeli prirodan broj!");
			} else {
				for (int i = 1; i <= prirodanBroj; i++) {
					if (prirodanBroj % i == 0) {
						sumaDjelilaca += i;
					}
				}
				System.out.printf("Suma svih djelilaca broja %d iznosi %d.\n\n", prirodanBroj, sumaDjelilaca);
			}						
		} while (prirodanBroj != 0);		
	}
}