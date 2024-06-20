package org.generation.italy.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Libro {

	public int id;

	public String titolo, autore, genere, casa_editrice;
	public int quantita, pubblicazione;
	
	@Override
	public String toString() {

		return "\n[titolo=" + titolo + "\nautore=" + autore + "\ngenere=" + genere + "\nquantita=" + quantita
				+ "\ncasa_editrice=" + casa_editrice + "\nanno di pubblicazione=" + pubblicazione + "]\n";
	}
}