package tn.esprit.gestionzoo.classes;

public class Animal {


    protected String family;
    protected String name;
    protected int age;
    protected boolean isMammal;

    void setAge(int age){
        if(age > 0){
            this.age = age;
            return;
        }
        System.out.println("age under 0");
    }

    String  getName(){
        return name;
    }

    Animal()
    {

    }
    public Animal(String family,String name,int age,boolean isMammal)
    {
        this.family=family;
        this.name=name;
        this.age=age;
        this.isMammal=isMammal;
    }
    public void displayAnimal()
    {
        System.out.println("Family : " + family + "Name : " +name +"Age : " + age +
                " Is Mammal : " + isMammal);
    }

    @Override
    public String toString() {
        return "Family : " + family + "Name : " +name +"Age : " + age +
                " Is Mammal : " + isMammal;
    }
}