/*	
 * ZADATAK: Dvije firme nude usluge prikljucenja na Internet, pri cemu
 * 			prva firma trazi fiksnu pretplatu od 10 KM plus 50 feninga
 * 			po svakom potrosenom satu, dok druga firma ne trazi fiksnu
 * 			pretplatu, ali trazi 80 feninga po svakom potrosenom satu.
 * 			Napisite program koji od korisnika trazi da unese zeljeni
 * 			broj sati a nakon toga da mu preporuci koja je firma
 * 			isplatnija za njegove potrebe.
 * 			Na primjer, za 15 sati isplatnija je druga firma
 * 			(10 + 15 * 0.5 = 17.5 > 15 * 0.8 = 12), dok je za 40 sati
 * 			isplatnija prva firma (10 + 40 * 0.5 = 30 < 40 * 0.8 = 32).
 */

public class Zad10InternetPretplata {
	
	public static void main(String[] args) {	

		double brojSati;
		double prvaFirma = 0, drugaFirma = 0; 
		
		System.out.println("Prva firma trazi fiksnu pretplatu od 10 KM plus 50 feninga po svakom potrosenom satu.");
		System.out.println("Druga firma samo trazi 80 feninga po svakom potrosenom satu.\n");
		System.out.println("Unesi broj sati koliko planiras mjesecno koristiti internet: ");
		brojSati = TextIO.getInt();

		prvaFirma = 10 + 0.5 * brojSati;
		drugaFirma = 0.8 * brojSati;
		
		if (prvaFirma < drugaFirma) {
			System.out.printf("Isplativije ti je koristiti usluge prve firme jer bi to kostalo %.2f KM mjesecno, u odnosu na %.2f KM mjesecno za usluge druge firme.", prvaFirma, drugaFirma);
		}
		
		else if (prvaFirma > drugaFirma) {
			System.out.printf("Isplativije ti je koristiti usluge druge firme jer bi to kostalo %.2f KM mjesecno, u odnosu na %.2f KM mjesecno za usluge prve firme.", drugaFirma, prvaFirma);
		}

		else {
			System.out.printf("Cijena za obje firme je ista (%.2f KM), pa je svejedno koju firmu izaberes. ", prvaFirma);
		}
	}
}