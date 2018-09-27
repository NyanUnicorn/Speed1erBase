package jeu;

import controleur.Controleur;

public class Speed {

	public static void main(String[] args) {
		Carte c0 = new Carte();
		Carte c1 = new Carte(1, Symbole.BALLON, 2);
		
		System.out.println(c0);
		System.out.println(c1);
		new Controleur();
	}
	
}
