import java.util.Random;

/**
 * TicTacToe
 * UC7 generates random slot values until a valid move is found,
 * then places the computer symbol on the board.
 */
public class TicTacToe {

    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };

    static char computerSymbol = 'O';

    /**
     * Entry point of the program. Triggers the computer move.
     */
    public static void main(String[] args) {
        computerMove();
    }

    /**
     * Generates random slot values until a valid move is found,
     * then places the computer symbol on the board.
     */
    static void computerMove() {
        Random random = new Random();
        int slot, row, col;

        // Keep generating a random slot until a valid one is found
        do {
            slot = random.nextInt(9) + 1;   // generates 1 to 9
            row  = getRowFromSlot(slot);
            col  = getColFromSlot(slot);
        } while (!isValidMove(row, col));

        // Place the computer's symbol on the validated cell
        board[row][col] = computerSymbol;

        System.out.println("Computer chose slot: " + slot);
        System.out.println("Placed at -> Row: " + row + ", Col: " + col);
    }

    /**
     * Converts slot number into row index using zero-based indexing.
     * Input  : Slot number (1-9)
     * Output : Row index (0-2)
     */
    static int getRowFromSlot(int slot) {
        return (slot - 1) / 3;
    }

    /**
     * Converts slot number into column index using modulo operation.
     * Input  : Slot number (1-9)
     * Output : Column index (0-2)
     */
    static int getColFromSlot(int slot) {
        return (slot - 1) % 3;
    }

    /**
     * Updates the board by placing the given symbol at
     * the specified row and column.
     * Input  : Row, Column, Symbol
     * Hint   : Assume the move is already validated.
     */
    static void placeMove(int row, int col, char symbol) {
        board[row][col] = symbol;
    }
}
