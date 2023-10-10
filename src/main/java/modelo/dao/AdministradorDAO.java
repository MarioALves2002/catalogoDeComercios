package modelo.dao;

import DAO.DAO;
import modelo.entidades.Administrador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AdministradorDAO extends DAO {
    public Administrador autenticar(Administrador a) throws Exception {
        Connection con = conectar();

        String sql = "select * from administradores where login = ? and senha = md5(?)";
        PreparedStatement pstm = con.prepareStatement(sql);
        pstm.setString(1, a.getLogin());
        pstm.setString(2, a.getSenha());

        ResultSet rs = pstm.executeQuery();
        
        if (rs.next()){
            Administrador aLogado = new Administrador();
            aLogado.setId(rs.getInt("id"));
            aLogado.setLogin(rs.getString("login"));   
            
            return aLogado;
        } else {
            return null;
        }
    }

}
