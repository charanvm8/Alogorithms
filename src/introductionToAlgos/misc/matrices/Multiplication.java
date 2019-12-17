package introductionToAlgos.misc.matrices;

public class Multiplication {

    static int[][] multipleMatrices(int[][] firstArr, int[][] secondArr){
        int[][] resultMatrix = new int[firstArr.length][secondArr[0].length];
        for(int i=0;i<firstArr.length;i++){
            for(int j=0;j<secondArr[0].length;j++){
                for(int k=0;k<secondArr.length;k++){
                    resultMatrix[i][j] += firstArr[i][k]*secondArr[k][j];
                }
            }
        }
        return resultMatrix;
    }

    public static void main(String[] args) {
        int[][] firstArr = new int[2][2];
        int[][] secondArr = new int[2][2];

        firstArr[0][0] = 2;
        firstArr[0][1] = 3;
        firstArr[1][0] = 4;
        firstArr[1][1] = 5;
        secondArr[0][0] = 6;
        secondArr[0][1] = 7;
        secondArr[1][0] = 8;
        secondArr[1][1] = 9;
        int[][] result = multipleMatrices(firstArr,secondArr);
        for(int i=0;i<result.length;i++){
            for(int j=0;j<result[0].length;j++){
               System.out.println(result[i][j]);
            }
        }
    }
}

