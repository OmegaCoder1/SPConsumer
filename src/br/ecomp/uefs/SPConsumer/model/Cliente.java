package br.ecomp.uefs.SPConsumer.model;
/** 
 * Está classe define o cliente.
 * @author Robson
*/
public class Cliente {
    private int ID;
    private String nome;

    public Cliente(int ID, String nome) {
        this.ID = ID;
        this.nome = nome;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
