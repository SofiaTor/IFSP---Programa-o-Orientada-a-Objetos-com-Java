/*Sofia Torres de Souza Freitas*/
package a04ex02;

import java.util.Scanner;
import java.text.DecimalFormat;

public class A04ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num1, num2, resultado = 0;
        String operacao;

        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("Escolha a operação (soma, subtracao, multiplicacao, divisao, resto, potencia): ");
        operacao = sc.nextLine().toLowerCase();

        System.out.print("Digite o primeiro valor: ");
        num1 = sc.nextDouble();

        System.out.print("Digite o segundo valor: ");
        num2 = sc.nextDouble();

        switch (operacao) {
            case "soma" -> resultado = num1 + num2;
            case "subtracao" -> resultado = num1 - num2;
            case "multiplicacao" -> resultado = num1 * num2;
            case "divisao" -> {
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Erro: divisão por zero.");
                    return;
                }
            }
            case "resto" -> resultado = num1 % num2;
            case "potencia" -> resultado = Math.pow(num1, num2);
            default -> {
                System.out.println("Operação inválida.");
                return;
            }
        }
        System.out.println("Resultado: " + df.format(resultado));

        sc.close();
    }
}