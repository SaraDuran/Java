/*
Maria acabou de iniciar seu curso de graduação na faculdade de medicina e precisa de sua ajuda para organizar os experimentos de um laboratório o qual ela é responsável. Ela quer saber no final do ano, quantas cobaias foram utilizadas no laboratório e o percentual de cada tipo de cobaia utilizada.

Este laboratório em especial utiliza três tipos de cobaias: sapos, ratos e coelhos. Para obter estas informações, ela sabe exatamente o número de experimentos que foram realizados, o tipo de cobaia utilizada e a quantidade de cobaias utilizadas em cada experimento.
*/

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int n = sc.nextInt();
       
        int quantia;
        int ratos = 0, coelhos = 0, sapos = 0, total = 0;
        int contador;
        char tipoCobaia;
        for (contador = 0; contador < n; contador++) {
            quantia = sc.nextInt();
            tipoCobaia = sc.next().charAt(0);
           
            switch (tipoCobaia) {
               
                case 'C':
                	coelhos += quantia;
                    break;
                case 'R':
                	ratos += quantia;
                    break;
                case 'S':
                	sapos += quantia;
                    break;                   
            }
            total += quantia;
        }
       
        System.out.println("Total: " + total + " cobaias");
        System.out.println("Total de coelhos: " + coelhos);
        System.out.println("Total de ratos: " + ratos);
        System.out.println("Total de sapos: " + sapos);
       
        System.out.println("Percentual de coelhos: " + String.format("%.2f", ( (double) coelhos / total) * 100) + " %");
        System.out.println("Percentual de ratos: " + String.format("%.2f", ( (double) ratos / total) * 100) + " %");
        System.out.println("Percentual de sapos: " + String.format("%.2f", ( (double) sapos / total) * 100) + " %");
       
        sc.close();
    }
}
