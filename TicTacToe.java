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
/**
 * TicTacToe
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
