
package feriasfuncionario;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FeriasFuncionario {

    public static void main(String[] args) {

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            String dataInicioStr = JOptionPane.showInputDialog(
                    "Informe a data de início das férias (dd/MM/yyyy):");

            String dataFimStr = JOptionPane.showInputDialog(
                    "Informe a data de término das férias (dd/MM/yyyy):");

            LocalDate dataInicio = LocalDate.parse(dataInicioStr, formato);
            LocalDate dataFim = LocalDate.parse(dataFimStr, formato);

            if (dataFim.isBefore(dataInicio)) {
                JOptionPane.showMessageDialog(null,
                        "A data de término não pode ser anterior à data de início!");
                return;
            }

            StringBuilder resultado = new StringBuilder();
            resultado.append("PERÍODO DE FÉRIAS\n\n");

            LocalDate dataAtual = dataInicio;
            int contador = 1;

            while (!dataAtual.isAfter(dataFim)) {
                resultado.append("Dia ")
                         .append(contador)
                         .append(" - ")
                         .append(dataAtual.format(formato))
                         .append("\n");

                dataAtual = dataAtual.plusDays(1);
                contador++;
            }

            JOptionPane.showMessageDialog(null, resultado.toString());

        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null,
                    "Data inválida! Utilize o formato dd/MM/yyyy.");
        }
    }
}
