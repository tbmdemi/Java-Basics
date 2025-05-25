public class Triangle implements GeometricObject {
    private Point p1;
    private Point p2;
    private Point p3;

    /**
     * Constructor.
     * @param p1 diem 1.
     * @param p2 diem 2.
     * @param p3 diem 3.
     */
    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    @Override
    public double getArea() {
        double a = p1.distance(p2);
        double b = p2.distance(p3);
        double c = p3.distance(p1);
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double getPerimeter() {
        double a = p1.distance(p2);
        double b = p2.distance(p3);
        double c = p3.distance(p1);
        return a + b + c;
    }

    @Override
    public String getInfo() {
        return String.format("Triangle[(%.2f,%.2f),(%.2f,%.2f),(%.2f,%.2f)]",
                p1.getPointX(), p1.getPointY(),
                p2.getPointX(), p2.getPointY(),
                p3.getPointX(), p3.getPointY());
    }

    /**
     * Tra ve diem 1.
     * @return diem 1.
     */
    public Point getP1() {
        return p1;
    }

    /**
     * Tra ve diem 2.
     * @return diem 2.
     */
    public Point getP2() {
        return p2;
    }

    /**
     * Tra ve diem 3.
     * @return diem 3.
     */
    public Point getP3() {
        return p3;
    }
}
