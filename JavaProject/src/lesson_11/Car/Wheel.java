package lesson_11.Car;

public class Wheel {
    private int radius;
    private double pressure;

    public Wheel(int radius, double pressure) {
        this.radius = (radius <= 15) ? 16 : radius;
        this.pressure = pressure;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = (radius <= 15) ? 16 : radius;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "radius=" + radius +
                ", pressure=" + pressure +
                '}';
    }
}
