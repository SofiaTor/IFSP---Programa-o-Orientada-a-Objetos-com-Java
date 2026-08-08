/*Sofia Torres de Souza Freitas*/
package a04ex04;

import java.util.Scanner;

public class A04ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String resposta;

        // PERGUNTA 1
        System.out.print("Qual seu prato preferido? ");
        resposta = sc.nextLine().toLowerCase();

        if (resposta.contains("lasanha") || resposta.contains("pizza") || resposta.contains("churrasco")) {
            System.out.println("Eu adoro isso!");
        } else {
            System.out.println("Disso eu não gosto muito!");
        }

        // PERGUNTA 2
        System.out.print("\nQual seu hobby favorito? ");
        resposta = sc.nextLine().toLowerCase();

        if (resposta.contains("jogar") || resposta.contains("ler") || resposta.contains("estudar")) {
            System.out.println("Ótima escolha, isso é produtivo!");
        } else {
            System.out.println("Hmm... interessante, mas não curto muito.");
        }

        // PERGUNTA 3
        System.out.print("\nQual seu estilo de música favorito? ");
        resposta = sc.nextLine().toLowerCase();

        if (resposta.contains("rock") || resposta.contains("rap") || resposta.contains("pop")) {
            System.out.println("Esse estilo é top!");
        } else {
            System.out.println("Não é muito a minha vibe.");
        }

        sc.close();
    }
}