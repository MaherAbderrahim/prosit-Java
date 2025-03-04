package tn.esprit.gestionzoo.classes;

public class Lion extends Animal {

    String color;
    String[] food;


    public Lion() {
        super("unknown","unknown",0,false);
        this.color = "unknown";
        this.food = new String[10];

    }
    public Lion(String family, String name, int age, boolean isMammal, String color, String[] food) {
        super(family,name,age,isMammal);
        this.color = color;
        this.food = new String[10];
        if ( food.length < 10 ) {
            for (int i = 0; i < food.length; i++) {
                this.food[i] = food[i];
            }

        }else{
            System.out.println("more than 10 aliments");
        }


    }
    @Override
    public String toString() {
        return "- Nom du Lion : "+ name +
                " family : " + family +
                " age : " + age +
                " isMammal : " + isMammal +
                " color : " + color + " - ";

    }

}
