package br.edu.ifpr.modelo;

public class Estoque {
    
    private int id;
    private String nomeItem;
    private String tipo;
    private String categoria;

     public Estoque(){
        
    }

public Estoque(int id, String nomeItem, String tipo, String categoria) {
        this.id = id;
        this.nomeItem = nomeItem;
        this.tipo = tipo;
        this.categoria = categoria;
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNomeItem() {
        return nomeItem;
    }
    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
