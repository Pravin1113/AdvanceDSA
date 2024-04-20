package backtacking;

public class SudokuSolver {

    private static boolean isSafe(int[][] sudoku, int row, int col, int digits) {

        //col
        for (int i = 0; i <=8; i++) {
            if (sudoku[i][col] == digits) {
                return false;
            }
        }
        //row
        for (int j = 0; j <= 8; j++) {
            if (sudoku[row][j] == digits) {
                return false;
            }
        }

        //grid way
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;

        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (sudoku[i][j] == digits) {
                    return false;
                }
            }
        }

        return true;
    }


    private static boolean sudokuSolver(int[][] sudoku, int row, int col) {

        if (row == 9 && col ==0) {
            return true;
        }
        int nextRow = row;
        int nextCol = col + 1;

        if (col + 1 == 9) {
            nextCol = 0;
            nextRow = row + 1;
        }
        if (sudoku[row][col] != 0) {
            return sudokuSolver(sudoku, nextRow, nextCol);
        }
        for (int digits = 1; digits <= 9; digits++) {
            if (isSafe(sudoku, row, col, digits)) {
                sudoku[row][col] = digits;
                if (sudokuSolver(sudoku, nextRow, nextCol)) {
                    return true;
                }
                sudoku[row][col] = 0;
            }
        }
        return false;
    }


    private static void printBoard(int[][] sudoku) {
        System.out.println("+++++++++++++++");
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku.length; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int[][] sudoku = {{0, 0, 8, 0, 0, 0, 0, 0, 0},
                {4, 9, 0, 1, 5, 7, 0, 0, 2},
                {0, 0, 3, 0, 0, 4, 1, 9, 0},
                {1, 8, 5, 0, 6, 0, 0, 2, 0},
                {0, 0, 0, 0, 2, 0, 0, 6, 0},
                {9, 6, 0, 4, 0, 5, 3, 0, 0},
                {0, 3, 0, 0, 7, 2, 0, 0, 4},
                {0, 4, 9, 0, 3, 0, 0, 5, 7},
                {8, 2, 7, 0, 0, 9, 0, 1, 3}};
        if (sudokuSolver(sudoku, 0, 0)) {
            printBoard(sudoku);
        }else {
            System.out.println("solution not exist");
        }
    }

}

