package geeksForGeeks.strings.classroom;

public class CheckForRotation {

    public static boolean checkIfRotated(String s,String s2){
        String res = s+s;
        return res.indexOf(s2)!=-1;
    }

    public static void main(String[] args) {
        String s1 = "ABAB";
        String s2 = "ABBA";
        System.out.println(checkIfRotated(s1,s2));
    }
}
