package fr.cherif.ornithologie.oiseaux;

public class Manchot extends Oiseau implements Nageur {

	public Manchot() {
		super();
	}

	public Manchot(String nom, boolean plumes, double taille, double poids, String regime, int age, String couleur) {
		super(nom, plumes, taille, poids, regime, age, couleur);
	}

	@Override
	public void nager() {
		System.out.println("Je Nage bien");

	}

}
