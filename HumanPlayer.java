
import java.util.Scanner;

class HumanPlayer extends Player {

    HumanPlayer(String name, char mark) {
        this.name = name;
        this.mark = mark;
    }

    void makeMove() {
        Scanner s = new Scanner(System.in);
        int row;
        int col;

        do {
            System.out.println("enter row and col:");
            row = s.nextInt();
            col = s.nextInt();
        } while (!isValidMove(row, col));

        TicTacToe.placeMark(row, col, mark);

    }

}