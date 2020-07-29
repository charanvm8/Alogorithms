package geeksForGeeks.searching.theory;

public class LinearSearch {

    public static int linearSearch(int[] arr,int ele){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==ele){
                return i+1;
            }
        }
        return -1;
    }
}
