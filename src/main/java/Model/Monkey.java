package Model;

public class Monkey extends Animal {

    public Monkey(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void eat() {
        eat(0.35);
    }

    public void sleep() {
        sleep(0.12);
    }

    public void jump(){
        setWeight(sum(getWeight(),-0.07));
    }
}
