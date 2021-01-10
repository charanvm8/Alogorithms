package geeksForGeeks.searching;

public class Main {

    //Problem 1
    // Binary Search Recursion
    public static int search(int[] arr,int start,int end,int target){
        if(start>end){
            return -1;
        }
        int mid = (end+start)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[mid]>target){
            return search(arr,start,mid-1,target);
        }
        return search(arr,mid+1,end,target);
    }

    //Problem 2
    // Binary Search Iterative
    public static int search1(int[] arr,int start,int end,int target){
        while(start<=end){
            int mid = (end+start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]>target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }

    //Problem 3
    // First Occurrence of the element(recursion)
    public static int firstOcc(int[] arr,int start,int end,int target){
        if(start>end){
            return -1;
        }
        int mid = (end-start)/2;
        if(arr[mid]>target){
            return firstOcc(arr,start,mid-1,target);
        }
        else if(arr[mid]<target){
            return firstOcc(arr,mid+1,end,target);
        }
        else if(mid==0 || arr[mid-1]!=arr[mid]){
            return mid;
        }
        else{
            return firstOcc(arr,start,mid-1,target);
        }
    }

    //Problem 4
    // First Occurrence of the element(Iterative)
    public static int firstOccIterative(int[] arr,int start,int end,int target){
        while (start<=end){
            int mid = (end+start)/2;
            if(arr[mid]>target){
                end = mid-1;
            }
            else if(arr[mid]<target){
                start = mid+1;
            }
            else if(mid==0 || arr[mid-1]!=arr[mid]){
                return mid;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }


    //Problem 5
    // Last Occurrence of the element(recursion)
    public static int lastOcc(int[] arr,int start,int end,int target,int len){
        if(start>end){
            return -1;
        }
        int mid = (end-start)/2;
        if(arr[mid]>target){
            return lastOcc(arr,start,mid-1,target,len);
        }
        else if(arr[mid]<target){
            return lastOcc(arr,mid+1,end,target,len);
        }
        else if(mid==len-1 || arr[mid+1]!=arr[mid]){
            return mid;
        }
        else{
            return lastOcc(arr,start,mid+1,target,len);
        }
    }

    //Problem 6
    // Last Occurrence of the element(Iterative)
    public static int lastOccIterative(int[] arr,int start,int end,int target,int len){
        while (start<=end){
            int mid = (end+start)/2;
            if(arr[mid]>target){
                end = mid-1;
            }
            else if(arr[mid]<target){
                start = mid+1;
            }
            else if(mid==len-1 || arr[mid+1]!=arr[mid]){
                return mid;
            }
            else{
                end = mid+1;
            }
        }
        return -1;
    }

    // Problem 7
    // Count occurrences of target
    public static int countOccurrences(int[] arr,int target,int len){
        int firstOcc = firstOccIterative(arr,0,len-1,target);
        if(firstOcc==-1){
            return 0;
        }
        int lastOcc = lastOccIterative(arr,0,len-1,target,len);
        return lastOcc-firstOcc+1;
    }

    // Problem 8
    // Count occurrences of 1's
    public static int count1s(int[] arr,int target,int len){
        int firstOcc = firstOccIterative(arr,0,len-1,target);
        if(firstOcc==-1){
            return 0;
        }
        return len-firstOcc;
    }

    // Problem 9
    // find nearest Square root(rec)
    public static int squareRoot(int r,int start, int end){
        if(start==end){
            return start;
        }
        int mid = (end+start)/2;
        int val = mid*mid;
        if(val>r){
            return squareRoot(r,start,mid-1);
        }
        else if(val<r){
            return squareRoot(r,mid+1,end);
        }
        return mid;
    }

    // Problem 10
    // find nearest Square root(Iterative)
    public static int squareRootIterative(int r,int start, int end){
        int res = -1;
        while (start<end){
            int mid = (end+start)/2;
            int val = mid*mid;
            if(val>r){
                end = mid-1;
            }
            else if(val<r){
                start = mid+1;
                res = mid;
            }
            else{
                return mid;
            }
        }
        return res;
    }

    // Problem 11
    // Search in infinite sized Array(Iterative)
    public static int searchInInfinite(int[] arr,int target){
        if(arr[0]==target){
            return 0;
        }
        int index = 1;
        while (arr[index]<=target){
            index*=2;
        }
        if(arr[index]==target){
            return index;
        }
        return search(arr,index/2+1,index-1,target);
    }

    // Problem 12
    // Search in Sorted Rotated Array
    public static int searchInRotated(int[] arr,int start,int end,int target){
        while (start<=end){
            int mid = (end+start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid]>arr[start]){
                if(arr[mid]>target && arr[start]<=target){
                    return searchInRotated(arr,start,mid-1,target);
                }
                else{
                    return searchInRotated(arr,mid+1,end,target);
                }
            }
            else {
                if(arr[mid]<target && target<arr[end]){
                    return searchInRotated(arr,mid+1,end,target);
                }
                else{
                    return searchInRotated(arr,start,mid-1,target);
                }
            }
        }
        return -1;
    }

    // Problem 14
    // Peak Element in Array
    public static int peakElement(int[] arr){
        //TODO
        return -1;
    }

    // Problem 15
    // find if pair exists in sorted arr using two pointer approach
    public static boolean twoPointer(int[] arr,int sum,int len){
        if(len<=1){
            return false;
        }
        int start = 0;
        int end = len-1;
        while (start<=end){
            int currSum = arr[start]+arr[end];
            if(currSum==sum){
                return true;
            }
            else if(currSum>sum){
                end--;
            }
            else{
                start++;
            }
        }
        return false;
    }

    // Problem 16
    // find if pair exists in sorted arr using two pointer approach
    public static int medianOfTwoSortedArrs(int[] arr,int[] arr2,int start,int start2,int end,int end2){
        int currMed = -1;
        int curr2Med = -1;
        while(start<=end && start2<=end){
            int arrMid = (end+start)/2;
            int arr2Mid = (end2+start2)/2;
            if(arr[arrMid] == arr2[arr2Mid]){
                return arr[arrMid];
            }
            else if(arr[arrMid]<arr2[arr2Mid]){
                start = arrMid+1;
                end2 = arr2Mid-1;
            }
            else{
                start2 = arr2Mid+1;
                end = arrMid-1;
            }
            currMed = arr[arrMid];
            curr2Med = arr2[arr2Mid];
        }
        if((arr.length+arr2.length)%2!=0){
            return currMed;
        }
        else{
            return (curr2Med+currMed)/2;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1000,2000,10,20,100,200,500,600};
//        System.out.println(search(arr,0,arr.length-1,7));
//        System.out.println(squareRootIterative(24,1,24));
        //System.out.println(searchInRotated(arr,0,arr.length-1,10));

//        int[] arr2 = {2,5,8,12,30};
//        System.out.println(twoPointer(arr2,17,arr2.length));

        int[] mid = {1,2,3,4,5,6};
        int[] mid2 = {10,20,30,40};
        System.out.println(medianOfTwoSortedArrs(mid,mid2,0,0,mid.length-1,mid2.length-1));
    }
}
