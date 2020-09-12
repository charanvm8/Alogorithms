package geeksForGeeks.strings.classroom;

public class LeftMostNonRepeating {

    static final int CHAR = 256;

    // Naive Method
    public static int leftMostNonRepeatingNaive(String s1){
        for(int i=0;i<s1.length()-1;i++){
            char curr = s1.charAt(i);
            boolean found = false;
            for(int j=i+1;j<s1.length();j++){
                if(s1.charAt(j)==curr){
                    found = true;
                }
            }
            if(!found){
                return i;
            }
        }
        return -1;
    }


    public static char leftMostNonRepeating(String s1){
        int[] chars = new int[CHAR];
        for(int i=0;i<s1.length();i++){
            chars[(int)s1.charAt(i)]++;
        }
        for(int i=0;i<s1.length();i++){
            if(chars[(int)s1.charAt(i)]==1){
                return (char)(int)s1.charAt(i);
            }
        }
        return '$';
    }


//    public static int leftMostNonRepeating1(String s1){
//
//    }
}
