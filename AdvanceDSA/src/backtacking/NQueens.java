package backtacking;

public class NQueens {
public static boolean isSafe(char[][] boards , int row, int col){
   //vertical up
    for (int i = row-1; i >=0; i--) {
        if(boards[i][col]=='Q') {
            return false;
        }
    }
    //diagonal left up
    for (int i = row-1, j= col-1; i >=0 && j>=0; i--,j--) {
        if(boards[i][j]=='Q') {
            return false;
        }
    }
    //diagonal right up
    for (int i = row-1, j= col+1; i >=0 && j < boards.length; i--,j++) {
        if(boards[i][j]=='Q') {
            return false;
        }
    }

    return true;
}

    private static void nQueens(char[][] boards, int row) {
        if(boards.length==row){
            printBoard(boards);
            return;
        }
        for (int j = 0; j < boards.length; j++) {
            if (isSafe(boards, row, j)) {
                boards[row][j] = 'Q';
                nQueens(boards, row + 1);
                boards[row][j] = 'X';
            }
        }
    }

    private static void printBoard(char[][] boards) {
        System.out.println("+++++++++++++++");
        for (int i = 0; i < boards.length; i++) {
            for (int j = 0; j < boards.length; j++) {
                System.out.print(boards[i][j] + " ");
            }
            System.out.println();
        }

    }


    public static void main(String[] args) {
        int n = 4;
        char[][] chars = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                chars[i][j] = 'X';
            }
        }
        nQueens(chars, 0);
    }
}
