import java.util.Scanner;

public class Robozinho {
	Scanner sc = new Scanner(System.in);
	
	String nomeRobozinho;
	int X, Y, passosV, passosH;
	int sentido;
	char direcao_1, direcao_2;
	int sair;
	
	void inicializarRobo() {
		System.out.println("\n===== INICIALIZANDO =====\n");
		System.out.println("\nDigite o nome do Robo: ");
		nomeRobozinho = sc.nextLine(); 
		X = 3;
		Y = 4;
		direcao_1 = 'L'; //horizontal
		direcao_2 = 'N'; //vertical
		System.out.println("\n O Robo " + nomeRobozinho + " esta nas coordenadas (X,Y): ( " + X + " , " + Y + " ) na direcao " + direcao_2 + direcao_1);
		}
	
	void moverRobo() {
		Y += 3; //North
		X -= 5; //West
		direcao_1 = 'O';
		direcao_2 = 'N';
		System.out.println("\n O Robo " + nomeRobozinho + " esta nas coordenadas (X,Y): ( " + X + " , " + Y + " ) na direcao " + direcao_2 + direcao_1);
	}
	
	void caminhar() {
		System.out.println("\n===== ROBO CAMINHANDO =====\n");
		
		do {
		
		System.out.println("\nEm que DIRECAO o robo  " + nomeRobozinho + "  ira? \nDigite 1 para VERTICAL ou 2 para HORIZONTAL: ");
		sentido = sc.nextInt();
		if(sentido == 1) {
			System.out.println("\nEm que SENTIDO o robo " + nomeRobozinho + "  ira? \nDigite N para NORTE ou S para SUL:");
			direcao_2 = sc.next().charAt(0);
			System.out.println("\nQuantos PASSOS o Robo " + nomeRobozinho + " ira caminhar? ");
			passosV = sc.nextInt();
			while (passosV < 0) {
				System.out.println("Numero de passos invalido. Quantos PASSOS o Robo " + nomeRobozinho + " ira caminhar? ");
				passosV = sc.nextInt();
			}
			
		} else if (sentido == 2){
			System.out.println("\nEm que SENTIDO o robo " + nomeRobozinho + "  ira? \nDigite L para LESTE ou O para OESTE:");
			direcao_1 = sc.next().charAt(0);
			System.out.println("\nQuantos PASSOS o Robo  " + nomeRobozinho + " ira caminhar? ");
			passosH = sc.nextInt();
			while (passosH < 0) {
				System.out.println("Numero de passos invalido. Quantos PASSOS o Robo " + nomeRobozinho + " ira caminhar? ");
				passosH = sc.nextInt();
			}
		}
			
		if (direcao_2 == 'N') {
			Y += passosV;
		}else if (direcao_2 == 'S') {
			Y -= passosV;
		}
		if (direcao_1 == 'L') {
			X += passosH;
		}else if(direcao_1 == 'O') {
			X -= passosH;
		}
		
		if(X > 0) {
			direcao_1 = 'L';
		} else {
			direcao_1 = 'O';
		}
		if(Y > 0) {
			direcao_2 = 'N';
		}else {
			direcao_2 = 'S';
		}
		
		
		
		System.out.println("\n O Robo " + nomeRobozinho + " esta nas coordenadas (X,Y): ( " + X + " , " + Y + " ) na direcao " + direcao_2 + direcao_1);
		
		System.out.println("\nDeseja repetir o processo para dar mais passos em outra direcao? digite 1 para repetir ou 0 para sair. ");
		sair = sc.nextInt();
		} while(sair != 0);
	}

	

	
}
