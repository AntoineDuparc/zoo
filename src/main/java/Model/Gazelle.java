package Model;

public class Gazelle extends Animal {

    private int horn;


    public Gazelle(String name, int age, float weight, int horn) {
        this.age = age;
        this.name = name;
        this.weight = weight;
        this.horn = horn;
    }

    public void die() {
        System.out.println("OUPS");
    }

    public void eat(){
        setWeight(getWeight()+0.4);
    }

    public void sleep() {
        setWeight(getWeight()-0.1);
    }

    public void run(){
        setWeight(getWeight()-0.07);
    }

    public int getHorn() {
        return horn;
    }

    public void setHorn(int horn) {
        this.horn = horn;
    }
}
