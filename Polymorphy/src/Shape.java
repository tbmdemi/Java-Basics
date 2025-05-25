import java.util.Objects;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    /**
     * Constructor mặc định.
     */
    public Shape() {
        this.color = "red";
        this.filled = true;
    }

    /**
     * Constructor.
     * @param color Màu sắc của hình.
     * @param filled Trạng thái tô đầy.
     */
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    /**
     * Lấy màu sắc của hình.
     * @return Màu sắc (String).
     */
    public String getColor() {
        return color;
    }

    /**
     * Kiểm tra xem hình có được tô đầy hay không.
     * @return true nếu được tô đầy, false nếu không.
     */
    public boolean isFilled() {
        return filled;
    }

    /**
     * Đặt màu sắc mới cho hình.
     * @param color Màu sắc mới.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Đặt trạng thái tô đầy mới cho hình.
     * @param filled Trạng thái tô đầy mới.
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /**
     * Phương thức trừu tượng để tính diện tích.
     * @return Diện tích của hình (double).
     */
    public abstract double getArea();

    /**
     * Phương thức trừu tượng để tính chu vi.
     * @return Chu vi của hình (double).
     */
    public abstract double getPerimeter();

    /**
     * Trả về biểu diễn chuỗi của đối tượng Shape.
     * @return Chuỗi mô tả đối tượng Shape.
     */
    @Override
    public String toString() {
        return "Shape[color=" + color + ", filled=" + filled + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Shape shape = (Shape) obj;
        return filled == shape.filled && Objects.equals(color, shape.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, filled);
    }
}