package Manager;

import Model.Cage;
import Model.Gazelle;
import Model.Lion;
import Model.Visitor;
import View.Zoo;

public class Manager {

    public void lionEatsGazelle(Zoo zoo,Cage cage, Cage cage2) throws Exception{
        if (cage.getAnimal().getClass() == Model.Lion.class && cage2.getAnimal().getClass() == Model.Gazelle.class){
            cage.open();
            cage2.open();
            ((Lion) cage.getAnimal()).eat((Gazelle) cage2.getAnimal());
            cage.close();
            cage2.close();
            zoo.getCages().remove(cage2);
            System.out.println("Le lion a mangé la gazelle");
        } else throw new Exception("Expected @param2 = Cage.Lion @param3 = Cage.Gazelle");
    }

    public void lionEatsVisitor(Zoo zoo, Cage cage, Visitor visitor) throws Exception{
        if (cage.getAnimal().getClass() == Model.Lion.class){
            cage.open();
            ((Lion) cage.getAnimal()).eat(visitor);
            cage.close();
            System.out.println("Le lion a mangé " + visitor.getName());
        } else throw new Exception("Expected @param2 = Cage.Lion");
    }

    public void zooFeedsAnimals(Zoo zoo){
        for (Cage cage:
             zoo.getCages()) {
            cage.open();
            zoo.feed(cage.getAnimal());
            cage.close();
            System.out.println("Le zoo nourrit les animaux");
        }
    }

}
