package jeu;

public class Joueur {
	private final String nom;
	private final PaquetCarte packCarte;	
	public static final int PENALITE = 3;
	
	private int penalite = 0;
	

	public Joueur(String nom, PaquetCarte packCarte) {
		super();
		this.nom = nom;
		this.packCarte = packCarte;
	}
	
	public boolean gagne() {
		return this.packCarte.listCarte.get(0).isVide() ? true : false;
	}


	public String getNom() {
		return nom;
	}


	public PaquetCarte getPackCarte() {
		return packCarte;
	}	
	
	public void annulerPenalite() {
		this.penalite = 0;
	}
	
	public void ajouterPenalite() {
		this.penalite = this.PENALITE;
	}
	
	public boolean sansPenalite() {
		return this.penalite == 0 ? true : false;
	}
	
	public void oterEventuellementUnePenalite() {
		if(this.penalite > 0) {
			this.penalite--;
		}
	}
	
	public void gererErreur(Joueur mechant) {
		mechant.annulerPenalite();
		this.ajouterPenalite();
	}
	
	public Carte testerCarteSommet(int position, Carte sommet, Joueur mechant) {
		Carte c = null;
		if(sommet.estCompatible(this.packCarte.listCarte.get(position))) {
			c = this.packCarte.listCarte.remove(position);
			mechant.oterEventuellementUnePenalite();
		}		
		return c;
	}

	public Carte get(int i) {
		return this.packCarte.listCarte.get(i);
	}

	public Carte remove(int i) {
		return this.packCarte.listCarte.remove(i);
	}

	public int size() {
		return this.packCarte.listCarte.size();
	}

	public void add(Carte carte) {
		this.packCarte.listCarte.add(carte);
	}
	
}
