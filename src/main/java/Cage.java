public class Cage {
    private Animal animal;
    private boolean isOpen;

    public Cage(){

    }

    public void open(){
        setOpen(true);
    }

    public void close(){
        setOpen(false);
    }

    public Cage(Animal animal,boolean isOpen) {
        this.animal = animal;
        this.isOpen = isOpen;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public boolean isOpen() {
        return isOpen;
    }
}
