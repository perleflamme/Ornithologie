package fr.cherif.ornithologie.oiseaux;

public class Oiseau {
	protected String nom;
	protected boolean plumes;
	protected double taille;
	protected double poids;
	protected String regime;
	protected int age;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public boolean isPlumes() {
		return plumes;
	}

	public void setPlumes(boolean plumes) {
		this.plumes = plumes;
	}

	public double getTaille() {
		return taille;
	}

	public void setTaille(double taille) {
		this.taille = taille;
	}

	public double getPoids() {
		return poids;
	}

	public void setPoids(double poids) {
		this.poids = poids;
	}

	public String getRegime() {
		return regime;
	}

	public void setRegime(String regime) {
		this.regime = regime;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	protected String couleur;

	public Oiseau() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Oiseau(String nom, boolean plumes, double taille, double poids, String regime, int age, String couleur) {
		super();
		this.nom = nom;
		this.plumes = plumes;
		this.taille = taille;
		this.poids = poids;
		this.regime = regime;
		this.age = age;
		this.couleur = couleur;
	}

	public void manger() {
		System.out.println("Slurp!");
	}

	public void dormir() {
		System.out.println("Dodo!");
	}

	public void boire() {
		System.out.println("J'ai Soif!");
	}

	public void courir() {
		System.out.println("Je Cours!");
	}

	public void jouer() {
		System.out.println("Je Joue!");
	}

}
