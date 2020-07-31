package geeksForGeeks.matrices.theory;

public class TheoryMain {

    public static void printMatrix(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = new int[2][2];
        int[][] arr1 = new int[2][2];

        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[1][0] = 4;
        arr[1][1] = 5;

        arr1[0][0] = 5;
        arr1[0][1] = 6;
        arr1[1][0] = 8;
        arr1[1][1] = 9;

        int[][] addition = Matrix.addition(arr,arr1);
        printMatrix(addition);
        System.out.println("--------------------");
        int[][] substract = Matrix.substract(arr1,arr);
        printMatrix(substract);
        System.out.println("--------------------");
        int[][] multiplication = Matrix.multiplication(arr,arr1);
        printMatrix(multiplication);
        System.out.println("--------------------");
        Matrix.transpose(arr1);
        printMatrix(arr1);

    }
}
