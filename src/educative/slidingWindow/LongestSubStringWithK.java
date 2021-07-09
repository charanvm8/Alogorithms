package educative.slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithK {

    public static int longestSubStringWithK(String value,int maxSize){
        int result = 0;
        Map<Character,Integer> characterCounter = new HashMap<>();
        char[] chars = value.toCharArray();
        int startCharacterCount = 0;
        for(int index = 0;index<chars.length;index++){
            characterCounter.put(chars[index],characterCounter.getOrDefault(chars[index],0)+1);
            while(characterCounter.size()>maxSize){
                int currCountofCharacter = characterCounter.get(chars[startCharacterCount]);
                characterCounter.put(chars[startCharacterCount],currCountofCharacter-1);
                if(currCountofCharacter==1){
                    characterCounter.remove(chars[startCharacterCount]);
                }
                startCharacterCount++;
            }
            result = Math.max(result,index-startCharacterCount+1);
        }
        return result;
    }



    public static void main(String[] args) {
        String value = "araaci";
        System.out.println(longestSubStringWithK(value,1));
    }
}
