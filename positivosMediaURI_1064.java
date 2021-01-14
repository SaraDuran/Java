/*Leia 6 valores. Em seguida, mostre quantos destes valores digitados foram positivos. Na próxima linha, deve-se mostrar a média de todos os valores positivos digitados, com um dígito após o ponto decimal.*/

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double num;
		int contador;
		int positivos = 0;
		double media;
		double numerador = 0;
		
		for(contador = 0; contador < 6; contador++) {
			num = sc.nextInt();
			if(num > 0 ) {
				positivos = positivos + 1;
				numerador = numerador + num;
			}
		}
		
		media=(numerador / positivos);
		
		System.out.println(String.format("\n Numeros positivos: %d", positivos));
		System.out.println(String.format("\n %.1f", media));
		sc.close();

	}

}
