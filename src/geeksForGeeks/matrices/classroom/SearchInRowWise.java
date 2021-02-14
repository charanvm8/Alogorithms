package geeksForGeeks.matrices.classroom;

import utility.PrintArray;

public class SearchInRowWise {

    public static boolean searchInMatrix(int[][] matrix,int search){
        int rowIndex = 0;
        int columnIndex = matrix[0].length-1;
        while(rowIndex<=matrix.length-1 && columnIndex>=0){
            if(matrix[rowIndex][columnIndex]==search){
                return true;
            }
            else if(matrix[rowIndex][columnIndex]>search){
                columnIndex--;
            }
            else{
                rowIndex++;
            }
        }
        return false;
    }


    static void booleanMatrix(int matrix[][])
    {
        int columnLen = matrix[0].length-1;
        int rowLen = matrix.length-1;
        int[][] res = new int[rowLen+1][columnLen+1];
        for(int i=rowLen;i>=0;i--){
            for(int j=columnLen;j>=0;j--){
                if(matrix[i][j]==1){
                    fillMatrixByColumnRow(res,i,j,columnLen,rowLen);
                }
            }
        }
        for(int i=0;i<=rowLen;i++){
            for(int j=0;j<=columnLen;j++){
                matrix[i][j] = res[i][j];
            }
        }
    }

    static void fillMatrixByColumnRow(int[][] matrix,int row,int column,int columnLen,int rowLen){
        for(int i=0;i<=columnLen;i++){
            matrix[row][i] = 1;
        }
        for(int i=0;i<=rowLen;i++){
            matrix[i][column] = 1;
        }
    }

    public static void main(String[] args) {
//        int[][] matrix = {{10,20,30,40},
//                        {15,25,35,45},
//                        {27,29,37,48},
//                        {32,33,39,50}};
//
//        System.out.println(searchInMatrix(matrix,36));

        int[][] arr = {{0,0 ,0},
                        {0, 0, 0},
                        {0 ,1 ,0}};
        booleanMatrix(arr);
        PrintArray.printArray(arr);
    }
}
