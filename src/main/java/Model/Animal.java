package Model;

public abstract class Animal {
    protected String name;
    protected int age;
    protected int weight;

    public Animal(){

    }
    public Animal(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public abstract int getWeight();
    public abstract int getAge();
    public abstract String getName();
    public abstract void eat();

    public abstract void sleep();
}
