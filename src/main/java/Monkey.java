public class Monkey implements Animal {
    private String name;

    private int age;

    private int weight;

    public Monkey(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void eat() {
        setWeight(getWeight()+350);
    }

    public void sleep() {
        setWeight(getWeight()-120);
    }

    public void jump(){
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
}
