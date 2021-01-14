import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero[] = new int [5];
		int contador;
		int positivos, negativos, zeros;
		positivos = 0;
		negativos = 0;
		zeros = 0;
		
		System.out.println("Digite cinco numeros um apos o outro: ");
		for(contador = 0; contador <5; contador++) {
			System.out.println("Digite o " + (contador+1) + "o numero: ");
			numero[contador] = sc.nextInt();
			if(numero[contador]>0) {
				positivos = positivos + 1;
			} else if(numero[contador]<0){
				negativos = negativos + 1;
			} else {
				zeros = zeros + 1;
			}
		}
		
		System.out.println("A quantidade de numeros positivos digitados e de :" + positivos);
		System.out.println("A quantidade de numeros negativos digitados e de :" + negativos);
		System.out.println("A quantidade de zeros digitados e de :" + zeros);
	}

}
