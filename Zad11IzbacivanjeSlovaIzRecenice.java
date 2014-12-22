/*	
 * ZADATAK: Od korisnika traziti da unese recenicu (sa razmacima) i
 * 			odredeno slovo. Na konzolu ispisati istu recenicu bez
 * 			tog slova.
 * 			Primjer:
 * 				Unesite recenicu:
 * 				PeoplE are strange when you’re a stranger.
 * 				Unesite slovo:
 * 				E
 * 				Popl ar strang whn you’r a strangr
 * 			Napomena:
 * 			U ovom slucaju ne pravimo razliku izmedu malog i
 * 			velikog slova.
 */

public class Zad11IzbacivanjeSlovaIzRecenice {
	
	public static void main(String[] args) {	
	
		String unesiRecenicu, unesiSlovo;
				
		System.out.println("Unesi recenicu: ");
		unesiRecenicu = TextIO.getlnString();

		System.out.println("Unesi slovo koje treba biti izbaceno iz recenice: ");
		unesiSlovo = TextIO.getlnString();

		String velikoSlovo = unesiSlovo.toUpperCase();
		String maloSlovo = unesiSlovo.toLowerCase();

		unesiRecenicu = unesiRecenicu.replaceAll(velikoSlovo, "");
		unesiRecenicu = unesiRecenicu.replaceAll(maloSlovo, "");
		
		System.out.printf("Recenica bez slova %s glasi: \n%s", unesiSlovo, unesiRecenicu);
		
	}
}