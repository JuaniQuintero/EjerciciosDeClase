package baseDeDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CrearTablaProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Connection conect = null;
				Statement stmt = null;
				
				String sql ="CREATE TABLE productos(id INT PRIMARY KEY,"
						+ "precio DOUBLE,"
						+ "nombre VARCHAR(60) NOT NULL)";
				try {
					conect = DriverManager.getConnection("jdbc:mysql://localhost/empresa","root","admin");
					stmt=conect.createStatement();
					stmt.execute(sql);
					System.out.println("Creada la tabla productos");
					conect.close();
					stmt.close();
				}catch(SQLException e) {
					System.out.println("Falló");
					e.printStackTrace();
				}
	}

}
