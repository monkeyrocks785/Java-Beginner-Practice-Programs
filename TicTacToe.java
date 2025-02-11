import java.util.*;

public class TicTacToe {

    public static void main(String[] args) {
        char[] board = { '1', '2', '3', '4', '5', '6', '7', '8', '9' };
        var numberOfSquarePlayed = 0;
        var whoseTurnItIs = 'x';
        var gameEndingMessage = "Draw";

        while (numberOfSquarePlayed < 9) {
            printTheBoard(board);
            System.out.printf("Choose a square player %s : ", whoseTurnItIs);
            var scanner = new Scanner(System.in);
            var input = scanner.nextInt();

            if (input < 1 || input > 9) {
                System.out.println("Invalid input, please choose a number between 1 and 9");
                continue;
            }

            if (board[input - 1] == 'x' || board[input - 1] == 'o') {
                System.out.println("Invalid input, please choose an empty square");
                continue;
            }

            board[input - 1] = whoseTurnItIs;

            if ((board[0] + board[1] + board[2]) == (whoseTurnItIs * 3)
                    || (board[3] + board[4] + board[5]) == (whoseTurnItIs * 3)
                    || (board[6] + board[7] + board[8]) == (whoseTurnItIs * 3)
                    || (board[0] + board[3] + board[6]) == (whoseTurnItIs * 3)
                    || (board[1] + board[4] + board[7]) == (whoseTurnItIs * 3)
                    || (board[2] + board[5] + board[8]) == (whoseTurnItIs * 3)
                    || (board[0] + board[4] + board[8]) == (whoseTurnItIs * 3)
                    || (board[2] + board[4] + board[6]) == (whoseTurnItIs * 3)) {
                printTheBoard(board);
                gameEndingMessage = "Congratulations, you won!";
                System.out.println(gameEndingMessage);
                break;
            } else {
                numberOfSquarePlayed++;
                if (whoseTurnItIs == 'x') {
                    whoseTurnItIs = 'o';
                } else {
                    whoseTurnItIs = 'x';

                }
            }
        }

        if (numberOfSquarePlayed == 9) {
            printTheBoard(board);
            System.out.println(gameEndingMessage);
        }
    }

    private static void printTheBoard(char[] board) {
        System.out.println(board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("- + - + -");
        System.out.println(board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("- + - + -");
        System.out.println(board[6] + " | " + board[7] + " | " + board[8]);
    }
}


