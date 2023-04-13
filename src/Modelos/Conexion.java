package Modelos;

import java.sql.*;
import javax.swing.JOptionPane;


public class Conexion {

public Connection Conectar(String user, String pass)
{
    try
    {
    DriverManager.deregisterDriver(new oracle.jdbc.driver.OracleDriver());
    String servidor = "127.0.0.1";
    String servidor =
            
    }
    catch(SQLException e)
    {
        JOptionPane.showMessageDialog(null, "No se conecto.."+ e.getMessage());
    }
}

}
