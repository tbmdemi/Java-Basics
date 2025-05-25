import java.util.ArrayList;

public class Board {
    public static final int WIDTH = 8;
    public static final int HEIGHT = 8;
    private ArrayList<Piece> pieces;

    /**
     * Constructor for board.
     */
    public Board() {
        pieces = new ArrayList<>();
    }

    /**
     * Them quan co vao ban co.
     *
     * @param piece quan co.
     */
    public void addPiece(Piece piece) {
        if (!validate(piece.getCoordinatesX(), piece.getCoordinatesY())) {
            System.out.println("Toa do khong phu hop");
        } else if (getAt(piece.getCoordinatesX(), piece.getCoordinatesY()) != null) {
            System.out.println("Toa do da co quan co");
        } else {
            pieces.add(piece);
        }
    }

    /**
     * Kiem tra vi tri quan co co hop le khong.
     *
     * @param x toa do x.
     * @param y toa do y.
     * @return co hay khong.
     */
    public boolean validate(int x, int y) {
        return (1 <= x && x <= WIDTH && 1 <= y && y <= HEIGHT);
    }

    /**
     * Thuc hien chuc nang xoa quan co.
     *
     * @param x toa do x.
     * @param y toa do y.
     */
    public void removeAt(int x, int y) {
        if (getAt(x, y) != null) {
            pieces.remove(getAt(x, y));
        }
    }

    /**
     * Tra ve quan o vi toa do.
     * @param x toa do x.
     * @param y toa do y.
     * @return quan co o x, y.
     */
    public Piece getAt(int x, int y) {
        for (Piece piece : pieces) {
            if (piece.getCoordinatesX() == x && piece.getCoordinatesY() == y) {
                return piece;
            }
        }
        return null;
    }

    /**
     * @return tra ve danh sach.
     */
    public ArrayList<Piece> getPieces() {
        return pieces;
    }

    /**
     * Sua lai danh sach.
     * @param pieces quan co
     */
    public void setPieces(ArrayList<Piece> pieces) {
        this.pieces = pieces;
    }
}
