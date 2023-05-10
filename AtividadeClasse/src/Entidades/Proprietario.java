package Entidades;

import java.util.ArrayList;

public class Proprietario extends Usuario {
    ArrayList<Propriedade> wishList = new ArrayList<Propriedade>();
    public Proprietario(String nome, String email, int numTelefone) {
        super(nome, email, numTelefone);

    }

    @Override
    public void mostrar() {
        for(Propriedade p: wishList){
            p.mostrarImoveis();
        }
    }


    @Override
    public void adicionar() {
            for (Propriedade p: wishList){
        }

    }

}
