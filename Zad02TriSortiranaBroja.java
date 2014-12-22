/*	
 * ZADATAK: Napisati program koji ucitava tri cijela broja iz intervala
 * 			od 50 do 200 . Ako neki od unesenih brojeva nisu iz tog
 * 			intervala, program treba ispisati poruku i zavrsiti sa radom.
 * 			Ako su brojevi unutar tog intervala, potrebno je ispisati
 * 			unesene brojeve poredane po velicini, od najmanjeg prema
 * 			najvecem. Dodatno je potrebno odrediti koliko razlièitih
 * 			brojeva je uneseno.
 * 			U bilo kojem trenutku rad programa se moze zavrsiti naredbom
 * 			return;
 */

public class Zad02TriSortiranaBroja {
	
	public static void main(String[] args) {	

		int prvi, drugi, treci;
		int najveci1, najveci2, najveci3;
		int brojRazlicitih = 3; // pretpostavljam da su svi uneseni brojevi razliciti, a ako
								// utvrdim da nisu onda cu smanjivati vrijednost brojaca
		
		System.out.println("Unesi prvi broj (izmedju 50 i 200): ");
		prvi = TextIO.getInt();
		System.out.println("Unesi drugi broj (izmedju 50 i 200): ");
		drugi = TextIO.getInt();		
		System.out.println("Unesi treci broj (izmedju 50 i 200): ");
		treci = TextIO.getInt();

		if ((prvi < 50 || prvi > 200) || (drugi < 50 || drugi > 200) || (treci < 50 || treci > 200)){
			System.out.println("\nNeispravan unos! Nisu svi brojevi u rasponu izmedju 50 i 200. Zavrsavam program! ");
			return;
		}
		
		if (prvi >= drugi && prvi >= treci) {
			najveci1 = prvi;		// najveci je "prvi", treba porediti preostala dva
			if (drugi >= treci) { 
				najveci2 = drugi;
				najveci3 = treci;
			} else {
				najveci2 = treci;
				najveci3 = drugi;
			}
		} else if (drugi >= treci) {
				najveci1 = drugi;	// najveci je "drugi", treba porediti preostala dva
				if (prvi >= treci) { 
					najveci2 = prvi;
					najveci3 = treci;
				} else {
					najveci2 = treci;
					najveci3 = prvi;
				}
		} else {
			najveci1 = treci;		// najveci je "treci", treba porediti preostala dva
			if (prvi >= drugi) { 
				najveci2 = prvi;
				najveci3 = drugi;
			} else {
				najveci2 = drugi;
				najveci3 = prvi;
			}
		}
		
		// provjera koliko je razlicitih brojeva uneseno
		
		if (prvi == drugi) {
			brojRazlicitih--;
			if (prvi == treci) { 	
				brojRazlicitih--;
			}
		} else {			
			if (prvi == treci) {
				brojRazlicitih--;
			}
			if (drugi == treci) { 	
				brojRazlicitih--;
			}
		}
		System.out.printf("Brojevi %d, %d i %d, poredani po velicini, od najmanjeg ka najvecem:\n%d\n%d\n%d\na ukupan broj razlicitih unesenih brojeva je %d", prvi, drugi, treci, najveci3, najveci2, najveci1, brojRazlicitih);
	}
}