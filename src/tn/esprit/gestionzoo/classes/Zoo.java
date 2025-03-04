package tn.esprit.gestionzoo.classes;

public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private final int nbrCages = 3; // Réduction du nombre de cages à 3
    private int compteurAnimal;

    public Zoo() {
        compteurAnimal = 0;
        this.animals = new Animal[nbrCages];
    }

    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        compteurAnimal = 0;
        this.animals = new Animal[nbrCages];
    }

    public void addAnimal(Animal a) throws ZooFullException {
        if (compteurAnimal >= nbrCages) {
            throw new ZooFullException("Le zoo est plein, impossible d'ajouter un nouvel animal.");
        }
        animals[compteurAnimal] = a;
        compteurAnimal++;
        System.out.println("Animal ajouté. Nombre total d'animaux : " + compteurAnimal);
    }

    public int getNombreAnimaux() {
        return compteurAnimal;
    }

    public void displayZoo() {
        System.out.println("Nom du Zoo : " + name + " | Ville : " + city + " | Nombre de Cages : " + nbrCages);
    }

    public void displayAnimals() {
        System.out.println("Liste des animaux dans le zoo:");
        for (int i = 0; i < compteurAnimal; i++) {
            animals[i].displayAnimal();
        }
    }

    public boolean removeAnimal(Animal a) {
        int i = searchAnimal(a);
        if (i != -1) {
            for (int j = i; j < compteurAnimal - 1; j++) {
                animals[j] = animals[j + 1];
            }
            animals[compteurAnimal - 1] = null;
            compteurAnimal--;
            System.out.println("Animal supprimé. Nombre total d'animaux : " + compteurAnimal);
            return true;
        }
        return false;
    }

    public int searchAnimal(Animal a) {
        String nom = a.getName();
        for (int i = 0; i < compteurAnimal; i++) {
            if (animals[i].getName().equals(nom)) {
                return i; // Retourne l'index de l'animal
            }
        }
        return -1;
    }
}
