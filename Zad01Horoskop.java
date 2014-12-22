/*
 * ZADATAK: Napravite program koji odredjuje horoskopski znak korisnika!
 * 			Korisnik treba unijeti dan i mjesec roğenja, a program ce
 * 			ispisati odgovarajuci znak u horoskopu.
 * 			Datumi za pojedine znakove su ovdje:
 * 			http://www.whats-your-sign.com/zodiac-sign-dates.html
 * 
 * NAPOMENA: Pretpostavka je da se nece unositi:
 * 			 - nepostojeci datum (npr. 31.02.)
 * 			 - dan ili mjesec veci/manji od moguceg
 */

public class Zad01Horoskop {

	public static void main(String[] args) {	

		int dan, mjesec;
		String znak = "";
		
		System.out.println("Unesi dan (1-31): ");
		dan = TextIO.getInt();

		System.out.println("Unesi mjesec (1-12): ");
		mjesec = TextIO.getInt();

		if ((dan > 20 && mjesec == 3) || (dan < 20 && mjesec == 4)){
			znak = "Ovan";
			}
		if ((dan > 19 && mjesec == 4) || (dan < 21 && mjesec == 5)){
			znak = "Bik";
			}
		if ((dan > 20 && mjesec == 5) || (dan < 21 && mjesec == 6)){
			znak = "Blizanci";
			}
		if ((dan > 20 && mjesec == 6) || (dan < 23 && mjesec == 7)){
			znak = "Rak";
			}
		if ((dan > 22 && mjesec == 7) || (dan < 23 && mjesec == 8)){
			znak = "Lav";
			}
		if ((dan > 22 && mjesec == 8) || (dan < 23 && mjesec == 9)){
			znak = "Djevica";
			}
		if ((dan > 22 && mjesec == 9) || (dan < 23 && mjesec == 10)){
			znak = "Vaga";
			}
		if ((dan > 22 && mjesec == 10) || (dan < 22 && mjesec == 11)){
			znak = "Skorpija";
			}
		if ((dan > 21 && mjesec == 11) || (dan < 22 && mjesec == 12)){
			znak = "Strijelac";
			}
		if ((dan > 21 && mjesec == 12) || (dan < 20 && mjesec == 1)){
			znak = "Jarac";
			}
		if ((dan > 19 && mjesec == 1) || (dan < 19 && mjesec == 2)){
			znak = "Vodolija";
			}
		if ((dan > 18 && mjesec == 2) || (dan < 21 && mjesec == 3)){
			znak = "Ribe";
			}
		
		System.out.printf("\nZa datum %d.%d. horoskopski znak je:\n         %s!", dan, mjesec, znak);
		
	}
}
