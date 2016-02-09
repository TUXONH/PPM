import java.io.PrintStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

class conectar
{
  Connection con = null;
  
  public Connection conexion()
  {
    try
    {
      Class.forName("com.mysql.jdbc.Driver");
      this.con = DriverManager.getConnection("jdbc:mysql://localhost:8887/costco", "root", "andrade");
      System.out.printf("Conexion establecida!!", new Object[0]);
    }
    catch (ClassNotFoundException|SQLException e)
    {
      JOptionPane.showMessageDialog(null, "Error de conexion :/" + e);
    }
    return this.con;
  }
}
