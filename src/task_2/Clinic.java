package task_2;

import java.util.ArrayList;

public class Clinic {

    private ArrayList<Doctor> listOfDoctors;

    public Clinic() {
        listOfDoctors = new ArrayList<>();
        listOfDoctors.add(new Surgeon("John"));
        listOfDoctors.add(new Dentist("Marry"));
        listOfDoctors.add(new Therapist("Bob"));
    }

    public ArrayList<Doctor> getListOfDoctors() {
        return listOfDoctors;
    }

    public void setListOfDoctors(ArrayList<Doctor> listOfDoctors) {
        this.listOfDoctors = listOfDoctors;
    }



    @Override
    public String toString() {
        return "Clinic{" +
                "doctor=" + listOfDoctors +
                '}';
    }
}
