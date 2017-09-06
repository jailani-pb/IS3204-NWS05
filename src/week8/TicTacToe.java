package week8;

import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Initialise the tic tac toe board.
		char[][] board = {
				{' ', ' ', ' '},
				{' ', ' ', ' '},
				{' ', ' ', ' '}
		};
		// To notify if someone have won the game.
		boolean someoneWins = false;
		// To notify which player is playing.
		boolean player1Turn = true;
		// For player 1 symbol O and player 2 symbol X
		char playerSymbol;
		// To store user input
		String userInput = "";

		while(!someoneWins) {
			// Print the tic tac toe board.
			// Print the y coordinate header
			System.out.println("\\ y    0      1      2   ");
			System.out.println("x   =====================");
			// Print the board itself
			for(int x = 0; x < board.length; x++) {
				// Print the x coordinate header
				System.out.print(x + "   ");
				// Print the board
				for(int y = 0; y < board[x].length; y++) {
					System.out.print("|  " + board[x][y] + "  |");
				}
				System.out.println();
				System.out.println("    =====================");
			}

			// Ask for user input to add symbol to board.
			if(player1Turn) {
				playerSymbol = 'O';
				System.out.println("Player 1 (" + playerSymbol + ") turns,");
				System.out.println("Type in xy coordinate");
				userInput = scanner.nextLine();
			} else {
				playerSymbol = 'X';
				System.out.println("Player 2 (" + playerSymbol + ") turns,");
				System.out.println("Type in xy coordinate");
				userInput = scanner.nextLine();
			}

			// Validation of user input
			if(userInput.length() == 2) {
				// Convert user input String to char array.
				char[] userInputArray = userInput.toCharArray();
				// Convert char array value to numeric value
				// index 0 is for x coordinate, index 1 is for y coordinate
				int x = Character.getNumericValue(userInputArray[0]);
				int y = Character.getNumericValue(userInputArray[1]);
				// Check of x between index 0-2 and y between index 0-2
				if(x >= 0 && x <= 2 && y >= 0 && y <= 2) {
					// Check the coordinate is already used or not
					if(board[x][y] == ' ') {
						// Update the board
						board[x][y] = playerSymbol;
						// Check if player completed a row
						for(int i = 0; i < 3; i++) {
							if(board[i][0] == playerSymbol &&
									board[i][1] == playerSymbol &&
									board[i][2] == playerSymbol) {
								someoneWins = true;
							}
						}
						// Check if player completed a column
						for(int i = 0; i < 3; i++) {
							if(board[0][i] == playerSymbol &&
									board[1][i] == playerSymbol &&
									board[2][i] == playerSymbol) {
								someoneWins = true;
							}
						}
						// Check if player completed diagnol
						if(board[0][0] == playerSymbol &&
								board[1][1] == playerSymbol &&
								board[2][2] == playerSymbol) {
							someoneWins = true;
						}
						if(board[0][2] == playerSymbol &&
								board[1][1] == playerSymbol &&
								board[2][0] == playerSymbol) {
							someoneWins = true;
						}

						// Check if someone wins
						if(!someoneWins) {
							// Change player to other player
							player1Turn = !player1Turn;
						}
					} else {
						System.out.println("The coordinate is already used.");
					}

				} else {
					System.out.println("Invalid input");
				}

			} else {
				System.out.println("Invalid Input");
			}

		}

		// Print the tic tac toe board.
		// Print the y coordinate header
		System.out.println("\\ y    0      1      2   ");
		System.out.println("x   =====================");
		// Print the board itself
		for(int x = 0; x < board.length; x++) {
			// Print the x coordinate header
			System.out.print(x + "   ");
			// Print the board
			for(int y = 0; y < board[x].length; y++) {
				System.out.print("|  " + board[x][y] + "  |");
			}
			System.out.println();
			System.out.println("    =====================");
		}
		if(player1Turn) {
			System.out.println("Player 1 wins");
		} else {
			System.out.println("Player 2 wins");
		}

		scanner.close();
	}

}






