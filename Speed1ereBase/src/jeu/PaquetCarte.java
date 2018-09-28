package jeu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PaquetCarte {

	private final int NBR_CARTES = 72;

	public List<Carte> listCarte;
	
	
	
	public PaquetCarte(PaquetCarte pak, int num) {
		this.listCarte = new ArrayList<Carte>();
		if(num <= pak.listCarte.size()) {
			Collections.shuffle(pak.listCarte);
			int i = 0;
			while(i < num) {
				this.listCarte.add(pak.listCarte.get(0));
				pak.listCarte.remove(0);
				i++;
			}
			Collections.shuffle(this.listCarte);
			
		}else {
			System.out.println("Nombre de cartes insuffisante");
			System.exit(0);
		}
	}

	public PaquetCarte() {
		//this.NBR_CARTES = 72;
		this.listCarte = new ArrayList<Carte>();
		initPaquet(NBR_CARTES*2);
		Collections.shuffle(this.listCarte);
		trimList(this.listCarte, this.listCarte.size() / 2);
		Collections.shuffle(this.listCarte);
	}
	
	public void trimList(List<Carte> pc, int cut){
		for(int i = 0; i < cut; i++) {
			pc.remove(0);
		}
	}
	
	private void initPaquet(int size) {
		int i = 0;
		int couleur;
		int valeur;
		int motif;
		while(i < size) {
			couleur = 1;
			while(i < size && couleur < Carte.NBR_COULEURS) {
				valeur = 1;
				while(i < size && valeur < Carte.NBR_VALEURS) {
					motif = 0;
					while(i < size && motif < Carte.NBR_MOTIFS) {
						this.listCarte.add(new Carte(couleur, Symbole.TAB_SYMBOLE[motif] , valeur));
						i++;
						motif ++;
					}
					valeur++;
				}
				couleur++;
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

	public int size() {
		return this.listCarte.size();
	}
	
	
	

}
