/*Sofia Torres de Souza Freitas*/
package a04ex03;

import java.util.Scanner;

public class A04ex03 {
public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        String texto;

        System.out.print("Digite um texto: ");
        texto = sc.nextLine();

        String resultado = texto.replaceAll("[aeiouAEIOU]", "");

        System.out.println("Texto sem vogais: " + resultado);
    }
    }
}