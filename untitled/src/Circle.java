public class Circle {
    private double radius;
    private String color;
    protected static final double PI = Math.PI;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString () {
        return "Circle[radius=" +radius+",color=" + color+ "]";
    }
    public double getArea() {
        return PI*Math.pow(radius, 2);
    }
}
