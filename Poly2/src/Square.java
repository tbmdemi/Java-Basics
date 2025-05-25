import java.util.Objects;

public class Square extends Rectangle {
    /**
     * Constructor mặc định.
     */
    public Square() {
        super();
    }

    /**
     * Constructor với độ dài cạnh.
     * @param side Độ dài cạnh.
     */
    public Square(double side) {
        super(side, side);
    }

    /**
     * Constructor với độ dài cạnh, màu sắc và trạng thái tô đầy.
     * @param side Độ dài cạnh.
     * @param color Màu sắc.
     * @param filled Trạng thái tô đầy.
     */
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    /**
     * Constructor với góc trên trái, rộng, dài, màu và tô.
     * @param topLeft Góc trên bên trái.
     * @param side Độ dài cạnh.
     * @param color Màu sắc.
     * @param filled Trạng thái tô đầy.
     */
    public Square(Point topLeft, double side, String color, boolean filled) {
        super(topLeft, side, side, color, filled);
    }

    /**
     * Lấy độ dài cạnh.
     * @return Độ dài cạnh.
     */
    public double getSide() {
        return width;
    }

    /**
     * Đặt độ dài cạnh mới.
     * @param side Độ dài cạnh mới.
     */
    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    /**
     * Override phương thức setWidth của Rectangle.
     * @param side Giá trị mới cho cạnh.
     */
    @Override
    public void setWidth(double side) {
        setSide(side);
    }

    /**
     * Override phương thức setLength của Rectangle.
     * @param side Độ dài cạnh mới.
     */
    @Override
    public void setLength(double side) {
        setSide(side);
    }

    /**
     * Chuỗi hình vuông.
     * @return Chuỗi thông tin.
     */
    @Override
    public String toString() {
        return String.format("Square[topLeft=%s,side=%.1f,color=%s,filled=%b]",
                topLeft.toString(), getSide(), color, filled);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Square)) {
            return false;
        }
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}