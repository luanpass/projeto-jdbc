package br.com.luan.jdbc.repositorios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaDeConexoes {
	
	static {
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		} catch (SQLException e) {
			throw new RuntimeException("Unable to registrer Driver", e);
		}
	}

	public static Connection getConexao() {
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/projeto_musica", "root", "root");
		} catch (SQLException e) {
			throw new RuntimeException("Não foi possível iniciar a conexão.", e);
		}
	}
	
}
