package task_1;

public class Test {
    public static void main(String[] args) {
        Phone phone1 = new Phone(123, "Siemens", 350);
        Phone phone2 = new Phone(456, "Nokia", 400);
        Phone phone3 = new Phone(789, "Apple", 500);
        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);
        phone1.receiveCall("Alex");
        phone1.receiveCall("Alex", 321);
        phone2.sendMessage(654, 987, 135, 246, 951);

    }
}
