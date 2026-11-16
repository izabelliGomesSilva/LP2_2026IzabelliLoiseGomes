package br.edu.ifpr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.edu.ifpr.modelo.Funcionario;

public class FuncionarioDAO {

    public void inserir(Funcionario funcionario) throws SQLException{
        String sql="INSERT INTO funcionarios(id, nomeFuncionario, cpf, dataNasc, cargo) VALUES (?,?,?,?,?);";
        Connection conexao = null;
        PreparedStatement stmt = null;

        try {
            conexao = Conexao.conectar();
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, funcionario.getId());
            stmt.setString(2, funcionario.getNomeFuncionario());
            stmt.setInt(3, funcionario.getCpf());
            stmt.setInt(4, funcionario.getDataNasc());
            stmt.setString(5, funcionario.getCargo());
            stmt.executeUpdate();
            System.out.println("Funcionário inserido com sucesso");
            
        }catch(SQLException ex){
            System.out.println("Erro ao inserir funcionário "+ex.getMessage());

        }finally{
            stmt.close();
            conexao.close();
        }

    }

    public List<Funcionario> listar() throws SQLException{
        String sql = "SELECT * FROM visitas";
        List<Funcionario> funcionarios = new ArrayList<>();
        Connection conexao = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conexao = Conexao.conectar();
            stmt = conexao.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next()){
                Funcionario funcionario = new Funcionario();
                funcionario.setId(rs.getInt("id: "));
                funcionario.setNomeFuncionario(rs.getString("Nome Funcionario: "));
                funcionario.setCpf(rs.getInt("CPF: "));
                funcionario.setDataNasc(rs.getInt("Data Nascimento: "));
                funcionario.setCargo(rs.getString("Cargo: "));
                funcionarios.add(funcionario);
            }
            
        } catch (SQLException ex) {
            System.out.println("Erro ao listar produtos "+ex.getMessage());
        } finally {
            rs.close();
            stmt.close();
            conexao.close();
        }
        return funcionarios;
    }
}
