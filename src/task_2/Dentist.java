package task_2;

public class Dentist extends Doctor{

    public Dentist() {
    }

    public Dentist(String name) {
        super(name, 2);
    }

    @Override
    public void treat() {
        System.out.println("Dentist treats.");
    }

    @Override
    public String toString() {
        return "Dentist " + super.toString();
    }
}
