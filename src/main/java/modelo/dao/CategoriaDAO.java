/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.dao;

import DAO.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.entidades.Categoria;

/**
 *
 * @author roni
 */
public class CategoriaDAO extends DAO {

    public List<Categoria> listar() throws Exception {
        Connection con = conectar();
        String sql = "select * from categorias order by nome";
        PreparedStatement pstm = con.prepareStatement(sql);
        ResultSet rs = pstm.executeQuery();

        List<Categoria> lista = new ArrayList<>();
        while (rs.next()) {
            Categoria e = new Categoria();

            e.setId(rs.getInt("id"));
            e.setNome(rs.getString("nome"));

            lista.add(e);
        }

        return lista;
    }
  

}
