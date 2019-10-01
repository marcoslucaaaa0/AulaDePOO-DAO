package br.edu.cesmac.model;

public class Editoria {
	private int idEditoria;
	private String nome;

	public Editoria() {
		
	}
	
	public Editoria(String nome, int idEditora) {
		this.nome = nome;
		this.idEditoria = idEditora;
	}

	public int getIdEditoria() {
		return idEditoria;
	}

	public void setIdEditoria(int idEditoria) {
		this.idEditoria = idEditoria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
