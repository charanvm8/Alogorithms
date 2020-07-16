package geeksForGeeks.arrays;

public class Monotonic {
    public static boolean isMonotonic(int[] array) {
        if(array.length<=2){
            return true;
        }
        boolean neg = array[2]-array[1]<0;
        for(int i=1;i<array.length;i++){
            if(neg){
                if(array[i-1]<array[i]){
                    return false;
                }
            }
            else{
                if(array[i-1]>array[i]){
                    return false;
                }
            }
        }
        return true;
    }
}
