package english2;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {

		/*
		 * The size of the panel will be 3x3. There are two players who will play by
		 * turns. The first player to get 3 of his/her marks in a row (up, down, across,
		 * or diagonally) is the winner. When all 9 squares are full, the game is over.
		 * If no player has 3 marks in a row, the game ends in a tie. You have to print
		 * the board on the console.
		 */

		Scanner reader = new Scanner(System.in);

		int contador = 1;

		int posFila = 0;

		int posColumna = 0;

		String playerTurn;

		String card;

		String[][] boardEmpty = new String[3][3];

		// fill the board
		for (int i = 0; i < boardEmpty.length; i++) {
			for (int j = 0; j < boardEmpty[i].length; j++) {
				boardEmpty[i][j] = "-";
			}
		}

		System.out.println();

		while (contador <= 9) {

			if (contador % 2 == 0) {
				playerTurn = "Player 2";
				card = "X";
			} else {
				playerTurn = "Player 1";
				card = "O";
			}

			do {

				System.out.println(playerTurn + " Turn");

				System.out.println("Introduce row position: ");
				posFila = reader.nextInt();

				System.out.println("Introduce column position: ");
				posColumna = reader.nextInt();

				if (boardEmpty[posFila][posColumna] != "-") {
					System.out.println("That position is already used");

				} else {
					boardEmpty[posFila][posColumna] = card;

					contador++;
			
					// show the board
					for (int i = 0; i < boardEmpty.length; i++) {
						
						for (int j = 0; j < boardEmpty[i].length; j++) {
							System.out.print(boardEmpty[i][j] + "\t");
						
						}
						
						System.out.println();
						
					}

				}

				System.out.println();

			} while (boardEmpty[posFila][posColumna] == "-");

			System.out.println();

		}

		reader.close();

	}

	static boolean repeat(String t[][]) {

		boolean winner = false;
		

		return winner;
	}

	static boolean check(String t[][]) {

		boolean winner = false;

		return winner;
	}

}
