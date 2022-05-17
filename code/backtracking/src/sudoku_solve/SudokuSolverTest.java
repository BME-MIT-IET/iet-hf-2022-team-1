
public class SudokuSolverTest {

    public static void main(String[] args) {
        // UsabilityTest();
        PerformanceTest();
    }

    public static void UsabilityTest() {

        int board1[][] = new int[][] { { 8, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 3, 6, 0, 0, 0, 0, 0 },
                { 0, 7, 0, 0, 9, 0, 2, 0, 0 },
                { 0, 5, 0, 0, 0, 7, 0, 0, 0 },
                { 0, 0, 0, 0, 4, 5, 7, 0, 0 },
                { 0, 0, 0, 1, 0, 0, 0, 3, 0 },
                { 0, 0, 1, 0, 0, 0, 0, 6, 8 },
                { 0, 0, 8, 5, 0, 0, 0, 1, 0 },
                { 0, 9, 0, 0, 0, 0, 4, 0, 0 } };

        /*
         * int board2[][] = new int[][]
         * {{7, 9, 2, 1, 5, 4, 3, 8, 6},
         * {6, 4, 3, 8, 2, 7, 1, 5, 9},
         * {8, 5, 1, 3, 9, 6, 7, 2, 4},
         * {2, 6, 5, 9, 7, 3, 8, 4, 1},
         * {4, 8, 9, 5, 6, 1, 2, 7, 3},
         * {3, 1, 7, 4, 8, 2, 9, 6, 5},
         * {1, 3, 6, 7, 4, 8, 5, 9, 2},
         * {9, 7, 4, 2, 1, 5, 6, 3, 8},
         * {5, 2, 8, 6, 3, 9, 4, 1, 7}};
         * 
         * int board3[][] = new int[][]
         * {{5, 5, 5, 5, 5, 5, 5, 5, 5},
         * {5, 5, 5, 5, 5, 5, 5, 5, 5},
         * {5, 5, 5, 5, 5, 5, 5, 5, 5},
         * {5, 5, 5, 5, 5, 5, 5, 5, 5},
         * {5, 5, 5, 5, 5, 5, 5, 5, 5},
         * {5, 5, 5, 5, 5, 5, 5, 5, 5},
         * {5, 5, 5, 5, 5, 5, 5, 5, 5},
         * {5, 5, 5, 5, 5, 5, 5, 5, 5},
         * {5, 5, 5, 5, 5, 5, 5, 5, 5}};
         */

        if (SudokuSolver.solveSudoku(board1, board1.length)) {
            SudokuSolver.print(board1, board1.length);
        } else {
            System.out.println("No solution");
        }
    }

    public static void PerformanceTest() {
        long timeBeforeTest = System.currentTimeMillis();

        /*
         * int board[][] = new int[][]{
         * { 8, 0, 0, 0, 0, 0, 0, 0, 0 },
         * { 0, 0, 3, 6, 0, 0, 0, 0, 0 },
         * { 0, 7, 0, 0, 9, 0, 2, 0, 0 },
         * { 0, 5, 0, 0, 0, 7, 0, 0, 0 },
         * { 0, 0, 0, 0, 4, 5, 7, 0, 0 },
         * { 0, 0, 0, 1, 0, 0, 0, 3, 0 },
         * { 0, 0, 1, 0, 0, 0, 0, 6, 8 },
         * { 0, 0, 8, 5, 0, 0, 0, 1, 0 },
         * { 0, 9, 0, 0, 0, 0, 4, 0, 0 } };
         */

        int boardHard[][] = new int[][] {
                { 0, 0, 9, 0, 0, 0, 0, 0, 6 },
                { 6, 3, 0, 0, 2, 0, 7, 0, 0 },
                { 0, 0, 8, 0, 0, 3, 0, 0, 0 },
                { 0, 0, 3, 0, 0, 0, 0, 0, 0 },
                { 4, 1, 0, 0, 0, 2, 0, 0, 8 },
                { 0, 0, 0, 0, 7, 0, 0, 5, 0 },
                { 0, 0, 0, 4, 0, 0, 8, 0, 0 },
                { 2, 6, 0, 0, 0, 1, 0, 0, 4 },
                { 9, 0, 0, 0, 0, 0, 0, 0, 0 } };

        /*
         * int boardSmall[][] = new int[][] { { 1, 0, 0 },
         * { 0, 2, 0 },
         * { 0, 0, 3 } };
         * 
         * int boardMedium[][] = new int[][] {
         * { 0, 0, 0, 0, 5, 6 },
         * { 0, 0, 2, 0, 3, 0 },
         * { 0, 0, 0, 0, 6, 1 },
         * { 4, 1, 0, 0, 0, 0 },
         * { 0, 3, 0, 6, 0, 0 },
         * { 1, 6, 0, 0, 0, 0 } };
         */

        if (SudokuSolver.solveSudoku(boardHard, boardHard.length)) {
            SudokuSolver.print(boardHard, boardHard.length);
        } else {
            System.out.println("No solution");
        }

        long timeAfterTest = System.currentTimeMillis();
        System.out.println(timeAfterTest - timeBeforeTest);

    }
}