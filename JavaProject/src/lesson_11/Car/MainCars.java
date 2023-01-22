package lesson_11.Car;

public class MainCars {
    public static void main(String[] args) {
        Engine engine = new Engine(250, "V6", false);
        Wheel [] wheels = new Wheel[5];
        for (int i = 0; i < wheels.length; i++) {
            wheels[i] = new Wheel(14, 2.5);
            
        }
        Car car = new Car("BMW", "model 3", 2022, engine, wheels);

        car.wheels[2].setRadius(-15);
//        car.wheels[1].radius = -5;

        System.out.println("car = " + car);
    }
}
