package br.ecomp.uefs.SPConsumer.model;

import java.util.List;

public class Nuvem {
    private List<Cliente> clientes;
    private int num;

    public Nuvem (int num){
        this.num = num;
        clientes.clear();
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void addCliente (Cliente o){
        clientes.add(o);
    }
}
