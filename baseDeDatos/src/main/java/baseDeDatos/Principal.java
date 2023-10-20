package baseDeDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conect = null;
		Statement stmt = null;
		
		String sql ="CREATE DATABASE empresa";
		try {
			conect = DriverManager.getConnection("jdbc:mysql://localhost/","root","admin");
			stmt=conect.createStatement();
			stmt.execute(sql);
			if(conect!=null) {
				System.out.println("Conexion ok");
				conect.close();
				stmt.close();
			}
		}catch(SQLException e) {
			System.out.println("No esta:(");
		}
		
		
	}

}
