package geeksForGeeks.arrays.classroom;

public class FrequenciesInSorted {

    //Naive
    public static void frequenciesInSorted(int[] arr){
        int initial = arr[0];
        int counter = 1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=initial){
                System.out.println(initial+" "+counter);
                initial = arr[i];
                counter = 1;
            }
            else{
                counter++;
            }
        }
        System.out.println(initial+" "+counter);
    }
}
