package geekForGeeks.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Practice {

    public static void printPermutations(String word){
        char[] chars = word.toCharArray();
        printPermutations(chars,0);
    }

    public static void printPermutations(char[] chars,int start){
        if(start==chars.length){
            System.out.println(new String(chars));
            return;
        }

        for(int j=start;j<chars.length;j++){
            swap(chars,start,j);
            printPermutations(chars,start+1);
            swap(chars,start,j);
        }
    }



    public static void swap(char[] chars, int index1, int index2){
        char temp = chars[index1];
        chars[index1] = chars[index2];
        chars[index2] = temp;
    }

    public static int[][] ratPath(int[][] ratMaze){
        int result[][] = new int[ratMaze.length][ratMaze[0].length];
        if(!ratPath(ratMaze,0,0,ratMaze.length,ratMaze[0].length,result)){
            return result;
        };
        return result;
    }

    public static boolean ratPath(int[][] ratMaze,int row,int column,int rowLen,int columnLen,int[][] result){
        if(row==rowLen-1 && column==columnLen-1){
            result[row][column]=1;
            return true;
        }
        if(isSafe(ratMaze,row,column,rowLen,columnLen)){
            result[row][column] = 1;
            if(ratPath(ratMaze,row+1,column,rowLen,columnLen,result) ||
                    ratPath(ratMaze,row,column+1,rowLen,columnLen,result)){
                return true;
            }
            result[row][column] = ratMaze[row][column];
            return false;
        }
        return false;
    }

    public static boolean nQueen(int n){
        int[][] result = new int[n][n];
        if(nQueen(0,n,result)){
            return false;
        }
        //PrintArray.printArray(result);
        return true;
    }

    public static boolean nQueen(int column,int size,int[][] result){
        if(column==size){
            return true;
        }
        for(int row=0;row<size;row++){
            if(isSafe(result,row,column)){
                result[row][column] = 1;
                if(nQueen(column+1,size,result)){
                    return true;
                }
                result[row][column] = 0;
            }
        }
        return false;
    }

    public static boolean isSafe(int[][] result, int row, int column){
        int rowLen = result.length;
        int columnLen = result[0].length;
        return true;
    }

    public static boolean isSafe(int[][] ratMaze,int row,int column,int rowLen,int columnLen){
        return row<rowLen && column<columnLen && ratMaze[row][column]==1;
    }


    public static List<String> getParanthesis(int num) {
        List<String> res = new ArrayList<>();
        char[] chars = new char[2 * num];
        getParanthesis(num, 0, 0, chars,0, res);
        return res;
    }

    public static void getParanthesis(int num, int start, int end, char[] chars,int index, List<String> res){
        if( start == num && end == num) {
            res.add(new String(chars));
        }
        else {
            if (start < num) {
                chars[index] = '(';
                getParanthesis(num, start + 1, end, chars, index + 1, res);
            }
            if (end < start) {
                chars[index] = ')';
                getParanthesis(num, start, end + 1, chars, index + 1, res);
            }
        }
    }


    public static void main(String[] args) {
        List<String> result = getParanthesis(3);
        for(String s: result) {
            System.out.println(s);
        }
    }
}
