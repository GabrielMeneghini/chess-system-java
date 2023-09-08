package boardgame;

public class Piece {
		
	// Attributes
	protected Position position;
	
	// Associations
	private Board board;
	
	// Constructors
	public Piece(Board board) {
		this.board = board;
	}

	// Getters and Setters
	protected Board getBoard() {
		return board;
	}

}
