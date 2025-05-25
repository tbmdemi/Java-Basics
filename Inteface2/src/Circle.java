public class Circle implements GeometricObject {
    public static final double PI = 3.14;

    private Point center;
    private double radius;

    /**
     * Constructor.
     * @param center tam hinh tron.
     * @param radius ban kinh.
     */
    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    /**
     * Lay tam.
     * @return tam
     */
    public Point getCenter() {
        return center;
    }

    /**
     * Chinh tam.
     * @param center tam moi
     */
    public void setCenter(Point center) {
        this.center = center;
    }

    /**
     * Lay ban kinh.
     * @return ban kinh
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Chinh ban kinh.
     * @param radius ban kinh moi.
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * radius;
    }

    @Override
    public String getInfo() {
        return String.format("Circle[(%.2f,%.2f),r=%.2f]",
                center.getPointX(),
                center.getPointY(),
                radius);
    }
}
