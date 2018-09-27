package jeu;

import java.util.ArrayList;
import java.util.List;

public class PaqueetCarte {

	private List<Carte> listCart = new ArrayList<Carte>();
	
	public PaqueetCarte() {
		
	}
	
	public int paquetSize() {
		return listCart.size();
	}
	
	public void addCart(Carte c) {
		listCart.add(c);
	}

}
