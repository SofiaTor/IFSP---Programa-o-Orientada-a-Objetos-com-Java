/*Sofia Torres de Souza Freitas*/
package a07ex01;

public class A07ex01 {

    public static void main(String[] args) {

        // Fabricantes
        Fabricante logitech = new Fabricante("Logitech");
        Fabricante dell = new Fabricante("Dell");
        Fabricante samsung = new Fabricante("Samsung");

        // Produtos
        Produto hd = new Produto("HD Externo", "T7 Shield", samsung);
        Produto mouse = new Produto("Mouse Gamer", "G502", logitech);
        Produto teclado = new Produto("Teclado Mecânico", "KB216", dell);

        // Exibindo dados do HD
        System.out.println("Nome: " + hd.getNome());
        System.out.println("Modelo: " + hd.getModelo());
        System.out.println("Fabricante: " + hd.getFabricante().getNome());
    }
}