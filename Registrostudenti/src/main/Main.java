package main;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Studente studenti = new Studente(null,null,0); // creare un oggetto/studente e stampare il risul
		studenti.setNome("Hazem");
		studenti.setCognome("Mohamed");
        studenti.setMatricola(256669);
        System.out.println("Nome e cognome dello Studente: \n" + studenti.getNome() + studenti.getCognome() + "\nNumero matricola: " + studenti.getMatricola());
       Registro registro = new Registro (new ArrayList<>()); // aggingere studenti nell'ArrayList 
       registro.aggiungereStudente(new Studente ("Mohamed", "Salah",111)) ;
       registro.aggiungereStudente(new Studente ("Omar", "Marmoush",117)) ;
       registro.aggiungereStudente(new Studente ("Harry", "Kane",129)) ;
       
       Scanner scanner = new Scanner(System.in); // utilizzare il metodo scanner per cercare un studente con la matricola. e stampare i dati realativi 
       System.out.println("Inserisci una matricola per cercare uno studente: ");
       int matricola = scanner.nextInt();
       registro.cercaStudente(matricola);
       
      /* Creare un menu testuale che permetta all'utente
       *  diAggiungere uno studente, una volta inserita una matricola sbagliata.
       */
       


       System.out.println("per aggiungere un studente nuovo, compila i campi  :"); 
       scanner.nextLine();
       
       System.out.println("Inserisci il nome");
       String nome = scanner.nextLine();
       System.out.println("Inserisci il cognome");
       String cognome = scanner.nextLine();
       System.out.println("Inserisci la matricola");
       int matricola1 = scanner.nextInt();
       Studente nuovoStudente = new Studente(nome , cognome, matricola1);
       registro.aggiungereStudente(nuovoStudente);
       System.out.println("Studente aggiunto con successo");
       System.out.println("Nome: " + nome + ", Cognome: " + cognome + ", Matricola: " + matricola1);
       System.out.println("Studente aggiunto con successo");
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