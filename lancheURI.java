/*Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar. O arquivo de entrada contém dois valores inteiros correspondentes ao código e à quantidade de um item conforme tabela acima. O arquivo de saída deve conter a mensagem "Total: R$ " seguido pelo valor a ser pago, com 2 casas após o ponto decimal.*/





import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner entrada = new Scanner(System.in);
        int codigo, conta;
        
	System.out.println("\n*** MENU ***\n");
	System.out.println("\nOpcao 1: Cachorro Quente    | Preco: 4.00 ");
	System.out.println("\nOpcao 2: X-Salada    | Preco: 4.50 ");
	System.out.println("\nOpcao 3: X-Bacon    | Preco: 5.00 ");
	System.out.println("\nOpcao 4: Torrada Simples    | Preco: 2.00 ");
	System.out.println("\nOpcao 5: Refrigerante    | Preco: 1.50 ");
	System.out.println("\nEscolha uma opcao digitando 1, 2, 3, 4, ou 5. ");
        codigo = entrada.nextInt();
	System.out.println("\nDigite quantas unidades deseja da opcao digitada. ");
        conta = entrada.nextInt();

        if (codigo == 1) {
            System.out.printf("Total: R$ %.2f\n",conta*4.00);
        }
        if (codigo == 2) {
            System.out.printf("Total: R$ %.2f\n",conta*4.50);
        }
        if (codigo == 3) {
            System.out.printf("Total: R$ %.2f\n",conta*5.00);
        }
        if (codigo == 4) {
            System.out.printf("Total: R$ %.2f\n",conta*2.00);
        }
        if (codigo == 5) {
            System.out.printf("Total: R$ %.2f\n",conta*1.50);
        }
        entrada.close();
    }

}
