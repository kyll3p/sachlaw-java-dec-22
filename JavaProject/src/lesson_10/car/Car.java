package lesson_10.car;

public class Car {
    String color;
    int year;
    String manufacturer;
    String model;
    boolean isElectrical;

    int created = 0;
    static int wasCreated = 0;

    public Car() {
        created++;
        System.out.println("created = " + created);
    }

    public Car(String color) {
        this.color = color;
        created++;
        wasCreated++;
        System.out.println("created = " + created);
    }

    public Car(String manufacturer, int year) {
        this.manufacturer = manufacturer;
        this.year = year;
        created++;
        wasCreated++;
        System.out.println("created = " + created);
    }

    public Car(String color, int year, String manufacturer, String model, boolean isElectrical) {
        this.color = color;
        this.year = year;
        this.manufacturer = manufacturer;
        this.model = model;
        this.isElectrical = isElectrical;
        created++;
        wasCreated++;
        System.out.println("created = " + created);
    }

    public void printCarInfo() {
        System.out.println(this); //this.toString();
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", year=" + year +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", isElectrical=" + isElectrical +
                '}';
    }
}
