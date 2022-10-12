public class Lion implements Animal {
    private String name;

    private int age;

    private int weight;

    public Lion(String name, int age, int weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void eat() {
        setWeight(getWeight()+1900);
    }

    public void eat(Visitor visitor){
        visitor.kill();
        eat();
    }

    public void eat(Gazelle gazelle){
        gazelle.kill();
    }

    public void sleep() {
        setWeight(getWeight()-300);
    }

    public void jump(){
        setWeight(getWeight()-500);
    }

    public void run(){
        setWeight(getWeight()-350);
    }

    public void roar(){
        System.out.println("Roooooar");
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
