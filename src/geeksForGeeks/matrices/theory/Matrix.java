package geeksForGeeks.matrices.theory;

public class Matrix {

    public static int[][] addition(int[][] arr,int[][] arr1){
        int[][] res = new int[arr.length][arr[0].length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr1.length;j++){
                res[i][j] = arr[i][j]+arr1[i][j];
            }
        }
        return res;
    }

    public static int[][] substract(int[][] arr,int[][] arr1){
        int[][] res = new int[arr.length][arr[0].length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr1.length;j++){
                res[i][j] = arr[i][j]-arr1[i][j];
            }
        }
        return res;
    }

    public static int[][] multiplication(int[][] arr,int[][] arr1){
        if(arr[0].length!=arr1.length || arr.length!=arr1[0].length){
            return new int[0][0];
        }
        int[][] res = new int[arr.length][arr[0].length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr1.length;j++){
                int result = 0;
                for(int k=0;k<arr1.length;k++){
                    result += arr[i][k]*arr1[k][j];
                }
                res[i][j] = result;
            }
        }
        return res;
    }

    public static void transpose(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr[0].length;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }


}
