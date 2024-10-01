class TicTacToe {
    static char[][] board;

    public TicTacToe() {
        board = new char[3][3];
        initBoard();
    }

    static void initBoard()// initialise board with space
    {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = ' ';
            }
        }
    }

    static void dispBoard() {
        System.out.println("----------");// for line
        for (int i = 0; i < board.length; i++) {
            System.out.print("| ");// for verical table line
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + "| ");
            }
            System.out.println();// for second row initialise
            System.out.println("----------");

        }

    }

    static void placeMark(int row, int col, char mark) {
        // board[row][col]=mark;
        if (row >= 0 && row <= 2 && col >= 0 && col <= 2) {
            board[row][col] = mark;
        } else {
            System.out.println("invalid");
        }
    }

    // win condition can be col,row or diagonal
    static boolean checkColWin() {
        for (int j = 0; j <= 2; j++) {
            if (board[0][j] != ' ' && board[0][j] == board[1][j] && board[1][j] == board[2][j]) {
                return true;
            }
        }
        return false;
    }

    static boolean checkRowWin() {
        for (int i = 0; i <= 2; i++) {
            if (board[i][0] != ' ' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                return true;
            }
        }
        return false;
    }

    static boolean checkDiaWin() {
        if (board[0][0] != ' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2]
                || board[0][2] != ' ' && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            return true;
        } else

            return false;
    }

    static boolean checkDraw() {
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                if (board[i][j] == ' ')
                    return false;
            }
        }
        return true;
    }

}
