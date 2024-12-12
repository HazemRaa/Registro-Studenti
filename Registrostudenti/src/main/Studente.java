package main;

public class Studente {
	protected String nome;
	protected String cognome;
	protected int matricola;
	public Studente(String nome, String cognome, int matricola) { // contruttore con i campi di un studente
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.matricola = matricola;
	}
	public String getNome() {//getter / setter per prendere un campo o modificare un campo 
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
	public int getMatricola() {
		return matricola;
	}
	public void setMatricola(int matricola) {
		this.matricola = matricola;
	}
	

}
/*Requisiti Tecnici:
Creare una classe Studente con i campi necessari.
Utilizzare un ArrayList per memorizzare gli studenti.
Creare un menu testuale che permetta all'utente di:

Aggiungere uno studente.
Visualizzare tutti gli studenti.
Cercare uno studente per matricola.
Uscire dal programma*/
