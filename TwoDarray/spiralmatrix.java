package TwoDarray;

public class spiralmatrix {

    public static void printspiral(int matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            //TOP Line
            for (int i = startCol; i <= endCol; i++) {
                System.out.print(matrix[startRow][i] + " ");
            }

            //RIGHT Line
            for (int i = startRow+1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }

            //bottom Line
            if (startRow == endRow) {
                break;
            }
            for (int i = endCol-1; i >= startCol; i--) {
                System.out.print(matrix [endRow] [i]+ " ");
            }

            //Left Line
            if (startCol == endCol) {
                break;
            }
            for (int i = endRow-1; i >= startCol+1; i--) {
                System.out.print(matrix[i] [startCol] + " ");
            }
            startRow++;
            startCol++;
            endCol--;
            endRow--;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int matrix[][]={ { 1,2,3,4},
                         { 5,6,7,8},
                        { 9,10,11,12},
                        {13,14,15,16}};
                    printspiral(matrix);
        }
    }

