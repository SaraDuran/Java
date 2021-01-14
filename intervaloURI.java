/* Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”. */

/* O símbolo ( representa "maior que". Por exemplo:
[0,25]  indica valores entre 0 e 25.0000, inclusive eles.
(25,50] indica valores maiores que 25 Ex: 25.00001 até o valor 50.0000000 */



import java.util.Locale;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		float valor; 
		
		System.out.println("\nDigite o numero: ");
		valor = sc.nextFloat();
		
			if(valor <= 25.0) {
				System.out.println("\nIntervalo [0,25] ");
			}else if(valor > 25.0 && valor <= 50.0 ){
				System.out.println("\nIntervalo (25,50] ");
			}else if (valor > 50.0 && valor <= 75.0){
				System.out.println("\nIntervalo (50,75]");
			} else if (valor > 75.0 && valor <= 100.0){
				System.out.println("\nIntervalo (75,100] ");
			} else {
				System.out.println("\nFora de intervalo!");
			}
			sc.close();
	}
}