import java.util.Objects;

public class Circle extends Shape {
    protected double radius; //ban kinh
    protected Point center;

    /**
     * Constructor mặc định.
     */
    public Circle() {
        super();
        this.radius = 1.0;
        this.center = new Point(0.0, 0.0);
    }

    /**
     * Constructor với tham số bán kính.
     * @param radius Bán kính của hình tròn.
     */
    public Circle(double radius) {
        super();
        this.radius = radius;
        this.center = new Point(0.0, 0.0);
    }

    /**
     * Constructor với tham số bán kính và trung tâm.
     * @param radius Bán kính của hình tròn.
     * @param center Trung tâm của hình tròn.
     */
    public Circle(double radius, Point center) {
        super();
        this.radius = radius;
        this.center = center;
    }

    /**
     * Constructor với tham số bán kính, màu sắc và trạng thái tô đầy.
     * @param radius Bán kính của hình tròn.
     * @param color Màu sắc của hình tròn.
     * @param filled Trạng thái tô đầy.
     */
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
        this.center = new Point(0.0, 0.0);
    }

    /**
     * Constructor đầy đủ.
     * @param center Tâm hình tròn.
     * @param radius Bán kính.
     * @param color Màu.
     * @param filled Tô hay chưa.
     */
    public Circle(Point center, double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
        this.center = center != null ? center : new Point(0.0, 0.0);
    }

    /**
     * Trả về tâm.
     * @return Tâm.
     */
    public Point getCenter() {
        return center;
    }

    /**
     * Thay đổi tâm.
     * @param center Tâm mới.
     */
    public void setCenter(Point center) {
        this.center = new Point(0.0, 0.0);
    }

    /**
     * Lấy bán kính của hình tròn.
     * @return Bán kính (double).
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Đặt bán kính mới cho hình tròn.
     * @param radius Bán kính mới.
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Tính diện tích hình tròn.
     * @return Diện tích (double).
     */
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    /**
     * Tính chu vi (đường kính) hình tròn.
     * @return Chu vi (double).
     */
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    /**
     * Chuoi hinh tron.
     * @return Chuỗi thông tin.
     */
    @Override
    public String toString() {
        return String.format("Circle[center=%s,radius=%.1f,color=%s,filled=%b]",
                center.toString(), radius, color, filled);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Circle circle = (Circle) obj;
        return Math.abs(circle.radius - radius) < 0.001
                && circle.center.equals(center);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Math.round(radius * 1000), center);
    }
}