package br.ecomp.uefs.SPConsumer.model;

import java.util.Date;

public class Medidor {
    private float consumo;
    private Date data;

    public Medidor(float consumo, Date data) {
        this.consumo = consumo;
        this.data = data;
    }

    public float getConsumo() {
        return consumo;
    }

    public void setConsumo(float consumo) {
        this.consumo = consumo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

}
