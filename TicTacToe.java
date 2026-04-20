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
    }
}
