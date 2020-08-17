package geeksForGeeks.arrays.problems;

import java.util.ArrayList;

public class ReverseArrayInGroups {

    public static ArrayList<Integer> reverseInGroups(ArrayList<Integer> mv, int n, int k) {
        // add your code here
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int diff=Math.min(n,k);
        int pres = 0;
        for(int i=diff-1;i<n;){
            int temp = i;
            while(temp>=pres){
                arrayList.add(mv.get(temp));
                temp--;
            }
            i=i+diff;
            pres = pres+diff;
        }
        while(pres<n){
            arrayList.add(mv.get(pres++));
        }
        return arrayList;
    }


}
