/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a03ex03;

import javax.swing.JOptionPane;

public class A03ex03 {
    public static void main(String[] args) {

        try {
            String larguraStr = JOptionPane.showInputDialog("Digite a largura da parede (m):");
            String alturaStr = JOptionPane.showInputDialog("Digite a altura da parede (m):");

            float largura = Float.parseFloat(larguraStr);
            float altura = Float.parseFloat(alturaStr);

            float area = largura * altura;
            float tijolos = area * 20;

            String classificacao;

            if (altura < 3) {
                classificacao = "Parede BAIXA";
            } else if (altura <= 3.5) {
                classificacao = "Parede MÉDIA";
            } else {
                classificacao = "Parede ALTA";
            }

            JOptionPane.showMessageDialog(null,
                    "Área: " + area + " m²\nTijolos: " + tijolos + "\nClassificação: " + classificacao,
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