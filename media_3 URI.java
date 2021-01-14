/* Leia quatro números (N1, N2, N3, N4), cada um deles com uma casa decimal, correspondente às quatro notas de um aluno. Calcule a média com pesos 2, 3, 4 e 1, respectivamente, para cada uma destas notas e mostre esta média acompanhada pela mensagem "Media: ". Se esta média for maior ou igual a 7.0, imprima a mensagem "Aluno aprovado.". Se a média calculada for inferior a 5.0, imprima a mensagem "Aluno reprovado.". Se a média calculada for um valor entre 5.0 e 6.9, inclusive estas, o programa deve imprimir a mensagem "Aluno em exame.".

No caso do aluno estar em exame, leia um valor correspondente à nota do exame obtida pelo aluno. Imprima então a mensagem "Nota do exame: " acompanhada pela nota digitada. Recalcule a média (some a pontuação do exame com a média anteriormente calculada e divida por 2). e imprima a mensagem "Aluno aprovado." (caso a média final seja 5.0 ou mais ) ou "Aluno reprovado.", (caso a média tenha ficado 4.9 ou menos). Para estes dois casos (aprovado ou reprovado após ter pego exame) apresente na última linha uma mensagem "Media final: " seguido da média final para esse aluno. */



import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double nota_1;
		double nota_2;
		double nota_3;
		double nota_4;
		double exame;
		double media;
		double novaMedia;
		
		System.out.println("Digite a seguir as quatro notas de um aluno: ");
		nota_1 = sc.nextDouble();
		nota_2 = sc.nextDouble();
		nota_3 = sc.nextDouble();
		nota_4 = sc.nextDouble();
		
		media = ((nota_1 * 2) + (nota_2 * 3) + (nota_3 * 4) + (nota_4 * 1))/10;
		if(media >= 7.0) {
			System.out.println(String.format("\nAluno aprovado. Media: %.1f ", media));
		}else if(media < 5.0) {
			System.out.println(String.format("\nAluno reprovado. Media: %.1f ", media));
		}else if(media >=5.0 && media <= 6.9){
			System.out.println(String.format("\nAluno em exame. Media: %.1f \nDigite a nota que tirou no exame.", media));
			exame = sc.nextDouble();
			novaMedia = (exame + media)/2;
			if(novaMedia >= 5.0) {
				System.out.println(String.format("\nAluno aprovado. Media final: %.1f", novaMedia));
			}else if(novaMedia <= 4.9) {
				System.out.print(String.format("Aluno reprovado. Media final: %.1f", novaMedia));
			}
		}
		sc.close();
	}

}
