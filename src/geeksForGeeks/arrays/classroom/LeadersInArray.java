package geeksForGeeks.arrays.classroom;

public class LeadersInArray {

    //Naive Method
    public static void leadersInArray1(int[] arr){
        for(int i=0;i<arr.length;i++){
            boolean isGreater = true;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    isGreater = false;
                    break;
                }
            }
            if(isGreater){
                System.out.println(arr[i]);
            }
        }
    }

    public static void leadersInArray(int[] arr){
        int prev = Integer.MIN_VALUE;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>prev){
                System.out.println(arr[i]);
                prev = arr[i];
            }
        }
    }
}
