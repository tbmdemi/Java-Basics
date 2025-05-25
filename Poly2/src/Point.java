import java.util.Objects;

public class Point {
    private double pointX;
    private double pointY;

    /**
     * Constructor co tham so.
     * @param pointX toa do x.
     * @param pointY toa do y.
     */
    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    /**
     * Tra ve toa do x.
     * @return toa do x
     */
    public double getPointX() {
        return pointX;
    }

    /**
     * Tra ve toa do y.
     * @return toa do y.
     */
    public double getPointY() {
        return pointY;
    }

    /**
     * Thay doi toa do x.
     * @param pointX toa do x moi.
     */
    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    /**
     * Thay doi toa do y.
     * @param pointY toa do y moi.
     */
    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    /**
     * Tinh khoang cach.
     * @param newPoint diem con lai.
     * @return khoang cach hai diem
     */
    public double distance(Point newPoint) {
        return Math.sqrt(Math.pow(newPoint.getPointX() - this.pointX, 2)
                + Math.pow(newPoint.getPointY() - this.pointY, 2));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Point point = (Point) o;
        return Math.abs(point.pointX - pointX) < 0.001
                && Math.abs(point.pointY - pointY) < 0.001;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Math.round(pointX * 1000), Math.round(pointY * 1000));
    }

    @Override
    public String toString() {
        return String.format("(%.1f,%.1f)", pointX, pointY);
    }
}