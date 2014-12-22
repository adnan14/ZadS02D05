/*	
 * ZADATAK: Napisati program koji implementira igru pogadjanja brojeva.
 * 			Racunar memorise neki slucajno izabrani broj izmeðu 1 i 100,
 * 			a zatim korisnik pogadja taj broj. Za svaki pokusaj, racunar
 * 			treba ispisati da li je trazeni broj manji, veci ili jednak
 * 			unesenom broju. Kada je broj jednak, igra se zavrsava. Igrac
 * 			moze izaci iz igre prije kraja unosom broja -1.
 * 			Nakon sto korisnik pogodi broj ispisati odgovarajucu poruku i
 * 			broj pokusaja pogadjanja.
 */

public class Zad06IgraPogadjanjaBrojeva {
	
	public static void main(String[] args) {	

		int zamisljeniBroj = 0, brojacPokusaja = 0;
		int pokusajPogotka;
		String poruka = "";
		
		zamisljeniBroj = 1 + (int) ((Math.random()) * 100);		
		
		System.out.print("Pokusaj pogoditi broj koji sam zamislio (izmedju 1 i 100)!");
		pokusajPogotka = TextIO.getInt();		
		
		while (pokusajPogotka != -1) {
			brojacPokusaja++;

			if (pokusajPogotka == zamisljeniBroj) {
				System.out.printf("Uspio si iz %d. pokusaja pogoditi broj koji sam zamislio", brojacPokusaja);
				return;
			}
			else if (pokusajPogotka < zamisljeniBroj) {
				poruka = "VECI";
			}
			else {
				poruka = "MANJI";
			}
			System.out.printf("Broj koji sam zamislio je %s. Pokusaj ponovo", poruka);
			pokusajPogotka = TextIO.getInt();				
		}			
		System.out.println("Zavrsavam igru. Dovidjenja!");
	}
}