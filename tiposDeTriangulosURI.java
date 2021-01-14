/*

Leia 3 valores de ponto flutuante A, B e C e ordene-os em ordem decrescente, de modo que o lado A representa o maior dos 3 lados. A seguir, determine o tipo de triângulo que estes três lados formam, com base nos seguintes casos, sempre escrevendo uma mensagem adequada:

    se A ≥ B+C, apresente a mensagem: NAO FORMA TRIANGULO
    se A2 = B2 + C2, apresente a mensagem: TRIANGULO RETANGULO
    se A2 > B2 + C2, apresente a mensagem: TRIANGULO OBTUSANGULO
    se A2 < B2 + C2, apresente a mensagem: TRIANGULO ACUTANGULO
    se os três lados forem iguais, apresente a mensagem: TRIANGULO EQUILATERO
    se apenas dois dos lados forem iguais, apresente a mensagem: TRIANGULO ISOSCELES

*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double A, B, C;
		Scanner sc =new Scanner(System.in);
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		double tempA = Math.max(A, Math.max(B, C));
		double tempB = 0;
		double tempC = 0;
		
		if (tempA == A) {
			tempB =Math.max(B, C);
			tempC =Math.min(B, C);
		}
		if (tempA == B) {
			tempB =Math.max(A, C);
			tempC =Math.min(A, C);
		}
		if (tempA == C) {
			tempB =Math.max(B, A);
			tempC =Math.min(B, A);
		}
		//------------------------------
		if (tempA >= (tempB + tempC)) {
			System.out.print("NAO FORMA TRIANGULO\n");
			
		}else if (tempA*tempA > ((tempB*tempB)+(tempC*tempC))) {
			System.out.print("TRIANGULO OBTUSANGULO\n");
		}
		if (tempA*tempA == ((tempB*tempB)+(tempC*tempC))) {
			System.out.print("TRIANGULO RETANGULO\n");
		}

		if (tempA*tempA < ((tempB*tempB)+(tempC*tempC))) {
			System.out.print("TRIANGULO ACUTANGULO\n");
		}
		if ((tempA == tempB) &&(tempA == tempC)) {
			System.out.print("TRIANGULO EQUILATERO\n");
		}
		if (((tempA == tempB) &&(tempA != tempC)) || ((tempA == tempC) &&(tempA != tempB)) || ((tempB == tempC) &&(tempB != tempA)) ) {
			System.out.print("TRIANGULO ISOSCELES\n");
		}
		sc.close();
	}

}