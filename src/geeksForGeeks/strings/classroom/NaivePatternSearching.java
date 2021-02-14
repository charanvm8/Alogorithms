package geeksForGeeks.strings.classroom;

public class NaivePatternSearching {

    public static void patternSearchNaive(String str,String s){
        int strLen = str.length();
        int patternLen = s.length();
        for(int i=0;i<=strLen-patternLen;i++){
            boolean isPattern = true;
            for(int j=0;j<patternLen;j++){
                if(str.charAt(i+j)!=s.charAt(j)){
                    isPattern = false;
                    break;
                }
            }
            if(isPattern){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        String txt = "AABAACAADAABAAABAA";
        String pat = "AABA";
        patternSearchNaive(txt, pat);
    }
}
