import java.util.Scanner; 

public class Main{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		int sexo;
		double peso, altura, IMC;
		double h_imc[] = {20.7, 26.4};
		double m_imc[] = {19.1, 25.8};
	
		String h_resultado = ("\n\n Abaixo do peso: Menor que 20,7. \n Peso ideal: Maior que 20,7 e Menor que 26,4. \n Acima do peso: 26,4.\n");
		String m_resultado = ("\n\n Abaixo do peso: Menor que 19,1. \n Peso ideal: Maior que 19,1 e Menor que 25,8. \n Acima do peso: 25,8.\n");
	
		System.out.print("Qual é o seu sexo: masculino ou feminino? \n Para masculino digite [1]. \n Para feminino digite [2]. \n");		
		sexo = sc.nextInt();
			
		if (sexo == 1)
		{
			System.out.print("- Opcao digitada: masculino");
		}
	
		if (sexo == 2)
		{
			System.out.print("- Opcao digitada: feminino");
		}
	
		System.out.print("\n\n Digite seu peso (com virgula), exemplo: 60,5\n");		
		peso = sc.nextDouble();
		System.out.printf("- O seu peso é: %6.1f kilogramas!", peso);
	
		System.out.print("\n\n Qual é a sua altura [Exemplo: 1,70]?\n");		
		altura = sc.nextDouble(); 
		System.out.printf("- A sua altura é: %6.2f metros!", altura);
	
		IMC = peso / ((altura)*(altura)); 
	
		if (sexo == 1)
		{
			if (IMC < h_imc[0])
			{
				System.out.print("\n\n Resultado IMC :");
				System.out.printf("\n- O seu indice de massa corporal é: %6.1f. Você está abaixo do peso!", IMC);
				System.out.print(h_resultado);
			}
	
			if ((IMC > h_imc[0]) && (IMC < h_imc[1]))
			{
				System.out.print("\n\n Resultado IMC:");
				System.out.printf("\n- O seu indice de massa corporal é: %6.1f. Você está no peso ideal!", IMC);
				System.out.print(h_resultado);
			}
	
			if (IMC > h_imc[1])
			{
				System.out.print("\n\n Resultado IMC:");
				System.out.printf("\n- O seu indice de massa corporal é: %6.1f. Você está acima do peso!", IMC);
				System.out.print(h_resultado);
			}
		}
	
		if (sexo == 2)
		{
			if (IMC < m_imc[0])
			{
				System.out.print("\n\n Resultado IMC:");
				System.out.printf("\n- O seu indice de massa corporal é: %6.1f. Você está abaixo do peso!", IMC);
				System.out.print(m_resultado);
			}
	
			if ((IMC > m_imc[0]) && (IMC < m_imc[1]))	
			{	
				System.out.print("\n\n Resultado IMC:");	
				System.out.printf("\n- O seu indice de massa corporal é: %6.1f. Você está no peso ideal!", IMC);
				System.out.print(m_resultado);
			}
	
			if (IMC > m_imc[1])
			{
				System.out.print("\n\n Resultado IMC:");
				System.out.printf("\n- O seu indice de massa corporal é: %6.1f. Você está acima do peso!", IMC);
				System.out.print(m_resultado);
			}
		}
		sc.close();
	}
}

