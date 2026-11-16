package br.edu.ifpr.modelo;

    public class Funcionario {
    private int id;
    private String nomeFuncionario;
    private int cpf;
    private int dataNasc;
    private String cargo;

    public Funcionario(){
        
    }
    
    
    public Funcionario(int id, String nomeFuncionario, int cpf, int dataNasc, String cargo) {
        this.id = id;
        this.nomeFuncionario = nomeFuncionario;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
        this.cargo = cargo;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(int dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    
}
