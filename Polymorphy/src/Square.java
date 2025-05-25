import java.util.Objects;

/**
 * Square extends Rectangle.
 */
public class Square extends Rectangle {
    /**
     * Constructor .
     */
    public Square() {
        super();
    }

    /**
     * Constructor.
     * @param side canh hinh vuong
     */
    public Square(double side) {
        super(side, side);
    }

    /**
     * Constructor.
     * @param side canh
     * @param color mau
     * @param isFilled to hay chua
     */
    public Square(double side, String color, boolean isFilled) {
        super(side, side, color, isFilled);
    }

    /**
     * Canh hinh vuong.
     * @return Canh hinh vuong
     */
    public double getSide() {
        return width;
    }

    /**
     * Chinh do dai canh.
     * @param side cannh moi
     */
    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    /**
     * Override phương thức setWidth của Rectangle.
     * @param side Giá trị mới cho cạnh (được truyền vào như width).
     */
    @Override
    public void setWidth(double side) {
        setSide(side);
    }

    /**
     * Override phương thức setLength của Rectangle.
     * @param side canh moi
     */
    @Override
    public void setLength(double side) {
        setSide(side);
    }

    /**
     * Square string ?.
     * @return Square string
     */
    @Override
    public String toString() {
        return "Square[side=" + getSide() + ",color=" + color + ",filled=" + filled + "]";
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Square)) {
            return false;
        }
        if (!super.equals(obj)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}