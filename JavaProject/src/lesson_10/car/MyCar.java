package lesson_10.car;

public class MyCar {
    public static void main(String[] args) {
        Car bmv = new Car();
        bmv.isElectrical = false;
        bmv.color = "Black";
        System.out.println("bmv.color = " + bmv.color);
        System.out.println("bmv.isElectrical = " + bmv.isElectrical);

//        Create a first car
        bmv.color = "White";
        bmv.year = 2023;
        bmv.isElectrical = true;
        bmv.model = "model 7";
        bmv.manufacturer = "BMV";

//        Create a second car
        Car tesla = new Car();
        tesla.color = "White";
        tesla.year = 2022;

        Car car = new Car("Red", 2020, "Tesla", "S7", true);

        car.printCarInfo();
        System.out.println("car.tiString() = " + car);
    }
}
