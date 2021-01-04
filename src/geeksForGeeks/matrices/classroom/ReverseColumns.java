package geeksForGeeks.matrices.classroom;

public class ReverseColumns {

    public static void reverseColumns(int[][] arr){
        int rowLen = arr.length;
        int columnLen = arr[0].length;

        for(int i=0;i<rowLen/2;i++){
            for(int j=0;j<columnLen;j++){
                int temp = arr[rowLen-1-i][j];
                arr[rowLen-1-i][j]=arr[i][j];
                arr[i][j] = temp;
            }
        }
    }
}
