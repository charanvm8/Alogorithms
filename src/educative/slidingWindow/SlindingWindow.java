package educative.slidingWindow;

import java.util.*;

public class SlindingWindow {

    //Maximum Sum Subarray of Size K (easy)
    public static int findMaxSumSubArray(int k, int[] arr) {
        // TODO: Write your code here
        int max = 0;
        int start = 0;
        int currSum = 0;
        for(int end = 0;end<arr.length;end++){
            currSum+=arr[end];
            if(end>=k-1){
                max = Math.max(max,currSum);
                currSum-=arr[start++];
            }
        }
        return max;
    }

    public static int findMinSubArray(int S, int[] subArr) {
        // TODO: Write your code here
        int sum = 0;
        int start = 0;
        int minRange = Integer.MAX_VALUE;
        for(int end = 0;end<subArr.length;end++){
            sum+=subArr[end];
            while(sum>=S){
                minRange = Math.min(minRange,end-start+1);
                sum-=subArr[start++];
            }
        }
        return minRange==Integer.MAX_VALUE?-1:minRange;
    }

    public static int findLength(String str, int k) {
        Map<Character,Integer> characterCounter = new HashMap<>();
        int start = 0;
        int max = 0;
        for(int end = 0;end < str.length();end++){
            Character curr = str.charAt(end);
            characterCounter.put(curr,characterCounter.getOrDefault(curr,0)+1);
            while(characterCounter.size()>k){
                Character left = str.charAt(start++);
                int counter = characterCounter.get(left);
                if(counter==1){
                    characterCounter.remove(left);
                }
                else{
                    characterCounter.put(left,counter-1);
                }
            }
            max = Math.max(max,end-start+1);
        }
        return max;
    }


    public static int findLength(char[] arr) {
        // TODO: Write your code here
        Map<Character,Integer> fruitCounter = new HashMap<>();
        int start = 0;
        int max = 0;
        for(int end = 0;end<arr.length;end++){
            fruitCounter.put(arr[end],fruitCounter.getOrDefault(arr[end],0)+1);
            while(fruitCounter.size()>2){
                char fruit = arr[start++];
                if(fruitCounter.get(fruit)==1){
                    fruitCounter.remove(fruit);
                }
                else{
                    fruitCounter.put(fruit,fruitCounter.get(fruit)-1);
                }
            }
            max = Math.max(max,end-start+1);
        }
        return max;
    }

    //aabccbb
    public static int findLength(String value) {
        Map<Character,Integer> characterCounter = new HashMap<>();
        int start = 0;
        int maxLength = 0;
        for(int end = 0;end<value.length();end++){
            char currChar = value.charAt(end);
            if(characterCounter.containsKey(currChar)){
                start = characterCounter.get(currChar)+1;
            }
            characterCounter.put(currChar,end);
            maxLength = Math.max(maxLength,end-start+1);
        }
        return maxLength;
    }


    public static int findLength1(String str, int k) {
        int maxLength = 0;
        int start = 0;
        int maxRepeating = 0;
        Map<Character,Integer> characterCount = new HashMap<>();
        for(int end = 0;end<str.length();end++){
            char currChar = str.charAt(end);
            characterCount.put(currChar,characterCount.getOrDefault(currChar,0)+1);
            maxRepeating = Math.max(maxRepeating,characterCount.get(currChar));
            if(end-start+1-maxRepeating>k){
                char startChar = str.charAt(start++);
                characterCount.put(startChar,characterCount.get(startChar)-1);
            }
            maxLength = Math.max(maxLength,end-start+1);
        }
        return maxLength;
    }

    public static int findLength(int[] arr, int k) {
        int maxLength = 0;
        int start = 0;
        int ones = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                ones++;
            }
            if(i-start+1-ones>k){
                if(arr[start++]==1){
                    ones--;
                }
            }
            maxLength = Math.max(maxLength,i-start+1);
        }
        return maxLength;
    }





    public static void main(String[] args) {
        String s = "araaci";
        System.out.println(findLength(s,1));
        Map<Integer,Integer> testing = new HashMap<>();
        testing.put(1,1);
        System.out.println(testing.getOrDefault(1,1));
        List<Integer> test  = new ArrayList<>();
        test.add(10);
        ListIterator<Integer> itr = test.listIterator();
    }
}
