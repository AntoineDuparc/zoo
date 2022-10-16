package Model;

public abstract class Animal {
    protected String name;
    protected int age;
    protected double weight;

    public Animal(){

    }
    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public double getWeight(){
        return weight;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public abstract void eat();

    public abstract void sleep();

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
