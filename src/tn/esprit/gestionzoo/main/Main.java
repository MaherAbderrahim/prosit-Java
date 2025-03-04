package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.classes.*;
import tn.esprit.gestionzoo.utils.ZooFullException;

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
        } catch (ZooFullException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
        finally {
            System.out.println("nbr cage = "+myZoo.getNbrCages());
        }

        try {
            myZoo.addAnimal(lion2);
        } catch (ZooFullException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
        finally {
            System.out.println("nbr cage = "+myZoo.getNbrCages());
        }

        try {
            myZoo.addAnimal(tigre);
        } catch (ZooFullException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
        finally {
            System.out.println("nbr cage = "+myZoo.getNbrCages());
        }

        try {
            myZoo.addAnimal(girafe);
        } catch (ZooFullException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
        finally {
            System.out.println("nbr cage = "+myZoo.getNbrCages());
        }

        myZoo.displayAnimals();


        myZoo.removeAnimal(lion);
        myZoo.displayAnimals();
    }
}
