package geeksForGeeks.hashing.classroom;

import java.util.HashSet;
import java.util.Set;

public class CountDistincts {

    public static int countDistincts(int[] arr){
        Set<Integer> strs= new HashSet<>();

        for(int i=0;i<arr.length;i++){
            strs.add(arr[i]);
        }
        return strs.size();
    }
}
