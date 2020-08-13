package geeksForGeeks.matrices.theory;

public class MatrixRotation {

    // Naive Solution
    public static void rotateMatrix(int[][] arr){
        int[][] res = new int[arr.length][arr[0].length];
        for(int i=0;i<res.length;i++){
            int len = arr[0].length;
            for(int j=0;j<len;j++){
                res[j][i] = arr[i][len-j-1];
            }
        }
        TheoryMain.printMatrix(res);
    }

    // Constant space solution
    public static void rotate(int[][] arr){
        for(int i=0;i<=1;i++){
            System.out.print(arr[i][i]+" ");
            System.out.print(arr[i][arr.length-1-i]+" ");
            System.out.print(arr[arr.length-1-i][i]+" ");
            System.out.print(arr[arr.length-1-i][arr[0].length-1-i]+" ");
            System.out.println();
        }

//        System.out.println(arr[0][0]);
//        System.out.println(arr[0][arr[0].length-1]);
//        System.out.println(arr[arr.length-1][0]);
//        System.out.println(arr[arr.length-1][arr[0].length-1]);
    }
}
