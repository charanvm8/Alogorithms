package dynamicProgramming.classroom;

public class EditDistance {

    public static int editDistance(String s1,String s2,int index1,int index2){
        if(index1<0){
            return index2;
        }
        if(index2<0){
            return index1;
        }
        if (s1.charAt(index1) == s2.charAt(index2)) {
            return editDistance(s1,s2,index1-1,index2-1);
        }
        int replace = 1+editDistance(s1,s2,index1-1,index2-1);
        int addition = 1+editDistance(s1,s2,index1,index2-1);
        int deletion = 1+editDistance(s1,s2,index1-1,index2);
        return Math.min(replace,Math.min(addition,deletion));
    }

    public static void main(String[] args) {
        String s1 = "SATURDAY";
        String s2 = "SUNDAY";
        System.out.println(editDistance(s1,s2,s1.length()-1,s2.length()-1));
    }
}
