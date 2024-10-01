
import java.util.Scanner;
import java.util.Random;

class AIPlayer extends Player {

    AIPlayer(String name, char mark) {
        this.name = name;
        this.mark = mark;
    }

    void makeMove() {
        Scanner s = new Scanner(System.in);
        int row;
        int col;

        do {
            Random r = new Random();// Random is inbuilt java function r is chosen for implementing row and col
            row = r.nextInt(3);// value between 0,1 and 2 would be chosen for row

            col = r.nextInt(3);

        } while (!isValidMove(row, col));

        TicTacToe.placeMark(row, col, mark);

    }

}