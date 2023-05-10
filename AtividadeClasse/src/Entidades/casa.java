package Entidades;

public class casa extends Propriedade{
    String descricao;
    String fotos;
    String comodidade;
    public casa(String endereco, int numQartos, Double preco) {

        super(endereco, numQartos, preco);
    }

    @Override
    public void mostrarImoveis() {

    }
}
