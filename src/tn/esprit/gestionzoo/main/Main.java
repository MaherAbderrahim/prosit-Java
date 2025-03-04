package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.classes.*;

public class Main {
    public static void main(String[] args) {
        String[] foodList = {"humans"};

        Animal lion = new Lion("fam", "ahmed", 12, true, "blue", foodList);
        Animal lion2 = new Lion();
        Animal tigre = new Lion("tiger", "mohamed", 10, true, "yellow", foodList);
        Animal girafe = new Lion("giraffe", "ali", 15, false, "brown", foodList); // 4ème animal pour test

        Zoo myZoo = new Zoo("MyZoo", "LOS ANGELES");
        myZoo.displayZoo();

        try {
            myZoo.addAnimal(lion);
            myZoo.addAnimal(lion2);
            myZoo.addAnimal(tigre);
        } catch (ZooFullException e) {
            System.out.println("Erreur : " + e.getMessage());
        }

        myZoo.displayAnimals();

        myZoo.removeAnimal(lion);
        myZoo.displayAnimals();
    }
}
