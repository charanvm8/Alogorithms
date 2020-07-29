package geeksForGeeks.searching.theory;

public class CountOccurances {


    public static int countOccurrances(int[] arr,int target){
        int getStartPosition = getInitialPosition(arr,target,0,arr.length-1);
        int getFinalPosition = getFinalPosition(arr,target,0,arr.length-1);
        System.out.println(getStartPosition);
        System.out.println(getFinalPosition);
        return (getFinalPosition-getStartPosition)+1;

    }

    public static int getInitialPosition(int[] arr,int target,int start,int end){
        if(end>=start){
            int mid = start+ ((end-start)/2);

            if(arr[mid]==target){
                int prevEle = getInitialPosition(arr,target,start+1,mid);
                return prevEle!=-1?prevEle:mid;
            }
            else if(arr[mid]>=target){
                return getInitialPosition(arr,target,start+1,mid);
            }
            else {
                return getInitialPosition(arr,target,mid+1,end);
            }
        }
        return -1;
    }

    public static int getFinalPosition(int[] arr,int target,int start,int end){
        if(start<=end){
            int mid = start+ ((end-start)/2);

            if(arr[mid]==target){
                int nextEle = getFinalPosition(arr,target,mid+1,end);
                return nextEle!=-1?nextEle:mid;
            }
            else if(target>=arr[mid]){
                return getFinalPosition(arr,target,mid+1,end);
            }
            else {
                return getFinalPosition(arr,target,start,mid-1);
            }
        }
        return -1;
    }
}
