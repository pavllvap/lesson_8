package task_2;

public class Patient {

    private String name;
    private int yearOfBirth;

    private Clinic clinic;

    private Doctor doctor;
    private TreatmentPlan plan;

    public Patient() {
    }

    public Patient(String name, int yearOfBirth, Clinic clinic) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.clinic = clinic;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public Clinic getClinic() {
        return clinic;
    }

    public void setClinic(Clinic clinic) {
        this.clinic = clinic;
    }

    public TreatmentPlan getPlan() {
        return plan;
    }

    public void setPlan(TreatmentPlan plan) {
        this.plan = plan;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }


    public void setDoctorByTreatmentPlan(TreatmentPlan plan) {
        setPlan(plan);
        for (Doctor doc : clinic.getListOfDoctors()) {
            if (plan.getCodeOfTreat() == doc.getCodeOfSpeciality()) {
                setDoctor(doc);
                break;
            } else if (doc.getCodeOfSpeciality() == 3) {
                setDoctor(doc);
            }
        }
    }


    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", doctor=" + doctor +
                ", plan=" + plan +
                '}';
    }
}
