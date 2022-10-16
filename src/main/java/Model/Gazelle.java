package Model;

import Model.Animal;
import Model.Cage;

public class Gazelle extends Animal {

    private int horn;


    public Gazelle(String name,int age, int weight, int horn) {
        this.age = age;
        this.name = name;
        this.weight = weight;
        this.horn = horn;
    }

    public void die() {
        System.out.println("OUPS");
    }

    public void eat(){
        setWeight(getWeight()+400);
    }

    public void sleep() {
        setWeight(getWeight()-100);
    }

    public void run(){
        setWeight(getWeight()-70);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHorn() {
        return horn;
    }

    public void setHorn(int horn) {
        this.horn = horn;
    }
}
