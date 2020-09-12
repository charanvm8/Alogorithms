package geeksForGeeks.strings.problems;

public class RemoveCommon {

    public static final int VAL = 256;

    public static String concatenatedString(String s1,String s2){

        // Your code here
        int[] counter = new int[VAL];
        for(int i=0;i<s1.length();i++){
            counter[(int)s1.charAt(i)]=1;
        }
        for(int i=0;i<s2.length();i++){
            if(counter[(int)s2.charAt(i)]==1){
                counter[(int)s2.charAt(i)]=2;
            }
            else{
                counter[(int)s2.charAt(i)]=1;
            }
        }
        String res = "";
        for(int i=0;i<s1.length();i++){
            if(counter[(int)s1.charAt(i)]==1){
                res+=s1.charAt(i);
            }
        }
        for(int i=0;i<s2.length();i++){
            if(counter[(int)s2.charAt(i)]==1){
                res+=s2.charAt(i);
            }
        }
        return res;
    }
}
