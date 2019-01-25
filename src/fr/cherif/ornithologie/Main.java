package fr.cherif.ornithologie;

import fr.cherif.ornithologie.oiseaux.Aigle;
import fr.cherif.ornithologie.oiseaux.Autruche;
import fr.cherif.ornithologie.oiseaux.Canard;
import fr.cherif.ornithologie.oiseaux.Manchot;
import fr.cherif.ornithologie.oiseaux.Perruche;
import fr.cherif.ornithologie.oiseaux.Pigeon;

public class Main {

	public static void main(String[] args) {

//ex pour aller plus vite : Pigeon nom = new Pigeon ctrl+ espace		
		Autruche Meu = new Autruche("Meu", true, 230, 77, "omnivore", 7, "beige et blanc");
		Perruche Per = new Perruche("Perry", true, 21, 0.380, "graines", 2, "vert et jaune");
		Pigeon Pig = new Pigeon("Vomito", true, 22, 0.830, "omnivore", 3, "jaune sale");
		Aigle ea = new Aigle("Igle", true, 110, 12, "omnivore", 5, "brun");
		Manchot man = new Manchot("Ambidextre", false, 140, 40, "Piscivore", 7, "noir et blanc");
		Canard duc = new Canard("Nukem", true, 25, 2, "omnivore", 3, "blanc et vert");
//Ordres
		Meu.courir();

		Per.voler();

		Pig.voler();

		man.nager();

		ea.nager();
		ea.voler();

		duc.voler();
		duc.nager();
	}

}
