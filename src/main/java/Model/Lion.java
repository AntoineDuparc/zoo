package Model;

public class Lion extends Animal {

    public Lion(String name, int age, float weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void eat() {
        setWeight(getWeight()+1.9);
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
        setWeight(getWeight()-0.3);
    }

    public void jump(){
        setWeight(getWeight()-0.5);
    }

    public void run(){
        setWeight(getWeight()-0.35);
    }

    public void roar(){
        System.out.println("Roooooar");
    }

}
