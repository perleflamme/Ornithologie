package fr.cherif.ornithologie.oiseaux;

public class Aigle extends Oiseau implements Volant, Nageur {

	public Aigle() {
		super();
	}

	public Aigle(String nom, boolean plumes, double taille, double poids, String regime, int age, String couleur) {
		super(nom, plumes, taille, poids, regime, age, couleur);
	}

	@Override
	public void voler() {
		System.out.println("Je vole!");
	}

	@Override
	public void nager() {
		System.out.println("Je plonge et nage pour chasser");
	}

}
