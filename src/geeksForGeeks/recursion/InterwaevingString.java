package geeksForGeeks.recursion;

public class InterwaevingString {

    public static boolean interweavingStrings(String one, String two, String three) {
        // Write your code here.
        int oneLength = one.length();
        int twoLength = two.length();
        int threeLength = three.length();
        if(oneLength+twoLength<threeLength || oneLength+twoLength>threeLength){
            return false;
        }
        return interweave(one,two,three,0,0,0,oneLength,twoLength,threeLength);
    }

    public static boolean interweave(String one, String two, String three,
                                     int oneIndex,int twoIndex,int threeIndex,
                                     int oneLength,int twoLength,int threeLength){

        if(threeIndex ==  threeLength){
            return oneIndex == oneLength && twoIndex == twoLength;
        }
        if(oneIndex<oneLength && three.charAt(threeIndex) == one.charAt(oneIndex)){
            oneIndex++;
        }
        else if(twoIndex<twoLength && three.charAt(threeIndex) == two.charAt(twoIndex)){
            twoIndex++;
        }
        threeIndex++;
        return interweave(one,two,three,oneIndex,twoIndex,threeIndex,oneLength,twoLength,threeLength);
    }
}
