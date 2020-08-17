package geeksForGeeks.arrays.classroom;

public class MaxConsOnes {

    public static int maxOnes(int[] arr){
        int counter = 0;
        int presConter = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                presConter++;
            }
            else{
                counter = Math.max(counter,presConter);
                presConter = 0;
            }
        }
        return Math.max(counter,presConter);
    }
}
