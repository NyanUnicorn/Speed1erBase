package jeu;

public enum Symbole {
	BALLON, FANION, ETOILE, MAISON, ARBRE;

	public static final Symbole[] TAB_SYMBOLE = Symbole.values();
	public static final int NBR_SYMBOLE = TAB_SYMBOLE.length;

	public static Symbole get(int i) {
		return TAB_SYMBOLE[i-1];
	}

	@Override
	public String toString() {
		String value;
		switch(this) {
		case BALLON:
			value = "ballon";
			break;
		case FANION:
			value = "fanion";
			break;
		case ETOILE:
			value = "etoile";
			break;
		case MAISON:
			value = "maison";
			break;
		case ARBRE:
			value = "arbres";
			break;
		default:
			value = "";	
		
		}
		return value;
	}
	
	

}
