package geeksForGeeks.strings.classroom;

import utility.PrintArray;

import java.util.Arrays;

public class LongestSubStringWithDistinct {

    public static int longestSubString(String s){
        int len = s.length();
        int[] chars = new int[256];
        Arrays.fill(chars,-1);
        int[] res = new int[len];
        res[0] = 1;
        chars[(int)s.charAt(0)] = 0;
        for(int i=1;i<len;i++){
            res[i] = res[i-1]+1;
            int prevIndex = (int)s.charAt(i);
            if(chars[prevIndex]!=-1 && i-chars[prevIndex]>=0){
                res[i] = i-chars[prevIndex];
            }
            chars[(int)s.charAt(i)] = i;
        }
        PrintArray.printArray(res);
        return 0;
    }

    public static void main(String[] args) {
        String s = "abaacdbab";
        System.out.println(longestSubString(s));
    }
}
