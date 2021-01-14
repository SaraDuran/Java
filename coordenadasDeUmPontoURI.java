/*Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0). Se o ponto estiver na origem, escreva a mensagem “Origem”. Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação.*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        System.out.print("\nDigite o valor para X e logo o valor para Y: \n");
        double X = entrada.nextDouble();
        double Y = entrada.nextDouble();

        if (X == 0 && Y == 0) {
            System.out.println("\nOrigem");
        } else if (X == 0 && Y != 0) {
            System.out.println("\nEixo Y");
        } else if (X != 0 && Y == 0) {
            System.out.println("\nEixo X");
        } else if (X > 0 && Y > 0) {
            System.out.println("\nQ1");
        } else if (X < 0 && Y > 0) {
            System.out.println("\nQ2");
        } else if (X < 0 && Y < 0) {
            System.out.println("\nQ3");
        } else if (X > 0 && Y < 0) {
            System.out.println("\nQ4");
        }
        entrada.close();
    }

}
