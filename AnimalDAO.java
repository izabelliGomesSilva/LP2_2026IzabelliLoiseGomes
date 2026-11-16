package br.edu.ifpr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.edu.ifpr.modelo.Animal;

public class AnimalDAO {

    public void inserir(Animal animal) throws SQLException{
        String sql="INSERT INTO animal(id, especie, nome, peso, idade, dieta, sexo, horaAlimentacao, estadoSaude) VALUES (?,?,?,?,?,?,?,?,?);";
        Connection conexao = null;
        PreparedStatement stmt = null;

        try {
            conexao = Conexao.conectar();
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, animal.getId());
            stmt.setString(2, animal.getEspecie());
            stmt.setString(3, animal.getNome());
            stmt.setInt(4, animal.getPeso());
            stmt.setInt(5, animal.getIdade());
            stmt.setString(6, animal.getDieta());
            stmt.setString(7, animal.getSexo());
            stmt.setInt(8, animal.getHoraAlimentacao());
            stmt.setString(9, animal.getEstadoSaude());
            stmt.executeUpdate();
            System.out.println("animal inserido com sucesso");
            
        }catch(SQLException ex){
            System.out.println("Erro ao inserir animal "+ex.getMessage());

        }finally{
            stmt.close();
            conexao.close();
        }

    }

    public List<Animal> listar() throws SQLException{
        String sql = "SELECT * FROM animais";
        List<Animal> animais = new ArrayList<>();
        Connection conexao = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conexao = Conexao.conectar();
            stmt = conexao.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next()){
                Animal animal = new Animal();
                animal.setId(rs.getInt("id: "));
                animal.setEspecie(rs.getString("Especie: "));
                animal.setNome(rs.getString("Nome: "));
                animal.setPeso(rs.getInt("Peso: "));
                animal.setIdade(rs.getInt("Idade: "));
                animal.setDieta(rs.getString("Dieta: "));
                animal.setSexo(rs.getString("Sexo: "));
                animal.setHoraAlimentacao(rs.getInt("Hora Alimentação: "));
                animal.setEstadoSaude(rs.getString("Estado Saúde: "));
                animais.add(animal);
            }
            
        } catch (SQLException ex) {
            System.out.println("Erro ao listar animais "+ex.getMessage());
        } finally {
            rs.close();
            stmt.close();
            conexao.close();
        }
        return animais;
    }
}
