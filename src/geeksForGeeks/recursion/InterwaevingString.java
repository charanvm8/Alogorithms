package geeksForGeeks.recursion;

public class InterwaevingString {

    public static boolean interweavingStrings(String one, String two, String three) {
        // Write your code here.
        if(one.length()+two.length()!=three.length()){
            return false;
        }
        return interweave(one,two,three);
    }

    public static boolean interweave(String one, String two, String three){
        if(one.length()==0 && two.length()==0 && three.length()==0){
            return true;
        }
        if(one.length()>0 && three.charAt(0)==one.charAt(0)){
            return interweave(one.substring(1),two,three.substring(1));
        }
        else if(two.length()>0 && three.charAt(0)==two.charAt(0)){
            return interweave(one,two.substring(1),three.substring(1));
        }
        else{
            return false;
        }
    }
}
