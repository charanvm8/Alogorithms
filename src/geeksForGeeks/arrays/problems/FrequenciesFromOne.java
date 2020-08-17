package geeksForGeeks.arrays.problems;

public class FrequenciesFromOne {

    public static void frequencycount(int arr[], int n)
    {
        for(int i=0;i<n;i++){
            int currIndex = (arr[i]%n);
            if(currIndex%n>0){
                arr[(arr[i]%n)-1]+=n;
            }
            else{
                arr[currIndex+n-1]+=n;
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]%n==0){
                arr[i] = (arr[i]-n)/n;
            }
            else{
                arr[i]/=n;
            }
        }
    }
}
