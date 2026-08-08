/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a03ex01;

import java.util.Scanner;

public class A03ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a largura da parede (m): ");
        float largura = sc.nextFloat();

        System.out.print("Digite a altura da parede (m): ");
        float altura = sc.nextFloat();

        float area = largura * altura;
        float tijolos = area * 20;

        System.out.println("Área da parede: " + area + " m²");
        System.out.println("Quantidade de tijolos necessários: " + tijolos);
    }
}