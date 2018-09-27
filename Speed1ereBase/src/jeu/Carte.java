package jeu;

import java.awt.Color;

public class Carte {
	
	private static Color[] colorList = {Color.darkGray, Color.blue, Color.orange, Color.cyan, Color.black, Color.lightGray};	
	private static int[] valueList = {1, 2, 3, 4, 5};
	
	public static final int NBR_COULEURS = colorList.length;
	public static final int NBR_MOTIFS = Symbole.NBR_SYMBOLE;
	public static final int NBR_VALEURS = valueList.length;
	
	
	
	private Color couleur;
	private Symbole motif;
	private int valeur;
	private boolean isDead;
	
	

	public Carte() {
		this.couleur = Color.darkGray;
		this.isDead = true;
	}

	public Carte(int couleur, Symbole motif, int valeur) {
		super();
		if(couleur <= NBR_COULEURS && couleur > 0 && valeur <= NBR_VALEURS && valeur > 0) {
			this.couleur = colorList[couleur];
			this.motif = motif;
			this.valeur = valueList[valeur-1];
			this.isDead = false;
		}
		else {
			System.out.println("Paramètre d'Objet Carte invalide");
			this.couleur = Color.darkGray;
			this.isDead = true;
		}
	}

	@Override
	public String toString() {		
		return !isDead? "[valeur=" + valeur + ";motif=" + motif.toString() + ";couleur=" + couleur.toString() + "]" : "[valeur=-1;motif=null;couleur=" + couleur.toString() + "]";
	}
	
	public static Color[] getColorList() {
		return colorList;
	}

	
	
	
	
	
	
}
