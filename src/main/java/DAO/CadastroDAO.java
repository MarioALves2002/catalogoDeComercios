/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import entidades.Cadastro;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author mario
 */
public class CadastroDAO {

    Connection con;
    Statement st;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<Cadastro> Lista = new ArrayList<>();

    public boolean conect() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/catalogolj", "root", "root");
            st = con.createStatement();
            return true;

        } catch (ClassNotFoundException | SQLException ex) {
            return false;
        }
    }

public boolean cadastrarLoja(Cadastro lj) {
    try {
        String sql = "INSERT INTO catalj (nomeloja, email, tel, endereco, bairro, cidade, complemento) VALUES (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement pstm = con.prepareStatement(sql);
        pstm.setString(1, lj.getNomeLoja());
        pstm.setString(2, lj.getEmailLoja());
        pstm.setString(3, lj.getTelefoneLoja());
        pstm.setString(4, lj.getEnderecoLoja());
        pstm.setString(5, lj.getBairroLoja());
        pstm.setString(6, lj.getCidadeLoja());
        pstm.setString(7, lj.getComplemento());

        int rowsAffected = pstm.executeUpdate();
        return rowsAffected > 0;
    } catch (SQLException ex) {
        ex.printStackTrace();
        return false;
    }
}


    public void desconect() {
        try {
            con.close();
        } catch (SQLException ex) {

        }
    }

    public ArrayList<Cadastro> consultLoja() {
        String sql = "select * from catalj";
        con = new conexaoDAO().conect();
        try {
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                Cadastro objCadastro = new Cadastro();
                objCadastro.setIdLoja(rs.getInt("id"));
                objCadastro.setNomeLoja(rs.getString("nomeloja"));
                objCadastro.setEmailLoja(rs.getString("email"));
                objCadastro.setTelefoneLoja(rs.getString("tel"));
                objCadastro.setEnderecoLoja(rs.getString("endereco"));
                objCadastro.setBairroLoja(rs.getString("bairro"));
                objCadastro.setCidadeLoja(rs.getString("cidade"));
                objCadastro.setComplemento(rs.getString("complemento"));

                Lista.add(objCadastro);

            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "consulta de loja: " + erro);
        }
        return Lista;
    }

}
