package task_2;

public abstract class Doctor implements Treatable{

    private String name;
    private int codeOfSpeciality;


    public Doctor() {
    }

    public Doctor(String name, int codeOfSpeciality) {
        this.name = name;
        this.codeOfSpeciality = codeOfSpeciality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCodeOfSpeciality() {
        return codeOfSpeciality;
    }

    public void setCodeOfSpeciality(int codeOfSpeciality) {
        this.codeOfSpeciality = codeOfSpeciality;
    }

    @Override
    public String toString() {
        return "{name='" + name + '\'' +
                ", codeOfSpeciality=" + codeOfSpeciality +
                '}';
    }
}
