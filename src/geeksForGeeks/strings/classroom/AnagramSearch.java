package geeksForGeeks.strings.classroom;

public class AnagramSearch {

    public static boolean anagramSearch(String s, String pattern){
        int patternLen = pattern.length();
        int[] currCount = new int[256];
        int[] patternCount = new int[256];
        for(int i=0;i<patternLen;i++){
            currCount[i] += (int)s.charAt(i);
            patternCount[i] += (int)pattern.charAt(i);
        }

        for(int i=0;i<s.length()-patternLen+1;i++){
            if(checkIfSame(currCount,patternCount)){
                return true;
            }
            currCount[(int)s.charAt(i)]--;
            currCount[(int)s.charAt(i+patternLen)]++;
        }
        return false;
    }

    public static boolean checkIfSame(int[] arr1,int[] arr2){
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
}
