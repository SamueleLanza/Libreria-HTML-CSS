package org.generation.italy.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Registrazioni {
	
	public int idUtente;
	public String nome, cognome, mail, password;
	
    @Override
    public String toString() {
        return "Utente\n" + "[id=" + idUtente + "\nnome=" + nome + "\ncognome=" + cognome + 
        		"\nmail=" + mail + "\npassword=" + password + "]";}
}