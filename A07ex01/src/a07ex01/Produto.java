/*Sofia Torres de Souza Freitas*/
package a07ex01;

// Classe Produto
public class Produto {
    private String nome;
    private String modelo;
    private Fabricante fabricante;

    // Construtor vazio
    public Produto() {
    }

    // Construtor completo
    public Produto(String nome, String modelo, Fabricante fabricante) {
        this.nome = nome;
        this.modelo = modelo;
        this.fabricante = fabricante;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }
}
