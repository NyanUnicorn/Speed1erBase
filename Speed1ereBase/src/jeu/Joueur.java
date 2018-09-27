package jeu;

public class Joueur {
	private final String nom;
	private final PaquetCarte packCarte;


	public Joueur(String nom, PaquetCarte packCarte) {
		super();
		this.nom = nom;
		this.packCarte = packCarte;
	}


	public String getNom() {
		return nom;
	}


	public PaquetCarte getPackCarte() {
		return packCarte;
	}
	
}
