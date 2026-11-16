package br.edu.ifpr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.edu.ifpr.modelo.Estoque;

public class EstoqueDAO {

    public void inserir(Estoque estoque) throws SQLException{
        String sql="INSERT INTO estoque(id, nomeItem, tipo, Categoria) VALUES (?,?,?,?);";
        Connection conexao = null;
        PreparedStatement stmt = null;

        try {
            conexao = Conexao.conectar();
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, estoque.getId());
            stmt.setString(2, estoque.getNomeItem());
            stmt.setString(3, estoque.getTipo());
            stmt.setString(4, estoque.getCategoria());
            stmt.executeUpdate();
            System.out.println("estoque inserido com sucesso");
            
        }catch(SQLException ex){
            System.out.println("Erro ao inserir estoque "+ex.getMessage());

        }finally{
            stmt.close();
            conexao.close();
        }

    }

    public List<Estoque> listar() throws SQLException{
        String sql = "SELECT * FROM estoques";
        List<Estoque> estoques = new ArrayList<>();
        Connection conexao = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conexao = Conexao.conectar();
            stmt = conexao.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next()){
                Estoque estoque = new Estoque();
                estoque.setId(rs.getInt("id: "));
                estoque.setNomeItem(rs.getString("Nome Item: "));
                estoque.setTipo(rs.getString("Tipo: "));
                estoque.setCategoria(rs.getString("Categoria: "));
                estoques.add(estoque);
            }
            
        } catch (SQLException ex) {
            System.out.println("Erro ao listar produtos "+ex.getMessage());
        } finally {
            rs.close();
            stmt.close();
            conexao.close();
        }
        return estoques;
    }
}
