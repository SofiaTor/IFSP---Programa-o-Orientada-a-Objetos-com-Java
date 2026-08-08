/*Sofia Torres de Souza Freitas*/
package a05ex02;

import java.util.Scanner;

public class A05ex02 {
public static void main(String[] args) {

        int[][] matriz = new int[8][8];
    // Preenchendo a matriz
    try (Scanner sc = new Scanner(System.in)) {
        // Preenchendo a matriz
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                matriz[i][j] = i + j;
            }
        }

        System.out.print("Digite um valor inteiro: ");
        int valor = sc.nextInt();

        // Regra nova
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {

                if (matriz[i][j] % 2 == 0) {
                    matriz[i][j] += valor; // incrementa
                } else {
                    matriz[i][j] -= valor; // decrementa
                }

            }
        }
        
        // Mostrar matriz
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
    }
}