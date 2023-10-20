package baseDeDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MostrarDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conect = null;
		Statement stmt = null;
		
		String sql ="SELECT * FROM CLIENTES";
		try {
			conect = DriverManager.getConnection("jdbc:mysql://localhost/empresa","root","admin");
			stmt=conect.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				int id=rs.getInt("id");
				String nif = rs.getString("nif");
				String nombre = rs.getString("nombre");
				String edad = rs.getString("edad");
				System.out.println("id: " + id + "\nnif: " + nif + "\nnombre: " + nombre+ "\nedad: " + edad);
			}
			System.out.println("Datos mostrados.");
			conect.close();
			stmt.close();
			rs.close();
		}catch(SQLException e) {
			System.out.println("Falló");
			e.printStackTrace();
		}
	}

}
