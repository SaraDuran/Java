/*Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando essas informações.*/

import java.util.Scanner;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int n = sc.nextInt();
        int x[] = new int[n];
        int in = 0, out = 0;
        int contador;
        
        for (contador = 0; contador < x.length; contador++) {
            x[contador] = sc.nextInt();
            if (x[contador] >= 10 && x[contador] <= 20) {
                in++;
            } else {
                out++;
            }
        }
       
        System.out.println(in + " in");
        System.out.println(out + " out");
        sc.close();
    }
}
