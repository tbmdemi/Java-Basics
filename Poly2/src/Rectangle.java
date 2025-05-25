import java.util.Objects;

/**
 * Rectangle extends Shape.
 * HCN.
 */
public class Rectangle extends Shape {
    protected double width;  //rộng
    protected double length; //dài
    protected Point topLeft;

    /**
     * Constructor mặc định.
     */
    public Rectangle() {
        super();
        this.width = 1.0;
        this.length = 1.0;
        this.topLeft = new Point(0.0, 0.0);
    }

    /**
     * Constructor với tham số chiều rộng và dài.
     * @param width Chiều rộng.
     * @param length Dài.
     */
    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
        this.topLeft = new Point(0.0, 0.0);
    }

    /**
     * Constructor với chiều rộng, màu sắc và trạng thái tô đầy.
     * @param width  Chiều rộng.
     * @param length chieu dai
     * @param color  Màu sắc.
     * @param filled Tô đầy.
     */
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
        this.topLeft = new Point(0.0, 0.0);
    }

    /**
     * Constructor với đầy đủ tham số.
     * @param width Chiều rộng.
     * @param length Dài.
     * @param color Màu sắc.
     * @param filled Tô đầy.
     * @param topLeft Góc trên bên trái.
     */
    public Rectangle(Point topLeft, double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
        this.topLeft = topLeft != null ? topLeft : new Point(0.0, 0.0);
    }

    /**
     * Lấy rộng.
     * @return Rộng (double).
     */
    public double getWidth() {
        return width;
    }

    /**
     * Lấy dài.
     * @return Dài (double).
     */
    public double getLength() {
        return length;
    }

    /**
     * Đặt rộng mới.
     * @param width Rộng mới.
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Đặt dài mới.
     * @param length Dài mới.
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Lấy góc trên bên trái.
     * @return Góc trên bên trái (Point).
     */
    public Point getTopLeft() {
        return topLeft;
    }

    /**
     * Chỉnh góc trên bên trái.
     * @param topLeft Góc trên mới.
     */
    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft != null ? topLeft : new Point(0.0, 0.0);
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
     * Chuỗi biểu diễn hình chữ nhật.
     * @return Chuỗi thông tin.
     */
    @Override
    public String toString() {
        return String.format("Rectangle[topLeft=%s,width=%.1f,length=%.1f,color=%s,filled=%b]",
                topLeft.toString(), width, length, color, filled);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Rectangle rectangle = (Rectangle) obj;
        return Math.abs(rectangle.width - width) < 0.001
                && Math.abs(rectangle.length - length) < 0.001
                && topLeft.equals(rectangle.topLeft);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Math.round(width * 1000), Math.round(length * 1000), topLeft);
    }
}