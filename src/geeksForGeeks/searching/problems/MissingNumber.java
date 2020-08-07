package geeksForGeeks.searching.problems;

import java.util.Arrays;

public class MissingNumber {

    static int missingNumberNaive(int arr[], int size) {
        int start = 1;
        while(start<=size){
            boolean found = false;
            for(int i=0;i<size;i++){
                if(arr[i]==start){
                    start++;
                    found = true;
                }
            }
            if(!found){
                return start;
            }
        }
        return start;
    }

    static int missingNumberSort(int arr[], int size) {
        Arrays.sort(arr);
        int prev = 1;
        int curr = 1;
        for(int j=0;j<size;j++){
            if(arr[j]>0){
                if((arr[j]!=curr && arr[j]!=prev)){
                    return curr;
                }
                else if(arr[j]==curr && curr==prev){
                    curr +=1;
                }
                else if(arr[j]==prev){
                    continue;
                }
                else{
                    prev = curr;
                    curr++;
                }
            }
        }
        return curr;
    }
}
