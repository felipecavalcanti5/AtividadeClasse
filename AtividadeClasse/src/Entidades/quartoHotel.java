package Entidades;

public class quartoHotel extends Propriedade{
    String descricao;
    String fotos;
    String comodidade;
    public quartoHotel(String endereco, int numQartos, Double preco) {
        super(endereco, numQartos, preco);
    }

    @Override
    public void mostrarImoveis() {

    }
}
