package geeksForGeeks.searching.problems;

public class MedianOfSortedArrays {
    public static int findMedian(int arr[], int n, int brr[], int m){
        return findEleAt(arr,0,n,brr,0,m,1);
    }

    public static int findEleAt(int arr1[],int start1,int end1,int arr2[],int start2,int end2,int pos){
        int arr1Size = end1-start1;
        int arr2Size = end2-start2;
        if(arr1Size==0){
            return arr2[pos-1];
        }
        else if(arr2Size==0){
            return arr1[pos-1];
        }

        int mid1 = start1+((end1-start1)/2);
        int mid2 = start2+((end2-start2)/2);

        if(arr2[mid2]>arr1[mid1]){
            return findEleAt(arr1,mid1+1,end1,arr2,start2,mid2,pos-(mid1));
        }
        else{
            return findEleAt(arr1,start1,mid1,arr2,mid2+1,end2,pos-(mid2));
        }
    }
}
