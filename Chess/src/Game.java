import java.time.Period;
import java.util.ArrayList;

public class Game {
    private Board board;
    private ArrayList<Move> moveHistory;

    /**
     * Constructor cho ban co.
     * @param board ban co moi.
     */
    public Game(Board board) {
        this.board = board;
        moveHistory = new ArrayList<>();
    }

    /**
     * Getter cho ban co.
     * @return ban co.
     */
    public Board getBoard() {
        return board;
    }

    /**
     * Setter cho ban co.
     * @param board ban co.
     */
    public void setBoard(Board board) {
        this.board = board;
    }

    /**
     * Getter cho moveHistory.
     * @return moveHistory.
     */
    public ArrayList<Move> getMoveHistory() {
        return moveHistory;
    }

    /**
     * Setter cho moveHistory.
     * @param moveHistory lich su.
     */
    public void setMoveHistory(ArrayList<Move> moveHistory) {
        this.moveHistory = moveHistory;
    }

    /**
     * Phuong thuc de di chuyen quan co.
     * @param piece quan co duoc di chuyen.
     * @param x toa do den.
     * @param y toa do den.
     */
    public void movePiece(Piece piece, int x, int y) {
        if (piece == null || !board.getPieces().contains(piece) || !piece.canMove(board, x, y)) {
            // Kiem tra [piece trong], [tren ban co khong co piece], [piece khong the di chuyen]
            return;
        }

        //Lay vi tri hien tai
        int startX = piece.getCoordinatesX();
        int startY = piece.getCoordinatesY();

        //Gia su co quan co o o (x,y)
        Piece killedPiece = board.getAt(x, y);

        // Neu co quan co, bi an
        if (killedPiece != null) {
            board.removeAt(x, y);
        }

        // Vi tri moi cua piece
        piece.setCoordinatesX(x);
        piece.setCoordinatesY(y);

        // Them vao lich su
        Move move = new Move(startX, startY, x, y, piece, killedPiece);
        moveHistory.add(move);
    }
}
