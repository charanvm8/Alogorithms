package geeksForGeeks.searching.classroom;

public class MedianOfTwoArrays {

    // naive
    public static double medianOfTwoArrays(int[] arr1,int[] arr2){
        int len1 = arr1.length;
        int len2 = arr2.length;
        int[] arr = new int[len1+len2];
        int i,j,k;
        i = j = k = 0;
        while (i<=len1-1 && j<=len2-1){
            if(arr1[i]<arr2[j]){
                arr[k++]=arr1[i];
                i++;
            }
            else{
                arr[k++]= arr2[j];
                j++;
            }
        }
//        while (){
//
//        }
//        while (){
//
//        }

        if(len1+len2%2==0){
            int mid1 = arr.length/2;
            //int mid2 =
        }
        else{
            int mid = arr.length/2;
            return (double) arr[mid+1];
        }

        return 0.0;
    }


}
