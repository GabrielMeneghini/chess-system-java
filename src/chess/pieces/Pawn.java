package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Pawn extends ChessPiece {

	// Constructors
	public Pawn(Board board, Color color) {
		super(board, color);
	}

	// Methods
	@Override
	public String toString() {
		return "P";
	}
	
	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		Position p = new Position(0,0);
		
		if(getColor() == Color.WHITE) {
			// Up -------------------------------------------------------
			p.setValues(position.getRow()-1, position.getColumn());
			if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}
			Position p2 = new Position(position.getRow()-1, position.getColumn());
			p.setValues(position.getRow()-2, position.getColumn());
			if(getBoard().positionExists(p2) && !getBoard().thereIsAPiece(p2) && getBoard().positionExists(p) && !getBoard().thereIsAPiece(p) && getMoveCount()==0) {
				mat[p.getRow()][p.getColumn()] = true;
			}
			
			// Up-left diagonal -----------------------------------------
			p.setValues(position.getRow()-1, position.getColumn()-1);
			if(getBoard().positionExists(p) && isThereOpponentPiece(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}
			
			// Up-right diagonal ----------------------------------------
			p.setValues(position.getRow()-1, position.getColumn()+1);
			if(getBoard().positionExists(p) && isThereOpponentPiece(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}
		} else {
			// Down -------------------------------------------------------
			p.setValues(position.getRow()+1, position.getColumn());
			if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}
			Position p2 = new Position(position.getRow()+1, position.getColumn());
			p.setValues(position.getRow()+2, position.getColumn());
			if(getBoard().positionExists(p2) && !getBoard().thereIsAPiece(p2) && getBoard().positionExists(p) && !getBoard().thereIsAPiece(p) && getMoveCount()==0) {
				mat[p.getRow()][p.getColumn()] = true;
			}
			
			// Down-left diagonal ---------------------------------------
			p.setValues(position.getRow()+1, position.getColumn()-1);
			if(getBoard().positionExists(p) && isThereOpponentPiece(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}
			
			// Down-right diagonal --------------------------------------
			p.setValues(position.getRow()+1, position.getColumn()+1);
			if(getBoard().positionExists(p) && isThereOpponentPiece(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}
		}	
		return mat;
	}

}
