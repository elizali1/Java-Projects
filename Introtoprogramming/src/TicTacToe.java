import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        String[][] board = {
                {" ", " ", " "},
                {" ", " ", " "},
                {" ", " ", " "}
        };
        String currentPlayer = "X";

        do {
            // Print the board
            printBoard(board);

            // Place your symbol
            takeTurn(currentPlayer, board);

            // Switch players
            currentPlayer = switchPlayer(currentPlayer);

        } while(!(hasXWon(board) || hasOWon(board) || isDraw(board)));

        // Implement me: display result!
    }

    public static void printBoard(String[][] board) {
        for (int y = 0; y <= 2; y++) {
            for (int x = 0; x <= 2; x++) {
                System.out.print(board[x][y]+" | ");
            }
            System.out.println();
        }
    }


    // Players - turn structure?
    public static void takeTurn(String symbol, String[][] board) {
        // Implement me: loop until correct inputs given!
        System.out.println("It is "+symbol+"'s turn.");
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your x coordinate: ");
        int x = reader.nextInt();
        System.out.println("Enter your y coordinate: ");
        int y = reader.nextInt();
        if (canPlace(x, y, board)) {
            placeSymbol(x, y, symbol, board);
        }
    }

    // Putting Xs and Os in the board
    public static void placeSymbol(int x, int y, String symbol, String[][] board) {
        board[x][y] = symbol;
    }

    // Implement me!
    public static boolean canPlace(int x, int y, String[][] board) {
        return true;
    }

    // Changing turns between players
    public static String switchPlayer(String symbol) {
        if ("X".equals(symbol)) {
            return "O";
        } else {
            return "X";
        }
    }

    // Checking if there's a winner or a draw happens
    // Implement me!
    public static boolean hasXWon(String[][] board) {
        return false;
    }

    // Implement me!
    public static boolean hasOWon(String[][] board) {
        return false;
    }

    // Implement me!
    public static boolean isDraw(String[][] board) {
        return false;
    }

}

