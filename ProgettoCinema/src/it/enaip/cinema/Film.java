package it.enaip.cinema;

import java.util.ArrayList;

public class Film {
	
	private String titoloFilm;
	private String autore;
	private String produttore;
	private String genere;
	private int minutiDurata;
	private ArrayList<Film> filmDeposito;
	
	public Film() {

		filmDeposito = new ArrayList<Film>();

		}
	
	public Film(String titoloFilm, String autore, String produttore, String genere, int minutiDurata) {
		
		this.titoloFilm = titoloFilm;
		this.autore = autore;
		this.produttore = produttore;
		this.genere = genere;
		this.minutiDurata = minutiDurata;
	}
	
	private void filmDeposito() {

		filmDeposito.add(new Film("", "", "", 1, ""));
		
		}

	public String getTitoloFilm() {
		return titoloFilm;
	}

	public void setTitoloFilm(String titoloFilm) {
		this.titoloFilm = titoloFilm;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public String getProduttore() {
		return produttore;
	}

	public void setProduttore(String produttore) {
		this.produttore = produttore;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	public int getMinutiDurata() {
		return minutiDurata;
	}

	public void setMinutiDurata(int minutiDurata) {
		this.minutiDurata = minutiDurata;
	}
	

}
