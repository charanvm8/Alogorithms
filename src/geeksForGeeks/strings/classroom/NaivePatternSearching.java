package geeksForGeeks.strings.classroom;

public class NaivePatternSearching {

    public static void patternSearchNaive(String str,String s){
        for(int i=0;i<=str.length()-s.length();i++){
            boolean isSubString = true;
            for(int j=0;j<s.length();j++){
                if(str.charAt(j+i)!=s.charAt(j)){
                    isSubString = false;
                    break;
                }
            }
            if(isSubString){
                System.out.println(i);
            }
        }
    }
}
