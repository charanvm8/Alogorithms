package introductionToAlgos.chapter1;

public class LinearSearch {

    public static int searchForElement(int[] arr,int ele){
        for(int j=0;j<arr.length;j++){//
            if(arr[j]==ele){//maintenance
                return j;
            }
        }
        return -1;// termination
    }

    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6 };
        System.out.println(searchForElement(arr,5));
    }
}
