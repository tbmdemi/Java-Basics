public class Circle {
    protected static final double PI = Math.PI;
    private double radius;
    private String color;

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

    /**
     * Circle.
     */
    public Circle() {
    }

    /**
     * Constructor.
     * @param radius ban kinh.
     */
    public Circle(double radius) {
        radius = this.radius;
    }

    /**
     * Circle.
     */
    public Circle(double radius, String color) {
        radius = this.radius;
        color = this.color;
    }

    /**
     * Get area.
     * @return area of circle
     */
    public double getArea() {
        return (PI * radius * radius);
    }

    /**
     *Convert to string.
     * @return string.
     */
    public String toString() {
        return "[Circle[radius=" + radius + ",color=" + color + "]";
    }
}
