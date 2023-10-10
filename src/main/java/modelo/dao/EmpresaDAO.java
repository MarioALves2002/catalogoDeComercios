package modelo.dao;

import DAO.DAO;
import modelo.entidades.Empresa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.entidades.Categoria;

/**
 *
 * @author mario
 */
public class EmpresaDAO extends DAO {
    public boolean inserir(Empresa e) throws Exception {
        Connection con = conectar();
        String sql = "INSERT INTO empresas(nome, email, telefone, endereco, bairro, cidade, complemento, categoria) VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement pstm = con.prepareStatement(sql);
        pstm.setString(1, e.getNome());
        pstm.setString(2, e.getEmail());
        pstm.setString(3, e.getTelefone());
        pstm.setString(4, e.getEndereco());
        pstm.setString(5, e.getBairro());
        pstm.setString(6, e.getCidade());
        pstm.setString(7, e.getComplemento());
        pstm.setInt(8, e.getCategoria().getId());

        int rowsAffected = pstm.executeUpdate();
        return rowsAffected > 0;  
    }

    public List<Empresa> listar() throws Exception {
        Connection con = conectar();
        String sql = "select * from empresas order by nome ";
        PreparedStatement pstm = con.prepareStatement(sql);
        ResultSet rs = pstm.executeQuery();

        List<Empresa> lista = new ArrayList<>();
        while (rs.next()) {
            Empresa e = new Empresa();
            
            e.setId(rs.getInt("id"));
            e.setNome(rs.getString("nome"));
            e.setEmail(rs.getString("email"));
            e.setTelefone(rs.getString("telefone"));
            e.setEndereco(rs.getString("endereco"));
            e.setBairro(rs.getString("bairro"));
            e.setCidade(rs.getString("cidade"));
            e.setComplemento(rs.getString("complemento"));
            
            lista.add(e);
        }

        return lista;
    }
      public List<Empresa> listarPorCategoria(int idCategoria) throws Exception {
        Connection con = conectar();
        String sql = "select * from empresas where categoria = ? ";
        PreparedStatement pstm = con.prepareStatement(sql);
        pstm.setInt(1, idCategoria);
        
        ResultSet rs = pstm.executeQuery();

        List<Empresa> listarPorCategoria = new ArrayList<>();
        while (rs.next()) {
            Empresa e = new Empresa();
            
            e.setId(rs.getInt("id"));
            e.setNome(rs.getString("nome"));
            e.setEmail(rs.getString("email"));
            e.setTelefone(rs.getString("telefone"));
            e.setEndereco(rs.getString("endereco"));
            e.setBairro(rs.getString("bairro"));
            e.setCidade(rs.getString("cidade"));
            e.setComplemento(rs.getString("complemento"));
            
            listarPorCategoria.add(e);
            
        }
        return listarPorCategoria ;
      }
      
}
