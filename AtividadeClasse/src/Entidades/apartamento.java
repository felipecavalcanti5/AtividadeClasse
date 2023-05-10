package Entidades;

public class apartamento extends Propriedade{
    String descricao;
    String fotos;
    String comodidade;

    public apartamento(String endereco, int numQartos, Double preco, String descricao, String fotos, String comodidade) {
        super(endereco, numQartos, preco);
        this.descricao = descricao;
        this.fotos = fotos;
        this.comodidade = comodidade;
    }

    @Override
    public void mostrarImoveis() {

    }
}
