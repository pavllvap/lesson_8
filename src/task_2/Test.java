package task_2;


public class Test {
    public static void main(String[] args) {
        Clinic clinic = new Clinic();
        System.out.println(clinic);
        Patient patient = new Patient("Alex", 1983, clinic);
        System.out.println(patient);
        TreatmentPlan plan  = new TreatmentPlan("covid", 3);
        patient.setDoctorByTreatmentPlan(plan);
        System.out.println(patient);
        patient.getDoctor().treat();
        System.out.println("------------------------------------------------");
        TreatmentPlan plan1  = new TreatmentPlan("toothache", 2);
        patient.setDoctorByTreatmentPlan(plan1);
        System.out.println(patient);
        patient.getDoctor().treat();
        System.out.println("------------------------------------------------");
        TreatmentPlan plan2  = new TreatmentPlan("appendicitis", 1);
        patient.setDoctorByTreatmentPlan(plan2);
        System.out.println(patient);
        patient.getDoctor().treat();






    }
}
