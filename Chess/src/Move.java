public class Move {
    private int startX;
    private int startY;
    private int endX;
    private int endY;
    private Piece movedPiece;
    private Piece killedPiece;

    /**
     * Neu quan co khong an quan khac.
     * @param startX toa do x bat dau.
     * @param startY toa do y bat dau.
     * @param endX toa do x ket thuc.
     * @param endY toa do y ket thuc.
     * @param movedPiece quan co da di chuyen.
     */
    public Move(int startX, int startY, int endX, int endY, Piece movedPiece) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
        this.movedPiece = movedPiece;
    }

    /**
     * Neu quan co an quan khac.
     * @param startX toa do x bat dau.
     * @param startY toa do y bat dau.
     * @param endX toa do x ket thuc.
     * @param endY toa do y ket thuc.
     * @param movedPiece quan co da di.
     * @param killedPiece quan co bi an.
     */
    public Move(int startX, int startY, int endX, int endY, Piece movedPiece, Piece killedPiece) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
        this.movedPiece = movedPiece;
        this.killedPiece = killedPiece;
    }

    /**
     * Dua ra thong tin cua quan co.
     * @return trang thai cua quan co.
     */
    public String toString() {
        String color = movedPiece.getColor();
        String symbol = movedPiece.getSymbol();

        return String.format("%s-%s%s%s",
                color,
                symbol,
                getAlgebraicNotation(endX),
                endY
        );
    }

    /**
     * Quy doi toa do x thanh chu.
     * @param x toa do x.
     * @return toa do chu tuong ung.
     */
    private String getAlgebraicNotation(int x) {
        if (x >= 1 && x <= 8) {
            char c = (char) ('a' + (x - 1));
            return String.valueOf(c);
        } else {
            return "";
        }
    }

    /**
     * Quan co bi an.
     * @return quan co bi an.
     */
    public Piece getKilledPiece() {
        return killedPiece;
    }

    /**
     * Chinh quan co bi an.
     * @param killedPiece quan co bi an.
     */
    public void setKilledPiece(Piece killedPiece) {
        this.killedPiece = killedPiece;
    }

    /**
     * Quan co di chuyen.
     * @return quan co di chuyen
     */
    public Piece getMovedPiece() {
        return movedPiece;
    }

    /**
     * Thay doi quan co di chuyen.
     * @param movedPiece quan co di chuyen.
     */
    public void setMovedPiece(Piece movedPiece) {
        this.movedPiece = movedPiece;
    }

    /**
     * Toa do Y den.
     * @return toa do y.
     */
    public int getEndY() {
        return endY;
    }

    /**
     * Chinh toa do Y den.
     * @param endY tao do Y den.
     */
    public void setEndY(int endY) {
        this.endY = endY;
    }

    /**
     * Chinh toa do X den.
     */
    public int getEndX() {
        return endX;
    }

    /**
     * Chinh toa do X den.
     * @param endX tao do X den.
     */
    public void setEndX(int endX) {
        this.endX = endX;
    }

    /**
     * Chinh toa do Y di.
     */
    public int getStartY() {
        return startY;
    }

    /**
     * Chinh toa do Y di.
     * @param startY tao do Y di.
     */
    public void setStartY(int startY) {
        this.startY = startY;
    }

    /**
     * Chinh toa do Y den.
     */
    public int getStartX() {
        return startX;
    }

    /**
     * Chinh toa do X di.
     * @param startX tao do X di.
     */
    public void setStartX(int startX) {
        this.startX = startX;
    }


}
