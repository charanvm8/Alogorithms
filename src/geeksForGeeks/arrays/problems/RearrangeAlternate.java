package geeksForGeeks.arrays.problems;

public class RearrangeAlternate {

    public static void rearrange(int arr[], int n){
        int last = 0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                int temp = arr[n-1-last];
                arr[n-1-last] = arr[i];
                last++;
                arr[i] = temp;
            }
            else{
                int temp = arr[i];
                arr[i] = arr[n-1];
                arr[n-1] = temp;
            }
        }
    }
}
