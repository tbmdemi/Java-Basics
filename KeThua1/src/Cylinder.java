public class Cylinder extends Circle {
    private double height;

    /**
     * cyclinder.
     */
    public Cylinder() {
    }

    /**
     * cyclinder.
     */
    public Cylinder(double height) {
        this.height = height;
    }

    /**
     * Set height.
     * @param radius and height
     */
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    /**
     * Set height.
     * @param radius and height and color
     */
    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    /**
     * Get height.
     * @return height
     */
    public double getHeight() {
        return height;
    }

    /**
     * Set height.
     * @param height input
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * No param.
     * @return volume of cylinder
     */
    public double getVolume() {
        return height * getArea();
    }

    /**
     * Convert to string.
     * @return string
     */
    public String toString() {
        return "Cyclinder[" + super.toString() + ",height=" + height;
    }

    /**
     * No param.
     * @return area of cylinder.
     */
    public double getArea() {
        return (2 * super.getArea() * height);
    }
}
