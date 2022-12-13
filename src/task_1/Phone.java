package task_1;

import java.util.Arrays;

public class Phone {

    private int number;
    private String model;
    private int weight;

    public Phone() {
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(int number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void receiveCall (String nameOfCalling){
        System.out.println("Звонит " + nameOfCalling);
    }

    public void receiveCall (String nameOfCalling, int number){
        System.out.println("Звонит " + nameOfCalling + " с номера " + number);
    }


    public void sendMessage (int...number){
        System.out.println("Отправляем сообщение номерам " + Arrays.toString(number));
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
}
