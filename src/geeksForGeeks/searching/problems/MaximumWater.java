package geeksForGeeks.searching.problems;

public class MaximumWater {

    static int maxWater(int height[], int n)
    {
        int res = 0;
        int start = 0;
        int end = n-1;

        while(start<end){
            int diff = end-start-1;
            if(diff>0){
                res = Math.max(res,diff*(Math.min(height[start],height[end])));
            }
            if(height[start]>height[end]){
                end--;
            }
            else{
                start++;
            }
        }
        return res;
    }
}
