package educative.slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubWithReplacement {

    public static int longestSubWithReplacement(String str,int k){
        int result = 0;
        Map<Character,Integer> charactersCount = new HashMap<>();
        int startIndex = 0;
        int repeats = 0;
        for(int endIndex = 0;endIndex<str.length();endIndex++){
            char currentCharacter = str.charAt(endIndex);
            if(charactersCount.containsKey(currentCharacter)){
                charactersCount.put(currentCharacter,charactersCount.get(currentCharacter)+1);
            }
            if(charactersCount.containsKey(currentCharacter) && charactersCount.get(currentCharacter)>k && endIndex-charactersCount.get(currentCharacter)>k){
                startIndex = Math.max(startIndex,charactersCount.get(currentCharacter)+1);
            }
            charactersCount.put(currentCharacter,endIndex);
            result = Math.max(result,endIndex-startIndex+1+repeats);
        }
        return result;
    }
    public static void main(String[] args) {
        String s = "aabccbb";
        System.out.println(longestSubWithReplacement(s,2));
    }
}
