package fatura;

import java.util.Date;

public class Fatura {

    private String código;
    private double valor;
    private Date data;
    private Cliente cliente;

    public Fatura(String código, double valor, Date data, Cliente cliente) {
        this.código = código;
        this.valor = valor;
        this.data = data;
        this.cliente = cliente;
    }

    public String getCódigo() {
        return código;
    }

    public void setCódigo(String código) {
        this.código = código;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
