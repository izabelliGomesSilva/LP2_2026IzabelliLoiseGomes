package br.edu.ifpr.modelo;

public class Visita {

    private int id;
    private String nomeCliente;
    private int data;
    private int hora;
    private String roteiro;
    private int qtdCliente;

     public Visita(){
        
    }

    public Visita(int id, String nomeCliente, int data, int hora, String roteiro, int qtdCliente) {
        this.id = id;
        this.nomeCliente = nomeCliente;
        this.data = data;
        this.hora = hora;
        this.roteiro = roteiro;
        this.qtdCliente = qtdCliente;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public String getRoteiro() {
        return roteiro;
    }

    public void setRoteiro(String roteiro) {
        this.roteiro = roteiro;
    }

    public int getQtdCliente() {
        return qtdCliente;
    }

    public void setQtdCliente(int qtdCliente) {
        this.qtdCliente = qtdCliente;
    }

    
}
