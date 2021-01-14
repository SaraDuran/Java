import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float X, Y;
		
		System.out.println("\nDigite um numero X a seguir: ");
		X = sc.nextFloat();
		System.out.println("\nDigite um numero Y a seguir: ");
		Y = sc.nextFloat();
		
		Operacoes.operacaoSoma(X, Y);
		Operacoes.operacaoSubtracao(X, Y);
		Operacoes.operacaoMultiplicacao(X, Y);
		Operacoes.operacaoDivisao(X, Y);
		Operacoes.operacaoDivisaoResto(X, Y);
		
		System.out.println("X + Y = " + Operacoes.operacaoSoma(X,Y));
		System.out.println("X - Y = " + Operacoes.operacaoSubtracao(X,Y));
		System.out.println("X * Y = " + Operacoes.operacaoMultiplicacao(X,Y));
		System.out.println("X / Y = " + Operacoes.operacaoDivisao(X,Y));
		System.out.println("X % Y = " + Operacoes.operacaoDivisaoResto(X,Y));
		sc.close();
	}

}
