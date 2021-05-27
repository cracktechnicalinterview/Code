package PopularInterviewQuestions;

import java.util.Arrays;

public class nQueen {

	static int SIZE = 4;

	public static void printBoard(char[][] chessBoard) {
		System.out.println();
		for (int r = 0; r < SIZE; r++) {
			for (int c = 0; c < SIZE; c++) {
				System.out.print(chessBoard[r][c] + " ");
			}
			System.out.println();
		}
	}

	public static boolean isSafe(char[][] chessBoard, int R, int C) {

		//column check
		for(int i=0;i<SIZE;i++)
			if(chessBoard[i][C]=='Q')
				return false;
		
		//row check
		for(int i=0;i<SIZE;i++)
			if(chessBoard[R][i] == 'Q')
				return false;
		
		//two dialogonal
		for(int i=R,j=C ; i>=0 && j>=0 ; i--, j--)
			if(chessBoard[i][j] == 'Q')
				return false;
		
		for(int i=R, j=C; i>=0 && j<SIZE ;i--,j++)
			if(chessBoard[i][j] =='Q')
				return false;
		
		return true;
	}

	public static void nQueenSolution(char[][] chessBoard, int R) {
		if (R == SIZE) {
			printBoard(chessBoard);
		} else {
			for (int c = 0; c < SIZE; c++) {
				if (isSafe(chessBoard, R, c)) {
					chessBoard[R][c] = 'Q';
					nQueenSolution(chessBoard, R + 1);
					chessBoard[R][c] = '-';
				}
			}
		}
	}

	public static void main(String[] args) {

		char[][] chessBoard = new char[SIZE][SIZE];
		for (int r = 0; r < SIZE; r++) {
			Arrays.fill(chessBoard[r], '-');
		}
		printBoard(chessBoard);
		nQueenSolution(chessBoard, 0);
	}

}
