package geeksForGeeks.backTracking;

public class KSwaps {

    public static String findMaximumNum(String str, int k)
    {
        return findMaxNum(str,0,k,str.length());
    }

    public static String findMaxNum(String str,int currIndex,int k, int len){
        if(currIndex>len-1 || k==0){
            return str;
        }
        int currValue = Character.getNumericValue(str.charAt(currIndex));
        int highValue = currValue;
        int highIndex = currIndex;
        for(int i=currIndex+1;i<len;i++){
            int val = Character.getNumericValue(str.charAt(i));
            if(val>currValue && val>=highValue){
                highIndex = i;
                highValue = val;
            }
        }
        if(highValue!=currValue){
            String q = udpateString(str,currIndex,highIndex);
            return findMaxNum(q,currIndex+1,k-1,len);
        }
        else{
            return findMaxNum(str,currIndex+1,k,len);
        }
    }

    public static String udpateString(String s,int index1,int index2){
        char[] chars = s.toCharArray();
        char temp = chars[index1];
        chars[index1] = chars[index2];
        chars[index2] = temp;
        return new String(chars);
    }

    public static void main(String[] args) {
        System.out.println(findMaximumNum("61892795431",4));
    }
}
