import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int op = 0;
		int repetir = 0;
		Banco c1 = new Banco();
		
		c1.cadastro();
		do {
		System.out.println("\n===== OPCOES PARA CONTA BANCARIA =====\n");
		System.out.println("\nEscolha uma das seguintes opcoes: \n");
		System.out.println("\n 1 para DEPOSITAR dinheiro em sua conta.");
		System.out.println("\n 2 para SACAR dinheiro da sua conta.");
		System.out.println("\n 3 para CONSULTAR seu saldo.");
		op = sc.nextInt();
	
			if (op == 1){
				c1.depositar();
			}else if(op == 2){
				c1.sacar();
			}else if(op == 3){
				c1.verSaldo();
			}else {
				System.out.println("Erro. Repita a operacao e digite um numero valido.");
			}
			System.out.println("\nDeseja fazer outra operacao? digite 1. Para sair, digite 0");
			repetir = sc.nextInt();
		}while(repetir != 0);
		
		sc.close();
	}

}
