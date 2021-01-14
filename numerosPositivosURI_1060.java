/*Faça um programa que leia 6 valores. Estes valores serão somente negativos ou positivos (desconsidere os valores nulos). A seguir, mostre a quantidade de valores positivos digitados.*/

import java.util.Scanner;
import java.io.IOException;

public class Main {

	public static void main(String[] args)throws IOException {
		Scanner sc = new Scanner(System.in);
		
		double numeros;
		int contador;
		int positivos = 0;
		
		for(contador = 0; contador < 6; contador++) {
			numeros = sc.nextDouble();
			if(numeros > 0 ) {
				positivos = positivos + 1;
			}
		}
		
		System.out.println("\nNumeros positivos: " + positivos);
		sc.close();
	}
}
