package jeu;

import controleur.Controleur;

public class Speed {

	public static void main(String[] args) {
		//Carte c0 = new Carte();
		//Carte c1 = new Carte(1, Symbole.BALLON, 2);
		PaquetCarte pc0 = new PaquetCarte();
		PaquetCarte pc1 = new PaquetCarte(pc0, 30);
		
		//System.out.println(c0);
		//System.out.println(c1);
		System.out.println(pc0);
		System.out.println(pc1);
		new Controleur();
	}
	
}
