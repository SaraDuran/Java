/*Leia 5 valores Inteiros. A seguir mostre quantos valores digitados foram pares, quantos valores digitados foram ímpares, quantos valores digitados foram positivos e quantos valores digitados foram negativos.*/

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valores;
		int pares = 0;
		int impares = 0;
		int positivos = 0;
		int negativos = 0;
		int contador = 0;
		
		System.out.println("\nDigite 5 numeros inteiros: \n");
		for(contador = 0; contador <5; contador++) {
			valores = sc.nextInt();
			if(valores >= 0) {
				positivos++;
			}else if(valores < 0 ) {
				negativos++;
			}
			if(valores % 2 == 0) {
				pares++;
			}else {
				impares++;
			}
		}
		
		System.out.println("\n" + pares + " valor(es) par(es)\n" + impares + " valor(es) impar(es)\n" + positivos + "  valor(es) postivo(s)\n" + negativos + " valor(es) negativo(s)");
		
		sc.close();

	}

}
