import Manager.Manager;
import Model.*;
import View.Zoo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        Zoo zoo = new Zoo(new ArrayList<Cage>(),new ArrayList<Visitor>());

        zoo.welcome(new Visitor("Toto",5));
        zoo.welcome(new Visitor("Annie",7));
        zoo.welcome(new Visitor("Zoe",8));

        zoo.getCages().add(new Cage(new Lion("Rengar",12,100),false));
        zoo.getCages().add(new Cage(new Gazelle("Lilia",10,50,10),false));
        zoo.getCages().add(new Cage(new Monkey("Wukong",13,60),false));

        for (Cage cage:
                zoo.getCages()) {
            zoo.display(cage);
        }

        Manager manager = new Manager();

        manager.lionEatsGazelle(zoo,zoo.getCages().get(0),zoo.getCages().get(1));
        manager.lionEatsVisitor(zoo,zoo.getCages().get(0),zoo.getVisitors().get(0));


        for (Cage cage:
                zoo.getCages()) {
            zoo.display(cage);
        }
    }
}
