package fatura;

import java.util.Date;

public class Cliente {

    private String nome;
    private Date data;
    private String estado;

    public Cliente(String nome, Date data, String estado) {
        this.nome = nome;
        this.data = data;
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
