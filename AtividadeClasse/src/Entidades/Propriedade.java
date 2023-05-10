package Entidades;

public abstract class Propriedade {
    String Endereco;
    int numQartos;
    Double preco;



    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String endereco) {
        Endereco = endereco;
    }

    public int getNumQartos() {
        return numQartos;
    }

    public void setNumQartos(int numQartos) {
        this.numQartos = numQartos;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Propriedade(String endereco, int numQartos, Double preco) {
        Endereco = endereco;
        this.numQartos = numQartos;
        this.preco = preco;
    }
    public abstract void mostrarImoveis();
}

