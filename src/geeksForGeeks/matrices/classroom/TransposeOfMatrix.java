package geeksForGeeks.matrices.classroom;

public class TransposeOfMatrix {

    public static void matrixTranspose(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr[0].length;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
}
