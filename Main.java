import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		int numero[] = new int[11];
		double quadrados[] = new double[11];
		double cubos[] = new double[11];
		int contador;
		int potenciaQuad = 2;
		int potenciaCubo = 3;
		
		//inicializando vetor numeros do 0 a 10//
		for(contador = 0; contador < 11; contador++){
			numero[contador]=contador;
			quadrados[contador]=(Math.pow(numero[contador], potenciaQuad));
			cubos[contador]=(Math.pow(numero[contador], potenciaCubo));
		}
		
		System.out.println("  Number:     Square:     Cube:     ");
		for(contador = 0; contador < 11; contador++) {
			System.out.println("     " + (int) numero[contador] + "           " +(int) quadrados[contador] +  "         " + (int) cubos[contador]);
		}
	}

}
