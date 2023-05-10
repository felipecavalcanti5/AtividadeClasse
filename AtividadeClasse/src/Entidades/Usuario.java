package Entidades;

public abstract class Usuario {
    String nome;
    String email;
    int numTelefone;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumTelefone() {
        return numTelefone;
    }

    public void setNumTelefone(int numTelefone) {
        this.numTelefone = numTelefone;
    }

    public Usuario(String nome, String email, int numTelefone) {
        this.nome = nome;
        this.email = email;
        this.numTelefone = numTelefone;
    }
    public abstract void mostrar();
    public abstract void adicionar();
}
