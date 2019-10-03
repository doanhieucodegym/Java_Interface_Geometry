package Circle;

public class Circle {
    private double radius;
    private String color;
    private boolean status ;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle(double radius, String color, boolean status) {
        this.radius = radius;
        this.color = color;
        this.status = status;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

}
