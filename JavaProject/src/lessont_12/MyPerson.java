package lessont_12;

public class MyPerson {
    public static void main(String[] args) {
        Person person = new Person("Sergey", "Kadirov", 28, true);
        person.whatIsYourName();

        Student student = new Student("Dmitry", "Kadirov", 28, true, 50);

        student.whatIsYourName();
    }
}
