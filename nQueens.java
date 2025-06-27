public class nQueens {

    public static void printQueen(char board[][]) {
        System.out.println("----This is nQueens Problem----");
        int n = board.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + " ");

            }
            System.out.println();
        }
        count++;
        System.out.println(count);
    }

    public static void initialize(char board[][], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }
    }

    public static void nQueens(char board[][], int row) {

        if (row == board.length) {
            printQueen(board);
            return;
        }

        for (int j = 0; j < board.length; j++) {
            board[row][j] = 'Q';
            nQueens(board, row + 1);
            board[row][j] = 'X';

        }
    }

    public static void main(String args[]) {
        int n = 2;
        char board[][] = new char[n][n];
        initialize(board, n);
        nQueens(board, 0);
        printQueen(board);
    }
}
