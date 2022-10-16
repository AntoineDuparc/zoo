package Model;

public class Monkey extends Animal {

    public Monkey(String name, int age, float weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void eat() {
        setWeight(getWeight()+0.35);
    }

    public void sleep() {
        setWeight(getWeight()-0.12);
    }

    public void jump(){
        setWeight(getWeight()-0.07);
    }
}
