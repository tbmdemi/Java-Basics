public class Rook extends Piece {
    /**
     * Constructor.
     * @param x toa do x
     * @param y toa do y
     */
    public Rook(int x, int y) {
        super(x, y);
    }

    /**
     * Constructor.
     * @param x toa do x.
     * @param y toa do y.
     * @param color mau.
     */
    public Rook(int x, int y, String color) {
        super(x, y, color);
    }

    /**
     * Tra ve ki hieu cua quan XE.
     * @return R.
     */
    @Override
    public String getSymbol() {
        return "R";
    }

    /**
     * Kiem tra xem co the di den (x,y) khong.
     * @param board ban co.
     * @param x toa do x.
     * @param y toa do y.
     * @return dung hay sai.
     */
    @Override
    public boolean canMove(Board board, int x, int y) {
        if (x < 1 || x > 8 || y < 1 || y > 8) {
            //Kiem tra toa do
            return false;
        }
        if (x == this.getCoordinatesX() && y == this.getCoordinatesY()) {
            // Neu quan xe o yen
            return false;
        } else if (x != this.getCoordinatesX() && y != this.getCoordinatesY()){
            // Neu di cheo
            return false;
        }  else if (x == this.getCoordinatesX() && y != this.getCoordinatesY()){
            // Doc theo truc x
            int startY = Math.min(this.getCoordinatesY(), y);
            int endY = Math.max(this.getCoordinatesY(), y);

            for (int i = startY + 1; i < endY; i++) {
                if (board.getAt(x, i) != null) {
                    // Kiem tra tren duong co quan nao khong
                    return false;
                }
            }
        } else if (x != this.getCoordinatesX() && y == this.getCoordinatesY()) {

            // Doc theo truc y
            int startX = Math.min(this.getCoordinatesX(), x);
            int endX = Math.max(this.getCoordinatesX(), x);

            for (int i = startX + 1; i < endX; i++) {
                if (board.getAt(i, y) != null) {
                    // Kiem tra tren duong co quan nao khong
                    return false;
                }
            }
        }

        Piece destPiece = board.getAt(x, y);
        //Kiem tra mau cua quan co o o dich
        return destPiece == null || !destPiece.getColor().equals(this.getColor());
    }
}