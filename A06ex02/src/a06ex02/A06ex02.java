/*Sofia Torres de Souza Freitas*/
package a06ex02;

public class A06ex02 {

      // 4. Método que retorna o dia da semana
    public static String diaSemana(int dia) {

        return switch (dia) {
            case 1 -> "Segunda-feira";
            case 2 -> "Terça-feira";
            case 3 -> "Quarta-feira";
            case 4 -> "Quinta-feira";
            case 5 -> "Sexta-feira";
            case 6 -> "Sábado";
            case 7 -> "Domingo";
            default -> "Dia inválido";
        };
    }

    // 5. Sobrecarga do método
    // tipo 1 = texto
    // tipo 2 = gráfico
    public static void diaSemana(int dia, int tipo) {

        String nomeDia = diaSemana(dia);

        switch (tipo) {
            case 1 -> // mensagem texto
                System.out.println(nomeDia);
            case 2 -> {
                // mensagem gráfica
                System.out.println("====================");
                System.out.println("  " + nomeDia);
                System.out.println("====================");
            }
            default -> System.out.println("Tipo de mensagem inválido");
        }
    }

    public static void main(String[] args) {

        // Teste método normal
        System.out.println(diaSemana(3));

        // Teste sobrecarga tipo texto
        diaSemana(5, 1);

        // Teste sobrecarga tipo gráfico
        diaSemana(7, 2);
    }
}