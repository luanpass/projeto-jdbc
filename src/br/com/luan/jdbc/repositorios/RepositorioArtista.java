package br.com.luan.jdbc.repositorios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;

import com.mysql.jdbc.Statement;

import br.com.luan.jdbc.entidades.Artista;

public class RepositorioArtista {
	
	private static Logger LOG = Logger.getLogger(RepositorioArtista.class.getName());
	
	public void salvaArtista(Artista artista) {
		Connection conexao = FabricaDeConexoes.getConexao();
		
		String insertStatement = "INSERT INTO artista (nome_artista) VALUES (?)";
		try {
			PreparedStatement preparedStatement = 
					conexao.prepareStatement(insertStatement, Statement.RETURN_GENERATED_KEYS);
			
			preparedStatement.setString(1, artista.getNomeArtista());
			int result = preparedStatement.executeUpdate();
			LOG.fine("Resultado da operação: " + result);
			
			ResultSet rs = preparedStatement.getGeneratedKeys();
			
			if(rs.next()) {
				artista.setCodigoArtista(rs.getInt(1));
			}
		} catch (SQLException e) {
			LOG.severe("Falha ao fazer inserção no banco de dados");
			throw new RuntimeException("erro ao salvar artista: ", e);
		}
	}
	
	public void deletaArtista(Artista artista) {
		
	}
	
	public Artista procuraArtista(int codigoArtista) {
		return null;
	}

}
