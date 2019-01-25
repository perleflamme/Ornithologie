package fr.cherif.ornithologie.oiseaux;

public class Canard extends Oiseau implements Volant, Nageur {

	public Canard() {
		super();
	}

	public Canard(String nom, boolean plumes, double taille, double poids, String regime, int age, String couleur) {
		super(nom, plumes, taille, poids, regime, age, couleur);
	}

	@Override
	public void nager() {
		System.out.println("Je nage bizzarement");

	}

	@Override
	public void voler() {
		System.out.println("Je vole en escadrille");

	}

}
