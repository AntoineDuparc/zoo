package Model;

import java.math.BigDecimal;
import java.math.RoundingMode;

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

    public double sum(double a,double b) {
        BigDecimal bigDecimal = BigDecimal.valueOf(a+b);
        return
                bigDecimal.setScale(1, RoundingMode.valueOf(0))
                        .doubleValue();
    }
    public abstract void eat();
    public void eat(double weightGain){
        setWeight(sum(getWeight(),weightGain));
    }

    public abstract void sleep();

    public void sleep(double weightLoss){
        setWeight(sum(getWeight(),-weightLoss));
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
