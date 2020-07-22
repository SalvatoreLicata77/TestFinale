package it.enaip.cinema;

public class Spettatore {
	
	private int idSpettatore;
	private String nome;
	private String cognome;
	private String dataDiNascita;
	private String biglietto;
	
	public Spettatore(int idSpettatore, String nome, String cognome, String dataDiNascita, String biglietto) {
	
		this.idSpettatore = idSpettatore;
		this.nome = nome;
		this.cognome = cognome;
		this.dataDiNascita = dataDiNascita;
		this.biglietto = biglietto;
	}

	public int getIdSpettatore() {
		return idSpettatore;
	}

	public void setIdSpettatore(int idSpettatore) {
		this.idSpettatore = idSpettatore;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getDataDiNascita() {
		return dataDiNascita;
	}

	public void setDataDiNascita(String dataDiNascita) {
		this.dataDiNascita = dataDiNascita;
	}

	public String getBiglietto() {
		return biglietto;
	}

	public void setBiglietto(String biglietto) {
		this.biglietto = biglietto;
	}

	
	
}
