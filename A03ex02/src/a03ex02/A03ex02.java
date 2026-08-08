/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a03ex02;

import javax.swing.JOptionPane;

public class A03ex02 {
    public static void main(String[] args) {

        try {
            String larguraStr = JOptionPane.showInputDialog("Digite a largura da parede (m):");
            String alturaStr = JOptionPane.showInputDialog("Digite a altura da parede (m):");

            float largura = Float.parseFloat(larguraStr);
            float altura = Float.parseFloat(alturaStr);

            float area = largura * altura;
            float tijolos = area * 20;

            JOptionPane.showMessageDialog(null,
                    "Área: " + area + " m²\nTijolos: " + tijolos,
                    "Sofia Torres de Souza Freitas",
                    JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Erro! Digite apenas números.",
                    "Sofia Torres de Souza Freitas",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}