import java.util.ArrayList;

public class Zoo {
    private ArrayList<Cage> cages;

    private ArrayList<Visitor> visitors;

    public Zoo(ArrayList<Cage> cages, ArrayList<Visitor> visitors) {
        this.cages = cages;
        this.visitors = visitors;
    }

    public void welcome(Visitor visitor) throws Exception {
        if (getVisitors().size()<10)
            getVisitors().add(visitor);
        else throw new Exception("Le zoo est complet");
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
