import java.util.Objects;

/**
 * Rectangle enxtends shape.
 * HCN.
 */
public class Rectangle extends Shape {
    protected double width;  //rong
    protected double length; //dai

    /**
     * Constructor mặc định.
     */
    public Rectangle() {
        super();
        this.width = 1.0;
        this.length = 1.0;
    }

    /**
     * Constructor với tham số chiều rộng và dài.
     * @param width Chiều rộng.
     * @param length dài.
     */
    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    /**
     * Constructor với đầy đủ tham số.
     * @param width Chiều rộng.
     * @param length dài.
     * @param color Màu sắc.
     * @param filled to chua
     */
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    /**
     * Lấy rộng.
     * @return rộng (double).
     */
    public double getWidth() {
        return width;
    }

    /**
     * Lấy dài.
     * @return dài (double).
     */
    public double getLength() {
        return length;
    }

    /**
     * Đặt rộng mới.
     * @param width rộng mới.
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Đặt dài mới.
     * @param length dài mới.
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Tính diện tích hình chữ nhật.
     * @return Diện tích (double).
     */
    @Override
    public double getArea() {
        return width * length;
    }

    /**
     * Tính chu vi hình chữ nhật.
     * @return Chu vi (double).
     */
    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    /**
     * Rectangle string.
     * @return Rectangle string?
     */
    @Override
    public String toString() {
        return "Rectangle[width=" + width +
                ",length=" + length +
                ",color=" + color +
                ",filled=" + filled + "]";
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
        Rectangle rectangle = (Rectangle) obj;
        if (Double.compare(rectangle.width, width) == 0) {
            return Double.compare(rectangle.length, length) == 0;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), width, length);
    }
}