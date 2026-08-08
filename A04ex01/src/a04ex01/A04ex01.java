/*Sofia Torres de Souza Freitas*/
package a04ex01;

import java.util.Scanner;

public class A04ex01 {
public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        int inicio, fim;
        System.out.print("Digite o valor inicial: ");
        inicio = sc.nextInt();
        System.out.print("Digite o valor final: ");
        fim = sc.nextInt();
               for (int i = inicio; i <= fim; i++) {
            System.out.println(i);
        }
    }
    }
}
