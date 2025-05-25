public abstract class Piece {
    private int coordinatesX;
    private int coordinatesY;
    private String color;

    /**
     * Khoi tao khong mau.
     * @param coordinatesX toa do x
     * @param coordinatesY toa do y
     */
    public Piece(int coordinatesX, int coordinatesY) {
        if (coordinatesX < 1 || coordinatesX > 8 || coordinatesY < 1 || coordinatesY > 8) {
            System.out.println("Loi o toa do");
            return;
        }
        this.coordinatesX = coordinatesX;
        this.coordinatesY = coordinatesY;
        this.color = "white";
    }

    /**
     * Khoi toa co mau.
     *
     * @param coordinatesX toa do x.
     * @param coordinatesY toa do y.
     * @param color       mau.
     */
    public Piece(int coordinatesX, int coordinatesY, String color) {
        if (coordinatesX < 1 || coordinatesX > 8 || coordinatesY < 1 || coordinatesY > 8) {
            System.out.println("Loi o toa do");
            return;
        }
        this.coordinatesX = coordinatesX;
        this.coordinatesY = coordinatesY;
        this.color = color;
    }

    /**
     * Tra ve ki hieu quan.
     * @return ki hieu quan.
     */
    public abstract String getSymbol();

    /**
     * Kiem tra xem co the di chuyen khong.
     * @param board ban co.
     * @param x toa do x.
     * @param y toa do y.
     * @return co hay khong.
     */
    public abstract boolean canMove(Board board, int x, int y);

    /**
     * Getter for X.
     * @return x.
     */
    public int getCoordinatesX() {
        return coordinatesX;
    }

    /**
     * Setter for X.
     * @param coordinatesX is new x.
     */
    public void setCoordinatesX(int coordinatesX) {
        this.coordinatesX = coordinatesX;
    }

    /**
     * Getter for Y.
     * @return y.
     */
    public int getCoordinatesY() {
        return coordinatesY;
    }

    /**
     * Setter for Y.
     *
     * @param coordinatesY is new Y.
     */
    public void setCoordinatesY(int coordinatesY) {
        this.coordinatesY = coordinatesY;
    }

    /**
     * Getter for color.
     * @return color.
     */
    public String getColor() {
        return color;
    }

    /**
     * Setter for color.
     * @param color new color.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Kiem tra vi tri.
     * @param piece quan co.
     * @return dung sai
     */
    public boolean checkPosition(Piece piece){
       return (1 <= piece.getCoordinatesX() && piece.getCoordinatesX() <= 8
               && 1 <= piece.getCoordinatesY() && piece.getCoordinatesY() <= 8);
    }
}
