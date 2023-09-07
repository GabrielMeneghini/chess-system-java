package chess;

import boardgame.Board;

public class ChessMatch {

	// Attributes
	private Board board;

	// Constructors
	public ChessMatch() {
		board = new Board(8, 8);
	}

	// Methods
	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for(int i=0; i<board.getRows(); i++) {
			for(int j=0; j<board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}
}
