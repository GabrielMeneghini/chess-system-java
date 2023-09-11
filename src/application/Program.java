package application;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());
		
		int abc1 = (char) 'a';
		int abc2 = (char) 'b';
		int abc3 = (char) 'c';
		int abc4 = (char) 'd';
		int abc5 = (char) 'e';
		int abc6 = (char) 'f';
		int abc7 = (char) 'g';
		int abc8 = (char) 'h';
		System.out.println();
		
		System.out.println(abc1);
		System.out.println(abc2);
		System.out.println(abc3);
		System.out.println(abc4);
		System.out.println(abc5);
		System.out.println(abc6);
		System.out.println(abc7);
		System.out.println(abc8);
		System.out.println();
		
		char cba = (int) 101;
		System.out.println(cba);
	}
}
