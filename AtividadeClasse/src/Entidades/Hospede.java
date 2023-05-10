package Entidades;

import java.util.ArrayList;

public class Hospede extends Usuario{

    ArrayList<Propriedade> wishList = new ArrayList<Propriedade>();

    public Hospede(String nome, String email, int numTelefone, ArrayList<Propriedade> wishList) {
        super(nome, email, numTelefone);
        this.wishList = wishList;
    }
    public void AddPropriedade(){

    }

    @Override
    public void mostrar() {


    }

    @Override
    public void adicionar() {

    }
}


