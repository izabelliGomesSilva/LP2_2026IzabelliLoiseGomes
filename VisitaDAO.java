package br.edu.ifpr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.edu.ifpr.modelo.Visita;

public class VisitaDAO {

    public void inserir(Visita visita) throws SQLException{
        String sql="INSERT INTO visitas(id, nomeCliente, data, hora, roteiro, qtdCliente) VALUES (?,?,?,?,?,?);";
        Connection conexao = null;
        PreparedStatement stmt = null;

        try {
            conexao = Conexao.conectar();
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, visita.getId());
            stmt.setString(2, visita.getNomeCliente());
            stmt.setInt(3, visita.getData());
            stmt.setInt(4, visita.getHora());
            stmt.setString(5, visita.getRoteiro());
            stmt.setInt(6, visita.getQtdCliente());
            stmt.executeUpdate();
            System.out.println("Visita inserida com sucesso");
            
        }catch(SQLException ex){
            System.out.println("Erro ao inserir visita "+ex.getMessage());

        }finally{
            stmt.close();
            conexao.close();
        }

    }

    public List<Visita> listar() throws SQLException{
        String sql = "SELECT * FROM visitas";
        List<Visita> visitas = new ArrayList<>();
        Connection conexao = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conexao = Conexao.conectar();
            stmt = conexao.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next()){
                Visita visita = new Visita();
                visita.setId(rs.getInt("id: "));
                visita.setNomeCliente(rs.getString("Nome Cliente: "));
                visita.setData(rs.getInt("Data: "));
                visita.setHora(rs.getInt("Jora: "));
                visita.setRoteiro(rs.getString("Roteiro: "));
                visita.setQtdCliente(rs.getInt("Qtd Cliente: "));
                visitas.add(visita);
            }
            
        } catch (SQLException ex) {
            System.out.println("Erro ao listar produtos "+ex.getMessage());
        } finally {
            rs.close();
            stmt.close();
            conexao.close();
        }
        return visitas;
    }
}
