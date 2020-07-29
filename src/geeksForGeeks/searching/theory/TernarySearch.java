package geeksForGeeks.searching.theory;

public class TernarySearch {

    public static int ternarySearchRec(int[] arr,int start,int end,int ele){
        if(start<=end){
            int mid1 = start+ (end-start)/3;
            int mid2 = end - (end-start)/3;

            if(arr[mid1] == ele){
                return mid1;
            }
            else if(arr[mid2] == ele){
                return mid2;
            }
            if(arr[mid1]>ele){
                return ternarySearchRec(arr,start,mid1-1,ele);
            }
            else if(ele>arr[mid2]){
                return ternarySearchRec(arr,mid2+1,end,ele);
            }
            else {
                return ternarySearchRec(arr,mid1+1,mid2-1,ele);
            }
        }
        return -1;
    }

    public static int ternarySearchIterative(int[] arr,int start,int end,int ele){
        int arrStart = start;
        int arrEnd = end;
        while(arrStart<=arrEnd){
            int mid1 = arrStart+ (arrEnd-arrStart)/3;
            int mid2 = arrEnd - (arrEnd-arrStart)/3;
            if(arr[mid1] == ele){
                return mid1;
            }
            else if(arr[mid2] == ele){
                return mid2;
            }
            if(arr[mid1]>ele){
                arrEnd = mid1-1;
            }
            else if(ele>arr[mid2]){
                arrStart = mid2+1;
            }
            else {
                arrStart = mid1+1;
                arrEnd = mid2-1;
            }
        }
        return -1;
    }
}
