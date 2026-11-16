package br.edu.ifpr.modelo;

public class Animal {
    
    private int id;
    private String especie;
    private String nome;
    private int peso;
    private int idade;
    private String dieta;
    private String sexo;
    private int horaAlimentacao;
    private String estadoSaude;

     public Animal(){
        
    }

    public Animal(int id, String especie, String nome, int peso, int idade, String dieta, String sexo,
            int horaAlimentacao, String estadoSaude) {
        this.id = id;
        this.especie = especie;
        this.nome = nome;
        this.peso = peso;
        this.idade = idade;
        this.dieta = dieta;
        this.sexo = sexo;
        this.horaAlimentacao = horaAlimentacao;
        this.estadoSaude = estadoSaude;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getDieta() {
        return dieta;
    }
    public void setDieta(String dieta) {
        this.dieta = dieta;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public int getHoraAlimentacao() {
        return horaAlimentacao;
    }
    public void setHoraAlimentacao(int horaAlimentacao) {
        this.horaAlimentacao = horaAlimentacao;
    }
    public String getEstadoSaude() {
        return estadoSaude;
    }
    public void setEstadoSaude(String estadoSaude) {
        this.estadoSaude = estadoSaude;
    }

}
