package Model;

public class Gazelle extends Animal {

    private int horn;


    public Gazelle(String name, int age, double weight, int horn) {
        this.age = age;
        this.name = name;
        this.weight = weight;
        this.horn = horn;
    }

    public void die() {
        System.out.println("OUPS");
    }

    public void eat(){
        eat(0.4);
    }

    public void sleep() {
        sleep(0.1);
    }

    public void run(){
        setWeight(sum(getWeight(),-0.07));
    }

    public int getHorn() {
        return horn;
    }

    public void setHorn(int horn) {
        this.horn = horn;
    }
}
