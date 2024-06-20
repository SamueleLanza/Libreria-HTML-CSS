package org.generation.italy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import org.generation.italy.model.Libro;
import org.generation.italy.model.Registrazioni;

public class Main {

	public static void main(String[] args) {
		// Esercizio di gruppo: Ciro Aldorisio, Federica Zaccaro, Gabriel Spina, Marina
		// Perriera, Samuele Lanza.
		String url = "jdbc:mysql://localhost:3306/Libreria"; // stringa di connessione
		Scanner sc = new Scanner(System.in);
		ArrayList<Libro> elencoLibri = new ArrayList<Libro>();
		ArrayList<Registrazioni> elencoUtenti = new ArrayList<Registrazioni>();
		Libro m;
		Registrazioni r;
		String risposta, sql = null;
		boolean sceltaSbagliata = false, entrataSbagliata = false, uscitaSbagliata = false;
		boolean visualizzazione = false, inserimento = false, delete = false, ricerca = false, modifica = false,
				registrazione=false, autenticazione=false, disponibilita=false, uscita = false;

		System.out.println("Tentativo di connessione al db...");
		try (Connection conn = DriverManager.getConnection(url, "root", "")) { // provo a connettermi

			// la connessione è andata a buon fine
			System.out.println("Connesso correttamente al database");

			// PRIMO PUNTO

			/*
			 * System.out.println("*** LIBRI PRESENTI NEL DATABASE ***");
			 * 
			 * String sql = "SELECT * FROM libri WHERE quantita > 0"; try (PreparedStatement
			 * ps = conn.prepareStatement(sql)) { try (ResultSet rs = ps.executeQuery()) {
			 * 
			 * // scorro tutte le righe while (rs.next()) { m = new Libro(); m.id =
			 * rs.getInt("id"); // recupero il valore della colonna "id" m.titolo =
			 * rs.getString("titolo"); m.autore = rs.getString("autore"); m.genere =
			 * rs.getString("genere"); m.quantita = rs.getInt("quantita"); m.casa_editrice =
			 * rs.getString("casa_editrice"); // m.isbn=rs.getInt("isbn");
			 * 
			 * elencoLibri.add(m); } } } // stampo i movimenti letti dal DB for (Libro mov :
			 * elencoLibri) System.out.println(mov.toString());
			 *
			 * 
			 */

			// SECONDO PUNTO

			System.out.println("Scegli tra le seguenti opzioni");

			// scelta del menù a tendina

			do {
				sceltaSbagliata = false;
				System.out.println(
						"Inserisci la tua azione: \nInserimento 1\nVisualizzazione 2\nCancellazione 3\nModifica 4\nRicerca 5\nRegistrazione 6\nAutenticazione 7\nDisponibilita scorte 8\nUscita 9");
				risposta = sc.nextLine();

				if (risposta.equals("1")) {
					System.out.println("Inserisci nuovo libro");
					inserimento = true;
				} else if (risposta.equals("2")) {
					System.out.println("Visualizza lista libri");
					visualizzazione = true;
				} else if (risposta.equals("3")) {
					System.out.println("Cancellazione libro");
					delete = true;
				} else if (risposta.equals("4")) {
					System.out.println("Modifica libro");
					modifica = true;
				} else if (risposta.equals("5")) {
					System.out.println("Ricerca");
					ricerca = true;
				} else if (risposta.equals("6")) {
					System.out.println("Registra nuovo utente");
					registrazione = true;
				} else if (risposta.equals("7")) {
					System.out.println("Autentica utente");
					autenticazione = true;
				} else if (risposta.equals("8")) {
					System.out.println("Disponibilità scorte");
					disponibilita = true;
				} else if (risposta.equals("9")) {
					System.out.println("Uscita");
					uscita = true;
				} else {
					System.out.println("Scelta errata, inserire nuovamente");
					sceltaSbagliata = true;
				}
			} while (sceltaSbagliata == true);

			// MENÙ A TENDINA SCELTA 1 - INSERIMENTO
			if (inserimento == true) {
				do {
					System.out.println("*** INSERIMENTO MOVIMENTO ***");

					m = new Libro();

					// leggo i dati del movimento

					System.out.print("titolo: ");
					m.titolo = sc.nextLine();

					System.out.print("autore: ");
					m.autore = sc.nextLine();

					System.out.print("genere: ");
					m.genere = sc.nextLine();

					System.out.print("quantita: ");
					m.quantita = sc.nextInt();
					sc.nextLine();

					System.out.print("casa editrice: ");
					m.casa_editrice = sc.nextLine();
					
					System.out.print("anno di pubblicazione: ");
					m.pubblicazione = sc.nextInt();
					sc.nextLine();

					sql = "INSERT INTO libri( titolo, autore, genere, quantita, casa_editrice, pubblicazione) "
							+ "VALUE( ?, ?, ?, ?, ?, ?)"; // il ? indica un parametro (segnaposto)

					System.out.println("Tentativo di esecuzione INSERT");
					try (PreparedStatement ps = conn.prepareStatement(sql)) { // provo a creare l'istruzione sql

						// imposto i valori dei parametri
						ps.setString(1, m.titolo); // il primo parametro è l'id. NB
						ps.setString(2, m.autore);
						ps.setString(3, m.genere);
						ps.setInt(4, m.quantita);
						ps.setString(5, m.casa_editrice);
						ps.setInt(6, m.pubblicazione);

						int righeInteressate = ps.executeUpdate(); // eseguo l'istruzione
						System.out.println("Righe inserite: " + righeInteressate);

					}
				} while (entrataSbagliata == true);
			}

			// MENÙ A TENDINA SCELTA 2 - VISUALIZZAZIONE
			if (visualizzazione == true) {
				do {
					System.out.println("\n\n\n\n");
					System.out.println("*** ELENCO MOVIMENTI ***");

					sql = "SELECT * FROM libri";
					try (PreparedStatement ps = conn.prepareStatement(sql)) {
						try (ResultSet rs = ps.executeQuery()) {

							// scorro tutte le righe
							while (rs.next()) {
								m = new Libro();
								m.id = rs.getInt("id"); // recupero il valore della colonna "id"
								m.titolo = rs.getString("titolo");
								m.autore = rs.getString("autore");
								m.genere = rs.getString("genere");
								m.quantita = rs.getInt("quantita");
								m.casa_editrice = rs.getString("casa_editrice");
								m.pubblicazione=rs.getInt("pubblicazione");

								elencoLibri.add(m);
							}
						}
					}
				} while (entrataSbagliata == true);
			}

			// MENÙ A TENDINA SCELTA 3 - CANCELLAZIONE
			if (delete == true) {
				do {
					System.out.println("Inserisci l'Id da eliminare: ");
					int id = sc.nextInt();
					sc.nextLine();
					sql = "DELETE FROM libri WHERE id= ?";
					try (PreparedStatement ps = conn.prepareStatement(sql)) {

						ps.setInt(1, id);
						int risultatoE = ps.executeUpdate();

						if (risultatoE > 0) {
							System.out.println("Libro eliminato con successo");
						} else {
							System.out.println("Nessun libro trovato con l'Id inserito");
						}
					}
				} while (entrataSbagliata == true);
			}

			// MENÙ A TENDINA SCELTA 4 - MODIFICA
			if (modifica == true) {
				do {
					System.out.println("Inserisci l'Id da MODIFICARE: ");
					int id = sc.nextInt();
					sc.nextLine();

					sql = "SELECT * FROM libri WHERE id=?";

					try (PreparedStatement ps = conn.prepareStatement(sql)) {
						ps.setInt(1, id);
						try (ResultSet rs = ps.executeQuery()) {

							if (rs.next()) {
								System.out.println("Inserisci il nuovo titolo: ");
								String nuovoTitolo = sc.nextLine();

								System.out.println("Inserisci il nuovo autore: ");
								String nuovoAutore = sc.nextLine();

								System.out.println("Inserisci il nuovo genere: ");
								String nuovoGenere = sc.nextLine();

								System.out.println("Inserisci la nuova quantità: ");
								int nuovaQuantita = sc.nextInt();
								sc.nextLine();

								System.out.println("Inserisci la nuova Casa editrice: ");
								String nuovaCasaed = sc.nextLine();

								System.out.println("Inserisci il nuovo anno di pubblicazione: ");
								int nuovaPubblicazione = sc.nextInt();
								sc.nextLine();

								sql = "UPDATE libri SET titolo = ?, autore= ?, genere= ?, quantita= ?, casa_editrice= ?, pubblicazione= ? WHERE id=?";

								try (PreparedStatement nuovops = conn.prepareStatement(sql)) {
									nuovops.setString(1, nuovoTitolo);
									nuovops.setString(2, nuovoAutore);
									nuovops.setString(3, nuovoGenere);
									nuovops.setInt(4, nuovaQuantita);
									nuovops.setString(5, nuovaCasaed);
									nuovops.setInt(6, nuovaPubblicazione);
									nuovops.setInt(7, id);

									int risultatoUp = nuovops.executeUpdate();

									if (risultatoUp > 0) {
										System.out.println("Libro aggiornato con successo");
									} else {
										System.out.println("Errore nell'aggiornamento del libro");
									}

								}

							} else {
								System.out.println("Nessun libro trovato con l'Id inserito");
							}

						}
					}

				} while (entrataSbagliata == true);

			}
			
			// MENÙ A TENDINA SCELTA 5 - RICERCA
			if (ricerca == true) {
			    do {
			        boolean risultatoTrovato = false;
			        boolean criterioValido = false;

			        do {
			            System.out.println(
			                    "Scegli il criterio di ricerca:\n1. Per Titolo\n2. Per Autore\n3. Per Genere\n4. Per Casa Editrice\n5. Per Anno di Pubblicazione\n6. Per Disponibilità");
			            String criterio = sc.nextLine();
			            String valoreRicerca = "";

			            switch (criterio) {
			                case "1":
			                    System.out.print("Inserisci il titolo: ");
			                    valoreRicerca = sc.nextLine();
			                    sql = "SELECT * FROM libri WHERE titolo LIKE ?";
			                    criterioValido = true;
			                    break;
			                case "2":
			                    System.out.print("Inserisci l'autore: ");
			                    valoreRicerca = sc.nextLine();
			                    sql = "SELECT * FROM libri WHERE autore LIKE ?";
			                    criterioValido = true;
			                    break;
			                case "3":
			                    System.out.print("Inserisci il genere: ");
			                    valoreRicerca = sc.nextLine();
			                    sql = "SELECT * FROM libri WHERE genere LIKE ?";
			                    criterioValido = true;
			                    break;
			                case "4":
			                    System.out.print("Inserisci la casa editrice: ");
			                    valoreRicerca = sc.nextLine();
			                    sql = "SELECT * FROM libri WHERE casa_editrice LIKE ?";
			                    criterioValido = true;
			                    break;
			                case "5":
			                    System.out.print("Inserisci l'anno di pubblicazione: ");
			                    valoreRicerca = sc.nextLine();
			                    sql = "SELECT * FROM libri WHERE pubblicazione = ?";
			                    criterioValido = true;
			                    break;
			                case "6":
			                    System.out.print("Inserisci la disponibilità minima: ");
			                    valoreRicerca = sc.nextLine();
			                    sql = "SELECT * FROM libri WHERE quantita >= ?";
			                    criterioValido = true;
			                    break;
			                default:
			                    System.out.println("Criterio non valido.");
			                    continue;
			            }

			            if (criterioValido) {
			                try (PreparedStatement ps = conn.prepareStatement(sql)) {
			                    if (criterio.equals("6")) {
			                        ps.setInt(1, Integer.parseInt(valoreRicerca));
			                    } else {
			                        ps.setString(1, "%" + valoreRicerca + "%");
			                    }
			                    try (ResultSet rs = ps.executeQuery()) {
			                        elencoLibri.clear();
			                        while (rs.next()) {
			                            m = new Libro();
			                            m.id = rs.getInt("id");
			                            m.titolo = rs.getString("titolo");
			                            m.autore = rs.getString("autore");
			                            m.genere = rs.getString("genere");
			                            m.quantita = rs.getInt("quantita");
			                            m.casa_editrice = rs.getString("casa_editrice");
			                            m.pubblicazione = rs.getInt("pubblicazione");
			                            elencoLibri.add(m);
			                        }
			                    }
			                } catch (SQLException e) {
			                    e.printStackTrace();
			                }

			                if (!elencoLibri.isEmpty()) {
			                    risultatoTrovato = true;
			                    System.out.println("*** RISULTATI RICERCA ***");
			                    for (Libro libro : elencoLibri) {
			                        System.out.println(libro.toString());
			                    }
			                } else {
			                    System.out.println("Nessun risultato trovato. Riprova.");
			                    entrataSbagliata = true;
			                }
			            }
			        } while (!risultatoTrovato);

			        entrataSbagliata = false;

			    } while (entrataSbagliata);
			}
			
			// MENÙ A TENDINA SCELTA 6 - REGISTRAZIONE
			if (registrazione == true) {
				do {
					System.out.println("*** INSERIMENTO DATI UTENTE ***");

					r = new Registrazioni();

					// leggo i dati del movimento

					System.out.print("nome: ");
					r.nome = sc.nextLine();

					System.out.print("cognome: ");
					r.cognome = sc.nextLine();

					System.out.print("mail: ");
					r.mail = sc.nextLine();

					System.out.print("password: ");
					r.password = sc.nextLine();
					
					sql = "INSERT INTO utenti( nome, cognome, mail, password)"
							+ "VALUE( ?, ?, ?, ?)"; // il ? indica un parametro (segnaposto)

					System.out.println("Tentativo di esecuzione INSERT");
					try (PreparedStatement ps = conn.prepareStatement(sql)) { // provo a creare l'istruzione sql

						// imposto i valori dei parametri
						ps.setString(1, r.nome); // il primo parametro è l'id. NB
						ps.setString(2, r.cognome);
						ps.setString(3, r.mail);
						ps.setString(4, r.password);

						int righeInteressate = ps.executeUpdate(); // eseguo l'istruzione
						System.out.println("Righe inserite: " + righeInteressate);

					}
				} while (entrataSbagliata == true);
			}
			//MENÙ A TENDINA SCELTA 7 - AUTENTICAZIONE
			
			if (autenticazione == true) {
			    do {
			        boolean risultatoTrovato = false;
			        boolean criterioValido = false;
			        
			        System.out.println("*** AUTENTICAZIONE UTENTE ***");
			        
			        do {
			            System.out.println(
			                    "Scegli il criterio di autenticazione:\n1. Per nome\n2. Per cognome\n3. Per mail");
			            String criterio = sc.nextLine();
			            String valoreRicerca = "";

			            switch (criterio) {
			                case "1":
			                    System.out.print("Inserisci il nome: ");
			                    valoreRicerca = sc.nextLine();
			                    sql = "SELECT * FROM utenti WHERE nome LIKE ?";
			                    criterioValido = true;
			                    break;
			                case "2":
			                    System.out.print("Inserisci il cognome: ");
			                    valoreRicerca = sc.nextLine();
			                    sql = "SELECT * FROM utenti WHERE cognome LIKE ?";
			                    criterioValido = true;
			                    break;
			                case "3":
			                    System.out.print("Inserisci la mail: ");
			                    valoreRicerca = sc.nextLine();
			                    sql = "SELECT * FROM utenti WHERE mail LIKE ?";
			                    criterioValido = true;
			                    break;
			            }

			            if (criterioValido) {
			                try (PreparedStatement ps = conn.prepareStatement(sql)) {
			                    if (criterio.equals("3")) {
			                        ps.setInt(1, Integer.parseInt(valoreRicerca));
			                    } else {
			                        ps.setString(1, "%" + valoreRicerca + "%");
			                    }
			                    try (ResultSet rs = ps.executeQuery()) {
			                        elencoUtenti.clear();
			                        while (rs.next()) {
			                            r = new Registrazioni();
			                            r.idUtente = rs.getInt("idUtente");
			                            r.nome = rs.getString("nome");
			                            r.cognome = rs.getString("cognome");
			                            r.mail = rs.getString("mail");
			                            r.password = rs.getString("password");
			                            elencoUtenti.add(r);
			                        }
			                    }
			                } catch (SQLException e) {
			                    e.printStackTrace();
			                }

			                if (!elencoUtenti.isEmpty()) {
			                    risultatoTrovato = true;
			                    System.out.println("*** RISULTATI RICERCA ***");
			                    for (Registrazioni utente : elencoUtenti) {
			                        System.out.println(utente.toString());
			                    }
			                } else {
			                    System.out.println("Nessun risultato trovato. Riprova.");
			                    entrataSbagliata = true;
			                }
			            }
			        } while (!risultatoTrovato);

			        entrataSbagliata = false;

			    } while (entrataSbagliata);
			}
			
			// MENÙ A TENDINA SCELTA 8 - DISPONIBILITÀ
			if (disponibilita == true) {
			    do {
			        boolean risultatoTrovato = false;

			        System.out.println("*** STATO DELLE SCORTE ***");
			        sql = "SELECT * FROM libri WHERE quantita < 3";

			        try (PreparedStatement ps = conn.prepareStatement(sql)) {
			            try (ResultSet rs = ps.executeQuery()) {
			                elencoLibri.clear();
			                while (rs.next()) {
			                    Libro libro = new Libro();
			                    libro.id = rs.getInt("id");
			                    libro.titolo = rs.getString("titolo");
			                    libro.autore = rs.getString("autore");
			                    libro.quantita = rs.getInt("quantita");
			                    elencoLibri.add(libro);
			                }
			            }
			        } catch (SQLException e) {
			            e.printStackTrace();
			        }

			        if (!elencoLibri.isEmpty()) {
			            risultatoTrovato = true;
			            for (Libro libro : elencoLibri) {
			                System.out.println("Libro: " + libro.titolo + " - Quantità: " + libro.quantita);
			            }
			        } else {
			            System.out.println("Tutti i libri hanno quantità uguale o superiore a 3.");
			        }

			        entrataSbagliata = false;

			    } while (entrataSbagliata);
			}

			// MENÙ A TENDINA SCELTA 9 - USCITA
			if (uscita == true) {
				do {
					break;
				} while (entrataSbagliata == true);
			}

			// stampo i movimenti letti dal DB
			/*for (Libro mov : elencoLibri)
				System.out.println(mov.toString());*/
		} catch (Exception e) {
			// si è verificato un problema. L'oggetto e (di tipo Exception) contiene
			// informazioni sull'errore verificatosi
			System.err.println("Si è verificato un errore: " + e.getMessage());
		}
		sc.close();

	}
}