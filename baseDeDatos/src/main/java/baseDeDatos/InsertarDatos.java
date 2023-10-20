package baseDeDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertarDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conect = null;
		Statement stmt = null;
		
		String sql ="INSERT INTO clientes (id,nif, nombre, edad) VALUES (1,'11111','Juani','19')";
		try {
			conect = DriverManager.getConnection("jdbc:mysql://localhost/empresa","root","admin");
			stmt=conect.createStatement();
			stmt.execute(sql);
			System.out.println("Insertado el cliente");
			conect.close();
			stmt.close();
		}catch(SQLException e) {
			System.out.println("Falló");
			e.printStackTrace();
		}
	}

}
