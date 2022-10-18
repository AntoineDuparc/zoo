package Model;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Lion extends Animal {

    public Lion(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void eat() {
        eat(1.9);
    }

    public void eat(Visitor visitor){
        visitor.die();
        System.out.println(visitor.getName() + " is dead");
        eat();
    }

    public void eat(Gazelle gazelle){
        System.out.println(gazelle.getName() + " is dead");
        gazelle.die();
        eat();
    }

    public void sleep() {
        sleep(0.3);
    }

    public void jump(){
        setWeight(sum(getWeight(),-0.5));
    }

    public void run(){
        setWeight(sum(getWeight(),-0.35));
    }

    public void roar(){
        System.out.println("Roooooar");
    }

}
