package geeksForGeeks.searching.problems;

import java.util.ArrayList;

public class SubArray {

    static ArrayList<Integer> subarraySum(int n, int s, int[] m) {

        int arrSum = m[0];
        int start = 0;
        int index = 0;
        if(n>1){
            for(index=1;index<n;index++){
                int res = arrSum+m[index];
                if(arrSum+m[index]==s){
                    arrSum = s;
                    break;
                }
                if(res>s){
                    arrSum-=m[start++];
                    index--;
                }
                else{
                    arrSum = res;
                }
            }
        }


        ArrayList lst = new ArrayList();
        if(arrSum==s){
            lst.add(start+1);
            lst.add(index+1);
        }
        else{
            lst.add(-1);
        }
        return lst;
    }
}
