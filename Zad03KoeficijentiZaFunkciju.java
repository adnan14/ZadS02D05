/*	
 * ZADATAK: Napisati program koji ucitava koeficijente a, b i c koji su
 * 			realnog tipa. Ti koeficijenti odreðuju funkciju:
 * 				f(x) = a * x2 + b * x + c
 * 			Program treba da provjeri da li su koeficijenti u intervalu
 * 			od -10 do 10 . Ako nisu, program ispisuje poruku:
 * 				Koeficijenti a, b, c nisu u zadanom intervalu
 * 			Ako koeficijenti a, b i c jesu u zadanom intervalu, program
 * 			kao izlaz daje vrijednost funkcije u taèki. Taèka se takoðer
 * 			unosi sa standardnog ulaza.
 * 			Npr:
 * 					Unesite koeficijente a, b i c: 
 * 					1 2 1
 * 					Unesite tacku x:
 * 					1
 * 					f(1) = 4
 */

public class Zad03KoeficijentiZaFunkciju {
	
	public static void main(String[] args) {	

		int koeficijentA, koeficijentB, koeficijentC, tackaX, rezultat;

		System.out.println("Unesi koeficijente a, b i c (u intervalu -10 do 10): ");
		koeficijentA = TextIO.getInt();
		koeficijentB = TextIO.getInt();		
		koeficijentC = TextIO.getInt();

		System.out.println("Unesi tacku x: ");
		tackaX = TextIO.getInt();

		
		if ((koeficijentA >= -10 && koeficijentA <= 10) && (koeficijentB >= -10 && koeficijentB <= 10) && (koeficijentC >= -10 && koeficijentC <= 10)){
			rezultat = koeficijentA * (tackaX * tackaX) + koeficijentB * tackaX + koeficijentC;
			System.out.printf("f(%d) = %d", tackaX, rezultat);
		}
		else {
			System.out.println("Koeficijenti a, b, c nisu u zadanom intervalu!");
		}
	}
}