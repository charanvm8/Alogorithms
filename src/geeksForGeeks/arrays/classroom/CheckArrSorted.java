package geeksForGeeks.arrays.classroom;

public class CheckArrSorted {

    // Solution1
    public static boolean checkIfArrSorted(int[] arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]>arr[i]){
                return false;
            }
        }
        return true;
    }

    // Solution 2
    public static boolean checkIfArrSorted2(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    return false;
                }
            }
        }
        return true;
    }

}
