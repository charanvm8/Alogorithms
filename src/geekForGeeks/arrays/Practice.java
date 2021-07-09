package geekForGeeks.arrays;

import java.util.Random;

public class Practice {

    public static void nBonacciNumbers(int n, int max){
        if(n>=max){
            return;
        }
        int[] result = new int[max];
        result[n-1] = 1;
        int currTotal = 1;
        int start = 0;
        for(int i=n;i<max;i++){
            result[i] = currTotal;
            currTotal = currTotal + result[i] - result[start++];
        }
        for(int i:result){
            System.out.print(i+" ");
        }
    }

    public static void spriralTraversal(int[][] matrix){
        int top = 0;
        int left = 0;
        int right = matrix[0].length-1;
        int bottom = matrix.length-1;

        while(left<=right && top<=bottom){
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i]+" ");
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right]+" ");
            }
            right--;
            for(int i = right; i>=left; i--){
                System.out.print(matrix[bottom][i]+" ");
            }
            bottom--;
            for (int i = bottom; i >=top; i--) {
                System.out.print(matrix[i][left]+" ");
            }
            left++;
        }
    }

    public static boolean isPalindromeNaive(String s) {
        StringBuilder rev = new StringBuilder(s);
        rev.reverse();
        return s.equals(rev.toString());
    }

    public static boolean isPalindrome(String s) {
        char[] chars = s.toCharArray();
        int start = 0;
        int end = chars.length-1;
        while (start < end) {
            if (chars[start] != chars[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static boolean isSubSequence(String s1, String s2, int s1Len, int s2Len){
        int i = 0;
        int j = 0;
        while (i < s1Len && j < s2Len){
            if (s1.charAt(i) == s2.charAt(j)){
                j++;
            }
            i++;
        }
        return j == s2Len;
    }



    public static void main(String[] args) {
//        nBonacciNumbers(4,10);
//        Random random = new Random();
//        System.out.println(random.nextInt());
//        int[][] arr = new int[3][4];
        int[][] matrix = {{1,2,3,4,5},
                            {6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
        spriralTraversal(matrix);
        String z = "abc";
        System.out.println((int)'a');
        System.out.println(Math.random());
    }
}
