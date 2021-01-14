/*Leia 4 valores inteiros A, B, C e D. A seguir, se B for maior do que C e se D for maior do que A, e a soma de C com D for maior que a soma de A e B e se C e D, ambos, forem positivos e se a variável A for par escrever a mensagem "Valores aceitos", senão escrever "Valores nao aceitos".*/

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int soma1;
		int soma2;
		
		System.out.println("\nDigite o primeiro numero: ");
		 a = sc.nextInt();
		System.out.println("\nDigite o segundo numero: ");
		 b = sc.nextInt();
		System.out.println("\nDigite o terceiro numero: ");
		 c = sc.nextInt();
		System.out.println("\nDigite o quarto numero: ");
		 d = sc.nextInt();
		 
		soma1=a+b;
		soma2=c+d;
		
		if((a%2==0) && (c > 0 && d > 0)) {
			if(b > c && d > a){
				if(soma2 > soma1){
					System.out.println("\nValores aceitos!");
				}
			}
		} else {
			System.out.println("\nValores nao aceitos!");
		}
		sc.close();
	}
}
