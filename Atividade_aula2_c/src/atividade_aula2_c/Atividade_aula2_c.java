/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade_aula2_c;

/**
 *
 * @author sofia
 */
//Nome: Sofia Torres de Souza Freitas

public class Atividade_aula2_c {
    public static void main(String[] args) {
        // Verifica se foram passados dois valores
        if (args.length < 2) {
            System.out.println("Por favor, informe dois valores ao executar o programa.");
            return;
        }
        
        // Convertendo os argumentos para números
        double valor1 = Double.parseDouble(args[0]);
        double valor2 = Double.parseDouble(args[1]);
        
        // Cálculos
        double resto = valor1 % valor2;
        double produto = valor1 * valor2;
        double media = (valor1 + valor2) / 2;
        
        // Exibindo resultados
        System.out.println("Resto da divisão: " + resto);
        System.out.println("Produto: " + produto);
        System.out.println("Média: " + media);
    }
}