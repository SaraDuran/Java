import java.util.Scanner;

public class Banco {
	Scanner sc = new Scanner(System.in);
	
	String nomeDoCliente;
	int codigoCliente;
	float saldo = 0;
	
	void cadastro() {
		System.out.println("\n===== CADASTRO DE CONTA BANCARIA =====\n");
		System.out.println("\nDigite seu nome: ");
		nomeDoCliente = sc.nextLine(); 
		System.out.println("\nInvente seu codigo para entrar na conta: ");
		codigoCliente = sc.nextInt();
		System.out.println("\nUsuario " + nomeDoCliente + "\nConta numero: " + codigoCliente + "\nSua conta iniciara com 0,0 reais. ");
	}
	
	void depositar() {
		System.out.println("\n===== DEPOSITO =====\n");
		System.out.println("Digite quanto dinheiro será depositado: ");
		float deposito = sc.nextFloat();
		saldo += deposito;
		System.out.println("\nUsuario " + nomeDoCliente + "\nConta numero: " + codigoCliente + "\nSeu novo saldo e de: " + saldo + " reais. ");
		
	}
	void sacar() {
		System.out.println("\n===== SAQUE =====\n");
		System.out.println("Digite quanto dinheiro será sacado: ");
		float saque = sc.nextFloat();
		saldo -= saque;
		System.out.println("\nUsuario " + nomeDoCliente + "\nConta numero: " + codigoCliente + "\nSeu novo saldo e de: " + saldo + " reais. ");
	}
	void verSaldo(){
		System.out.println("\n===== SALDO =====\n");
		System.out.println("\nUsuario " + nomeDoCliente + "\nConta numero: " + codigoCliente + "\nSeu saldo e de: " + saldo + " reais. ");
	}

}
