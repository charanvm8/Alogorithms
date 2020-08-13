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
        int[][] arr = {{1,2},{4,5}};
        int[][] arr1 = new int[2][2];
        arr1[0][0] = 5;
        arr1[0][1] = 6;
        arr1[1][0] = 8;
        arr1[1][1] = 9;

//        int[][] addition = Matrix.addition(arr,arr1);
//        printMatrix(addition);
//        System.out.println("--------------------");
//        int[][] substract = Matrix.substract(arr1,arr);
//        printMatrix(substract);
//        System.out.println("--------------------");
//        int[][] multiplication = Matrix.multiplication(arr,arr1);
//        printMatrix(multiplication);
//        System.out.println("--------------------");
//        Matrix.transpose(arr1);
//        printMatrix(arr1);
        int[][] arr3 = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        //MatrixRotation.rotate(arr3);

        int perHour = 100;
        int total = perHour*8*5*4;
        double res = total*0.4;
        res -=1000;
        System.out.println("TekTheory "+total*0.2);
        System.out.println("Consultant "+total*0.4);
        System.out.println("Support "+ ((total*0.4)-1000) );
        System.out.println("Prakash "+ res/2);
        System.out.println("Charan  "+ res/2);

    }
}
