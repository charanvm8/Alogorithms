package geeksForGeeks.arrays;

public class RemoveDuplicates {

    public static int removeDuplicates(int[] arr){
        int index = 0;
        int len = arr.length;
        for(int i=1;i<len;i++){
            if(arr[index]!=arr[i]){
                arr[++index] = arr[i];
            }
        }
        return index+1;
    }
}
