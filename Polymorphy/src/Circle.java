import java.util.Objects;

/**
 * Lớp Circle kế thừa từ Shape.
 * Đại diện cho một hình tròn.
 */
public class Circle extends Shape {
    protected double radius; //ban kinh

    /**
     * Constructor mặc định.
     */
    public Circle() {
        super();
        this.radius = 1.0;
    }

    /**
     * Constructor với tham số bán kính.
     * @param radius Bán kính của hình tròn.
     */
    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    /**
     * Constructor với đầy đủ tham số.
     * @param radius Bán kính của hình tròn.
     * @param color Màu sắc của hình tròn.
     * @param filled Trạng thái tô đầy.
     */
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
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
     * circle string ? .
     * @return Chuoi
     */
    @Override
    public String toString() {
        return "Circle[radius=" + radius + ",color=" + color + ",filled=" + filled + "]";
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (!super.equals(obj)) {
            return false;
        }
        Circle circle = (Circle) obj;
        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), radius);
    }
}