package task_2;

public class TreatmentPlan {

    private String disease;
    private int codeOfTreat;


    public TreatmentPlan() {
    }

    public TreatmentPlan(String disease, int codeOfTreat) {
        this.disease = disease;
        this.codeOfTreat = codeOfTreat;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public int getCodeOfTreat() {
        return codeOfTreat;
    }

    public void setCodeOfTreat(int codeOfTreat) {
        this.codeOfTreat = codeOfTreat;
    }

    @Override
    public String toString() {
        return "TreatmentPlan{" +
                "disease='" + disease + '\'' +
                ", codeOfTreat=" + codeOfTreat +
                '}';
    }





}
