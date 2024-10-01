import java.util.Scanner;

public class LaunchGame {
    public static void main(String[] args) {
        TicTacToe t = new TicTacToe();
        /*
         * //this is just simple case using non static method from Tictactoe class
         * 
         * t.dispBoard();
         * t.placeMark(0, 0, 'O');//here direct we check for cases by giving input for
         * method due to non static methods
         * 
         * 
         * t.placeMark(1, 1, 'X');
         * t.placeMark(2, 2, 'O');
         * 
         * t.placeMark(0, 2, 'X');
         * t.placeMark(2, 0, 'X');
         * t.dispBoard();
         * System.out.println(t.checkDiaWin());
         * 
         * 
         * //applicable for 2 humanplayer and static methods
         * 
         * HumanPlayer p1=new HumanPlayer("bib", 'X');
         * HumanPlayer p2=new HumanPlayer("priya", 'O');
         * 
         * HumanPlayer cp;//cp is reference variable
         * cp=p1;
         * while(true)
         * {
         * System.out.println(cp.name + " turn");
         * cp.makeMove();//as there are static method so we do not need to give input
         * for method
         * TicTacToe.dispBoard();
         * if(TicTacToe.checkColWin()||TicTacToe.checkDiaWin()||TicTacToe.checkRowWin())
         * {
         * System.out.println(cp.name+" has won");
         * break;
         * }
         * else
         * {
         * if(cp==p1)
         * {
         * cp=p2;
         * }
         * else
         * {
         * cp=p1;
         * }
         * }
         * }
         */
        // now for 1 humanplayer and an Ai player

        HumanPlayer p1 = new HumanPlayer("bob", 'X');
        AIPlayer p2 = new AIPlayer("Si", 'O');

        Player cp;// cp is reference variable
        cp = p1;
        while (true) {
            System.out.println(cp.name + "  turn");
            cp.makeMove();// as there are static method so we do not need to give input for method
            TicTacToe.dispBoard();
            if (TicTacToe.checkColWin() || TicTacToe.checkDiaWin() || TicTacToe.checkRowWin()) {
                System.out.println(cp.name + " has won");
                break;
            } else if (TicTacToe.checkDraw()) {

                System.out.println("game is draw");
                break;
            } else {
                if (cp == p1) {
                    cp = p2;// p2's turn if p1 not win or not a draw
                } else {
                    cp = p1;
                }
            }
        }

    }

}
