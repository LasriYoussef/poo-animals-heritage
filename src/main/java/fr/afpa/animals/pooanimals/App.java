package fr.afpa.animals.pooanimals;
package fr.afpa.heritage;

import java.util.ArrayList;

public class App {
	
	public static void main(String[] arg){

		
		//ArrayList pour stocker les animaux
		ArrayList<Animal> animals = new ArrayList<Animal>();
		
		//Instance de chaque animal
		Animal max = new Mamal("Lion", "Savane", "beige");
		Animal leon = new Bird("Mouette", "Côte", 22);
		Animal stephanie = new Fish("Saumon", "Riviere", 30);
		
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
	
