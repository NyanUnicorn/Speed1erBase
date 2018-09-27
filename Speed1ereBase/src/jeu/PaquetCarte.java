package jeu;

import java.util.ArrayList;
import java.util.List;

public class PaquetCarte {

	private final int NBR_CARTES;

	private List<Carte> listCart = new ArrayList<Carte>();
	
	public PaquetCarte(int nombreCarte) {
		this.NBR_CARTES = nombreCarte;
	}
	
	public int paquetSize() {
		return listCart.size();
	}
	
	public void addCart(Carte c) {
		listCart.add(c);
	}

}
