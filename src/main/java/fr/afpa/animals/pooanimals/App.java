package fr.afpa.animals.pooanimals;

import java.util.ArrayList;

public class App {

	// public static void main(String[] args) {

	// 	Animal landMammal1 = new LandMammal(" Lion ", " Savane ", " Or ");
	// 	Animal bird1 = new Bird(" Aigle ", " Foret ", 2);
	// 	Animal fish1 = new Fish(" balaine ", " Foret ", 1450);
	// 	Animal fish2 = new Fish(" Sardine ", " Mer et Ocean ", 30);
	// 	Animal fish3 = new Fish("Requin ", " Ocean ", 1000);

	// 	System.out.println("landMammal1 : " + landMammal1 + "\n" + landMammal1.displayLocomotionType());
	// 	System.out.println("bird1 : " + bird1 + "\n" + bird1.displayLocomotionType());
	// 	System.out.println("fish1 : " + fish1 + "\n" + fish1.displayLocomotionType());
	// 	System.out.println("fish2 : " + fish2 + "\n" + fish2.displayLocomotionType());
	// 	System.out.println("fish3 : " + fish2 + "\n" + fish3.displayLocomotionType());

	// 	System.out.println("\n-----------------------------------");

	// 	// ARRAY LIST
	// 	ArrayList<Animal> arrayAnimals = new ArrayList<>();

	// 	arrayAnimals.add(landMammal1);
	// 	arrayAnimals.add(bird1);
	// 	arrayAnimals.add(fish1);
	// 	arrayAnimals.add(fish2);
	// 	arrayAnimals.add(fish3);

	// 	// Boucle for each pour lire l'arrayList
	// 	for (Animal animal : arrayAnimals) {
	// 		System.out.println(animal);
	// 	}
	// }
// }
	public static void main(String[] arg){

		
		//ArrayList pour stocker les animaux
		ArrayList<Animal> animals = new ArrayList<Animal>();
		
		//Instance de chaque animal
		Animal max = new LandMammal(" Lion ", " Savane ", " Or ");
		Animal leon = new Bird(" Aigle ", " Foret ", 2);
		Animal stephanie = new Fish(" Balaine ", " Ocean ", 1450);
		
		//On remplit l'arrayList
		animals.add(max);
		animals.add(leon);
		animals.add(stephanie);
		
		//Boucle for each pour lire l'arrayList
		for (Animal animal : animals){
			System.out.println(animal);
		}
	}
}