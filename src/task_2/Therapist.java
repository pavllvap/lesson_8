package task_2;

public class Therapist extends Doctor{

    public Therapist() {
    }

    public Therapist(String name) {
        super(name, 3);
    }

    @Override
    public void treat() {
        System.out.println("Therapist treats.");
    }

    @Override
    public String toString() {
        return "Therapist " + super.toString();
    }
}
