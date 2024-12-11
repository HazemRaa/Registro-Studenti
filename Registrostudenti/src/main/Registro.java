package main;

import java.util.ArrayList;



public class Registro {
		ArrayList<Studente> studenti = new ArrayList<>(); // ArrayList per memorizzare gli studneti 
		
		public  Registro(ArrayList<Studente> studenti) { // metodo registro 
			super();
			this.studenti = studenti; 
	}
		
		/*Creazione di un menu che permetta all'utente aggiungere uno studente,
		 *  visualizzare gli studenti nel registro,cercare un studente,
		 *  uscire dal programma.
		 *  */
		
		public void aggiungereStudente(Studente studenteDaAgg) { // un metodo per aggingere un studente
			studenti.add(studenteDaAgg);
			
		}
		public void visualiStudenti() { // metodo per stampare tutti gli studente altimenti un messagio Empty(vuoto) se il registro vuoto.
			if (studenti.isEmpty()) {
		        System.out.println("non esiste un studente con questo nome "); 
		        for (Studente studente : studenti) { 
		            System.out.println("Nome: " + studente.nome + 
		                               ", Cognome: " + studente.cognome + 
		                               ", Numero Matricola: " + studente.matricola);
		  		
			}
		}
		}
		public void cercaStudente(int matricola) { // metodo per cercare un studente tramite la matricola.
		    for (Studente studente : studenti) { //Ciclo for che scorre nella lista
		        if (studente.matricola == matricola) {
		            System.out.println("Studente trovato: Nome: " + studente.nome + 
		                               ", Cognome: " + studente.cognome + 
		                               ",Numero Matricola: " + studente.matricola);
		            return;
		        }
		    }
		    System.out.println("Studente con matricola " + matricola + " non trovato");
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