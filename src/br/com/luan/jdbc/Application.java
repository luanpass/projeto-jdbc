package br.com.luan.jdbc;

import java.util.logging.Logger;

import br.com.luan.jdbc.entidades.Artista;
import br.com.luan.jdbc.repositorios.RepositorioArtista;

public class Application {
	
	private static Logger LOG = Logger.getLogger(Application.class.getName());

	public static void main(String[] args) {
		
		RepositorioArtista repoArtista = new RepositorioArtista();
		
		Artista artista = new Artista();
		artista.setNomeArtista("Roberto Carlos");
		
		repoArtista.salvaArtista(artista);
		
		LOG.info("Artista "  + artista.getCodigoArtista() + " salvo");
	}
	
}
