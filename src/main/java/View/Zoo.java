package View;

import Model.Animal;
import Model.Cage;
import Model.Visitor;

import java.util.ArrayList;

public class Zoo {
    private ArrayList<Cage> cages;

    private ArrayList<Visitor> visitors;

    public Zoo(ArrayList<Cage> cages, ArrayList<Visitor> visitors) {
        this.cages = cages;
        this.visitors = visitors;
    }

    public void welcome(Visitor visitor) throws Exception {
        if (getVisitors().size()<3)
            getVisitors().add(visitor);
        else throw new Exception("Le zoo est complet");
    }

    public void display(Cage cage) {
        System.out.println("----------" + cage.getAnimal().getClass() + "-------------");
        System.out.println(cage.getAnimal().getName() + " a " + cage.getAnimal().getAge() + " ans et pèse " + cage.getAnimal().getWeight() + " kg");
    }

    public void feed(Animal animal){
        animal.eat();
    }

    public ArrayList<Cage> getCages() {
        return cages;
    }

    public void setCages(ArrayList<Cage> cages) {
        this.cages = cages;
    }

    public ArrayList<Visitor> getVisitors() {
        return visitors;
    }

    public void setVisitors(ArrayList<Visitor> visitors) {
        this.visitors = visitors;
    }
}
