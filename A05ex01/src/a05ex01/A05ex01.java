/*Sofia Torres de Souza Freitas*/
package a05ex01;

import java.util.Scanner;

public class A05ex01 {
    public static void main(String[] args) {

        int[][] matriz = new int[8][8];
        // Preenchendo a matriz (exemplo simples)
        try (Scanner sc = new Scanner(System.in)) {
            // Preenchendo a matriz (exemplo simples)
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    matriz[i][j] = i + j; // só pra não ficar vazio
                }
            }
            
            System.out.print("Digite um valor inteiro: ");
            int valor = sc.nextInt();
            
            // Substituir posições pares
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    if (matriz[i][j] % 2 == 0) {
                        matriz[i][j] = valor;
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