package jeu;

import java.util.ArrayList;
import java.util.List;

public class PaquetCarte {

	private final int NBR_CARTES = 72;

	private List<Carte> listCarte;
	
	
	public PaquetCarte() {
		//this.NBR_CARTES = 72;
		this.listCarte = new ArrayList<Carte>();
		initPaquet();
	}
	
	private void initPaquet() {
		int i = 0;
		int couleur;
		int valeur;
		int motif;
		while(i < NBR_CARTES) {
			couleur = 1;
			while(i < NBR_CARTES && couleur <= Carte.NBR_COULEURS) {
				valeur = 1;
				while(i < NBR_CARTES && valeur <= Carte.NBR_VALEURS) {
					motif = 0;
					while(i < NBR_CARTES && motif < Carte.NBR_MOTIFS) {
						this.listCarte.add(new Carte(couleur, Symbole.tableau[motif] , valeur));
						i++;
					}
				}
			}	
		}
			
	}
	
	public int paquetSize() {
		return listCarte.size();
	}
	
	public void addCart(Carte c) {
		listCarte.add(c);
	}

	@Override
	public String toString() {
		String paquet = "";
		int i = 0;
		for(Carte c : listCarte) {
			i++;
			paquet += c.toString() + ((i < listCarte.size())? "\n": "");			
		}
		return paquet;
	}
	
	

}
