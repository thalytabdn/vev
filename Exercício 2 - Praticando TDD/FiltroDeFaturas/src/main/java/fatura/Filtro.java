package fatura;

import java.util.ArrayList;
import java.util.Date;

public class Filtro {

    private ArrayList<Fatura> listaDeFaturas;

    public Filtro() {
        this.listaDeFaturas = new ArrayList<>();
    }

    public void addFatura(Fatura fatura) {
        this.listaDeFaturas.add(fatura);
    }

    public int getQtdFaturas() {
        return this.listaDeFaturas.size();
    }
}
