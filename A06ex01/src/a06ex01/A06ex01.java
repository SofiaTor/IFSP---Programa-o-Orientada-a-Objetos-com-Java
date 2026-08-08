/*Sofia Torres de Souza Freitas*/
package a06ex01;

public class A06ex01 {
      
// 1. Método que retorna o nome do indivíduo pelo código
    public static String buscarNome(int codigo) {

        return switch (codigo) {
            case 1 -> "João";
            case 2 -> "Maria";
            case 3 -> "Carlos";
            default -> "Indivíduo não encontrado";
        };
    }

    // 2. Método que mostra o maior número
    public static void maiorNumero(int n1, int n2) {

        if (n1 > n2) {
            System.out.println("Maior número: " + n1);
        } else if (n2 > n1) {
            System.out.println("Maior número: " + n2);
        } else {
            System.out.println("Os números são iguais");
        }
    }

    // 3. Método imprimir mensagem gráfica
    public static void imprimir(String texto) {

        System.out.println("***********************");
        System.out.println("* " + texto);
        System.out.println("***********************");
    }

    public static void main(String[] args) {

        // Teste questão 1
        System.out.println(buscarNome(2));

        // Teste questão 2
        maiorNumero(10, 20);

        // Teste questão 3
        imprimir("Bem-vindo ao sistema!");
    }
}
