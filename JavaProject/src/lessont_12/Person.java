package lessont_12;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private boolean isJewish;

    public Person(String firstName, String lastName, int age, boolean isJewish) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.isJewish = isJewish;
    }

    public Person() {
    }

    public Person(String lastName, int age) {
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isJewish() {
        return isJewish;
    }

    public void setJewish(boolean jewish) {
        isJewish = jewish;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", isJewish=" + isJewish +
                '}';
    }

    public void whatIsYourName () {
//        System.out.println("My name is " + firstName + " " + lastName + ".");
        System.out.println("It is too general question. I'm rust a person.");
    }
}
