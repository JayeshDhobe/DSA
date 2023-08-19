package Backtracking;

public class sudoku {

    public static boolean isSafe(int sudoku[][], int row, int col, int digit) {
        //column
        for (int i = 0; i <=8; i++) {
            if (sudoku[i][col] == digit) {
                return false;
        }
    }
        //Row
        for (int j = 0; j <=8; j++) {
            if (sudoku[row][j] == digit) {
                return false;
        }
    }

        //Grid 

        //starting row = (row/3)*3
        //starting col = (col/3)*3
        int sr = (row/3)*3;
        int sc = (col/3)*3;
        
        //3*3 grid
        for (int i = sr; i < sr+3; i++) {
            for (int j = sc; j < sc+3; j++) {
                if (sudoku[i][j] == digit) {
                    return false;
                }
            }
        }
        return true;
}
    public static boolean sudokuSoler(int sudoku[][], int row, int col) {
        //BASE CASE
        if (row == 9) {
            return true;
        }


        //RECURSION
        int nextRow =  row , nextCol = col+1;  // SAME Row column increase
        if (col+1 == 9) { //if full
            nextRow = row+1; //INCREASE ROW  === jump next row
            nextCol = 0; //ON SAME COLUMN
        }
         
        //already placed element 
        if (sudoku[row][col] != 0) { 
            return sudokuSoler(sudoku, nextRow, nextCol); // already fill come to next row & col
        }

        for (int digit = 1; digit <= 9 ; digit++) {
            if (isSafe (sudoku, row, col , digit)) { //is sudoku safe to place
                sudoku[row][col] = digit; // id safe placed it
                if (sudokuSoler(sudoku, nextRow, nextCol)) { // solution exist
                 return true;   
                }
                sudoku[row][col] = 0;
            }
        }
        return false;
    }
    public static void printSudoku(int sudoku[][]) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoku[i][j] + "");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int sudoku[][] = { {0, 0, 8, 0, 0, 0, 0, 0, 0}, 
         {4, 9, 0, 1, 5, 7, 0, 0, 2}, 
         {0, 0, 3, 0, 0, 4, 1, 9, 0}, 
         {1, 8, 5, 0, 6, 0, 0, 2, 0}, 
         {0, 0, 0, 0, 2, 0, 0, 6, 0}, 
         {9, 6, 0, 4, 0, 5, 3, 0, 0}, 
         {0, 3, 0, 0, 7, 2, 0, 0, 4}, 
         {0, 4, 9, 0, 3, 0, 0, 5, 7}, 
         {8, 2, 7, 0, 0, 9, 0, 1, 3} };

         if (sudokuSoler(sudoku, 0, 0)) {
            System.out.println("Solution Exits");
            printSudoku(sudoku);
         }else{
            System.out.println("Solution does not exits");
         }
    }
}
