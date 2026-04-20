import java.util.Random;

public class TicTacToe {

    static boolean isHumanTurn;
    static char    humanSymbol;
    static char    computerSymbol;

    /**
     * Entry point of the program. Executes the toss logic and displays
     * the result of turn and symbol assignment.
     */
    public static void main(String[] args) {
        tossAndAssignSymbols();
        displayTossResult();
    }

    /**
     * Uses random logic to decide the first player and assigns symbols
     * based on the toss outcome. This method initializes the game state.
     */
    static void tossAndAssignSymbols() {
        Random random = new Random();
        int toss = random.nextInt(2); // 0 = human first, 1 = computer first

        if (toss == 0) {
            isHumanTurn    = true;
            humanSymbol    = 'X';
            computerSymbol = 'O';
        } else {
            isHumanTurn    = false;
            humanSymbol    = 'O';
            computerSymbol = 'X';
        }
    }

    /**
     * Displays the toss result, indicating who plays first and which
     * symbol is assigned to each player.
     */
    static void displayTossResult() {
        if (isHumanTurn) {
            System.out.println("You won the toss! You go first.");
        } else {
            System.out.println("Computer won the toss! Computer goes first.");
        }
        System.out.println("Your symbol    : " + humanSymbol);
        System.out.println("Computer symbol: " + computerSymbol);
public class TicTacToe {

import java.util.Scanner;

/**
 * TicTacToe
 * UC3 reads a slot number (1-9) entered by the user. This use case
 * focuses only on input handling without validation.
 */
public class TicTacToe {

    /**
     * Entry point of the program. Reads slot input and prints it back
     * to verify correct user input handling.
     */
    public static void main(String[] args) {
        int slot = getUserSlot();
        System.out.println("Slot entered: " + slot);
    }

    /**
     * Reads an integer slot value from the user.
     * Input  : Scanner object
     * Output : Slot number (1-9)
     * Hint   : Validation will be added in later use cases.
     */
    static int getUserSlot() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your slot (1-9): ");
        int slot = scanner.nextInt();
        return slot;
/**
 * TicTacToe
 * UC4 converts a user-entered slot number (1-9) into corresponding
 * row and column indices of a 2D array.
 */
public class TicTacToe {

    /**
     * Entry point of the program. Demonstrates slot-to-index conversion
     * using a sample slot value.
     */
    public static void main(String[] args) {
        int slot = 7;
        System.out.println("Row: "    + getRowFromSlot(slot));
        System.out.println("Column: " + getColFromSlot(slot));
    }

    /**
     * Converts slot number into row index using zero-based indexing.
     * Input  : Slot number (1-9)
     * Output : Row index (0-2)
     * Formula: row = (slot - 1) / 3
     */
    static int getRowFromSlot(int slot) {
        return (slot - 1) / 3;
    }

    /**
     * Converts slot number into column index using modulo operation.
     * Input  : Slot number (1-9)
     * Output : Column index (0-2)
     * Formula: col = (slot - 1) % 3
     */
    static int getColFromSlot(int slot) {
        return (slot - 1) % 3;
 * UC5 validates whether a move is inside the board boundaries
 * and whether the selected cell is empty.
 */
public class TicTacToe {

    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };

    /**
     * Entry point of the program.
     * Initialises the board and prints it.
     */
    public static void main(String[] args) {
        initializeBoard();
        printBoard();
    }

    /**
     * Initializes the 3x3 board by filling each cell with '-' to indicate
     * an empty position. Students should focus on correct nested loop usage.
     */
    static void initializeBoard() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                board[row][col] = '-';
            }
        }
    }

    /**
     * Prints the Tic-Tac-Toe board using horizontal and vertical separators
     * so that the grid structure is clearly visible to the user.
     */
    static void printBoard() {
        System.out.println("-------------");
        for (int row = 0; row < 3; row++) {
            System.out.print("| ");
            for (int col = 0; col < 3; col++) {
                System.out.print(board[row][col] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
     * Entry point of the program. Tests the validation logic
     * using sample row and column values.
     */
    public static void main(String[] args) {
        System.out.println(isValidMove(1, 1)); // true  - within bounds, cell empty
        System.out.println(isValidMove(3, 3)); // false - out of bounds
    }

    /**
     * Checks if the given row and column are within bounds
     * and if the target cell is empty.
     * Input  : Row, Column
     * Output : true if valid, false otherwise.
     */
    static boolean isValidMove(int row, int col) {
        // Boundary check: row and column must be 0-2
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }
        // Cell must be empty (not already occupied)
        if (board[row][col] != '-') {
            return false;
        }
        return true;
    }
}
