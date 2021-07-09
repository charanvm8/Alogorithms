package educative.slidingWindow;

import java.util.HashSet;
import java.util.Set;

public class NonRepeatingSubString {

    public static int nonRepeatingSubString(String value){
        int result = 0;
        char[] characters = value.toCharArray();
        Set<Character> currentCharacters = new HashSet<>();
        int characterCounter = 0;
        for(int index=0;index<characters.length;index++){
            while (currentCharacters.contains(characters[index]) && characterCounter<=index){
                currentCharacters.remove(characters[characterCounter++]);
            }
            currentCharacters.add(characters[index]);
            result = Math.max(result,index-characterCounter+1);
        }
        return result;
    }

    // Another method can be used to get index using HashMap.

    public static void main(String[] args) {
        String value = "abccde";
        System.out.println(nonRepeatingSubString(value));
    }
}
