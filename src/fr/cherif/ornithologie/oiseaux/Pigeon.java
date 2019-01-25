package fr.cherif.ornithologie.oiseaux;

public class Pigeon extends Oiseau implements Volant {

	public Pigeon() {
		super();
	}

	public Pigeon(String nom, boolean plumes, double taille, double poids, String regime, int age, String couleur) {
		super(nom, plumes, taille, poids, regime, age, couleur);
	}

	@Override
	public void voler() {
		System.out.println("Je vole au dessus des villes!");
	}

}
