package geeksForGeeks.matrices.classroom;

import java.util.HashSet;
import java.util.Set;

public class ClassRoomMain {

    public static void printMatrix(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15, 16}};

        int[][] arr1 ={{1,1},{2,2}};

        //MatrixInSnakePattern.printMatrixInSnakePattern(arr);
        //BoundaryTraversal.printBoundaries(arr);
        TransposeOfMatrix.matrixTranspose(arr);
        ReverseColumns.reverseColumns(arr);
        printMatrix(arr);
        Set<Integer> ne = new HashSet<>();
        //ne.
    }
}
