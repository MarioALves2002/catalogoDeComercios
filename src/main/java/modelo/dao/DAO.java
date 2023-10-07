package modelo.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAO {

    public Connection conectar() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection(
                "jdbc:mysql://192.168.24.139:3306/catalogo_comercios", 
                "root", "123456789");
    }

}
