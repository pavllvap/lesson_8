package task_2;

public class Surgeon extends Doctor{

    public Surgeon() {
    }


    public Surgeon(String name) {
        super(name, 1);
    }

    @Override
    public void treat() {
        System.out.println("Surgeon treats.");
    }

    @Override
    public String toString() {
        return "Surgeon " + super.toString();
    }
}
