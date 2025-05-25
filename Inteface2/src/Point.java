public class Point {
    private double pointX;
    private double pointY;

    /**
     * Constructor.
     * @param pointX toa do x.
     * @param pointY toa do y.
     */
    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    /**
     * Tra ve toa do x.
     * @return toa do x.
     */
    public double getPointX() {
        return pointX;
    }

    /**
     * Chinh toa do x.
     * @param pointX toa do x moi.
     */
    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    /**
     * Tra ve toa do y.
     * @return toa do y
     */
    public double getPointY() {
        return pointY;
    }

    /**
     * Chinh toa do y.
     * @param pointY toa do y moi
     */
    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    /**
     * Tra ve khoang cach 2 diem.
     * @param other diem khac.
     * @return khoang cach.
     */
    public double distance(Point other) {
        return Math.sqrt(Math.pow(this.pointX - other.pointX, 2)
                + Math.pow(this.pointY - other.pointY, 2));
    }
}
