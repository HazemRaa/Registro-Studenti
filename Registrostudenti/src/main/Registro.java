package main;

import java.util.ArrayList;



public class Registro {
		ArrayList<Studente> studenti = new ArrayList<>(); // ArrayList per memorizzare gli studneti 
		
		public  Registro(ArrayList<Studente> studenti) { // Costruttore registro 
			super();// Chiamata al costruttore della classe padre
			this.studenti = studenti; // Inizializzazione dell'ArrayList degli studenti
	}
		
		/*Creazione di un menu che permetta all'utente aggiungere uno studente,
		 *  visualizzare gli studenti nel registro,cercare un studente,
		 *  uscire dal programma.
		 *  */
		
		public void aggiungereStudente(Studente studenteDaAgg) { // un metodo per aggiungere un nuovo studente
			studenti.add(studenteDaAgg);
			
		}
		public void visualiStudenti() { // metodo per stampare tutti gli studente altimenti un messagio Empty(vuoto) se il registro vuoto.
			if (studenti.isEmpty()) {
		        System.out.println("non esiste un studente con questo nome "); 
			}else { //ciclo che stampa i dati dello studente
		        for (Studente studente : studenti) { 
		            System.out.println("Nome: " + studente.nome + 
		                               ", Cognome: " + studente.cognome + 
		                               ", Numero Matricola: " + studente.matricola);
		  		
			}
		}
		}
		public void cercaStudente(int matricola) { // metodo per cercare un studente tramite la matricola.
		    for (Studente studente : studenti) { //Ciclo for che scorre nella lista
		        if (studente.matricola == matricola) { // se la matricola dello studente cercato è corretta stampa i dati dello studente
		            System.out.println("Studente trovato: Nome: " + studente.nome + 
		                               ", Cognome: " + studente.cognome + 
		                               ",Numero Matricola: " + studente.matricola);
		            return; // termina il metodo una volta trovato lo studente.
		        }
		    } // se nessun studente ha la matericola cercata stampa questo messaggio
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