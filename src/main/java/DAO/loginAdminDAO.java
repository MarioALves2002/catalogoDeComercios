package DAO;

import entidades.loginAdmin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class loginAdminDAO {

    Connection con;

    public ResultSet autenticacaoAdmin(loginAdmin la) {
        con = new conexaoDAO().conect();

        try {
            String sql = "select * from adminlogin where usuario = ? and senha = ? ";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, la.getNomeAdmin());
            pstm.setString(2, la.getSenha());
            
            ResultSet rs = pstm.executeQuery();
            return rs ;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro);
            return null;
            
        }
        
    }

}
