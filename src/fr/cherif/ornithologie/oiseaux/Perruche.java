package fr.cherif.ornithologie.oiseaux;

public class Perruche extends Oiseau implements Volant {

	public Perruche() {
		super();
	}

	public Perruche(String nom, boolean plumes, double taille, double poids, String regime, int age, String couleur) {
		super(nom, plumes, taille, poids, regime, age, couleur);
	}

	@Override
	public void voler() {
		System.out.println("Je vole joliment");

	}

}
