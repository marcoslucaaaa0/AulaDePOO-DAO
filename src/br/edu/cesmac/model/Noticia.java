package br.edu.cesmac.model;

import java.util.Date;

public class Noticia {
	private int idNoticia;
	private String tituloNoticia;
	private String resumoNoticia;
	private Date dataNoticia;
	private String textoNoticia;
	private Jornalista jornalista;
	private Editoria editoria;

	public int getIdNoticia() {
		return idNoticia;
	}

	public void setIdNoticia(int idNoticia) {
		this.idNoticia = idNoticia;
	}

	public String getTituloNoticia() {
		return tituloNoticia;
	}

	public void setTituloNoticia(String tituloNoticia) {
		this.tituloNoticia = tituloNoticia;
	}

	public String getResumoNoticia() {
		return resumoNoticia;
	}

	public void setResumoNoticia(String resumoNoticia) {
		this.resumoNoticia = resumoNoticia;
	}

	public Date getDataNoticia() {
		return dataNoticia;
	}

	public void setDataNoticia(Date dataNoticia) {
		this.dataNoticia = dataNoticia;
	}

	public String getTextoNoticia() {
		return textoNoticia;
	}

	public void setTextoNoticia(String textoNoticia) {
		this.textoNoticia = textoNoticia;
	}

	public Jornalista getJornalista() {
		return jornalista;
	}

	public void setJornalista(Jornalista jornalista) {
		this.jornalista = jornalista;
	}

	public Editoria getEditoria() {
		return editoria;
	}

	public void setEditoria(Editoria editoria) {
		this.editoria = editoria;
	}
}
