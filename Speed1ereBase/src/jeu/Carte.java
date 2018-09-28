package jeu;

import java.awt.Color;

public class Carte {
	
	private static Color[] colorList = {Color.darkGray, Color.blue, Color.orange, Color.cyan, Color.black, Color.lightGray};	
	private static int[] valueList = {1, 2, 3, 4, 5};
	
	public static final int NBR_COULEURS = colorList.length;
	public static final int NBR_MOTIFS = 5;
	public static final int NBR_VALEURS = valueList.length;
	
	
	
	private Color couleur;
	private Symbole motif;
	private int valeur;
	
	

	public Carte() {
		forcerVide();
	}

	private void forcerVide() {
		this.couleur = Color.darkGray;
		this.valeur = -1;
		this.motif = Symbole.VIDE;
	}

	public Carte(int couleur, Symbole motif, int valeur) {
		super();
		if(couleur <= NBR_COULEURS && couleur > 0 && valeur <= NBR_VALEURS && valeur > 0) {
			this.couleur = colorList[couleur];
			this.motif = motif;
			this.valeur = valueList[valeur-1];
			
		}
		else {
			System.out.println("Paramètre d'Objet Carte invalide");
			forcerVide();
		}
	}

	@Override
	public String toString() {		
		return !isVide()? "[valeur=" + valeur + ";motif=" + motif.toString() + ";couleur=" + couleur.toString() + "]" : "[valeur=-1;motif=null;couleur=" + couleur.toString() + "]";
	}
	
	public static Color[] getColorList() {
		return colorList;
	}
	
	public boolean estCompatible(Carte c) {
		boolean compatible = false;
		if(!c.isVide() || !this.isVide()) {
			if(c.valeur == this.valeur || c.motif == this.motif || c.couleur == this.couleur) {
				compatible = true;
			}
		}
		return true;
	}
	
	public boolean isVide() {
		return motif == Symbole.VIDE;
	}
	
	

	public Color getCouleur() {
		return couleur;
	}
	
	public int getCouleurIndex() {
		int index = 0;
		for(int i = 0; i <= colorList.length; i++) {
			if(colorList[i] == couleur) {
				index = i+1;
			}
		}
		return index;
	}

	public Symbole getMotif() {
		return motif;
	}
	
	public int getValeur() {
		return valeur;
	}

	
	
	
	
	
	
}
