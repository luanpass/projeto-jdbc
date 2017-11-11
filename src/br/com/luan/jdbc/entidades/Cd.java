package br.com.luan.jdbc.entidades;

public class Cd {
	
	private int codigoCd;
	private int codigoArtista;
	private int codigoGenero;
	private String titulo;
	private double preco;
	
	public int getCodigoCd() {
		return codigoCd;
	}
	public void setCodigoCd(int codigoCd) {
		this.codigoCd = codigoCd;
	}
	public int getCodigoArtista() {
		return codigoArtista;
	}
	public void setCodigoArtista(int codigoArtista) {
		this.codigoArtista = codigoArtista;
	}
	public int getCodigoGenero() {
		return codigoGenero;
	}
	public void setCodigoGenero(int codigoGenero) {
		this.codigoGenero = codigoGenero;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}

}
