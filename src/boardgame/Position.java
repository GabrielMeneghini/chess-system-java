package boardgame;

public class Position {

	// Attributes
	private int row;
	private int column;
	
	// Constructors
	public Position(int row, int column) {
		this.row = row;
		this.column = column;
	}

	// Getters and Setters
	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}
	
	public void setValues(int row, int column) {
		this.row = row;
		this.column = column;
	}
	
	// Methods 
	@Override
	public String toString() {
		return row + ", " + column;
	}
	
}
