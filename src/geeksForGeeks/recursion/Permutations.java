package geeksForGeeks.recursion;

public class Permutations {

    public static void printPermutations(char[] chars,String curr,int index){
        if(index==chars.length){
            System.out.println(curr);
        }
        for(int i=index;i<chars.length;i++){
            char temp = chars[i];
            chars[i] = chars[index];
            chars[index] = temp;
            printPermutations(chars,curr+chars[index],index+1);
            char temp1 = chars[i];
            chars[i] = chars[index];
            chars[index] = temp1;
        }
    }

    public static void main(String[] args) {
        String s = "ABCD";

        printPermutations(s.toCharArray(),"",0);
    }
}
