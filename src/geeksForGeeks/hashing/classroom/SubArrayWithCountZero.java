package geeksForGeeks.hashing.classroom;

public class SubArrayWithCountZero {

    public static boolean subArrWithZero(int[] arr){
        for(int i=0;i<arr.length;i++){
            int sum = 0;
            for(int j=i;j<arr.length;j++){
                sum = sum+arr[j];
                if(sum==0){
                    return true;
                }
            }
        }
        return false;
    }
}
