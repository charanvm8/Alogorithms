package practice;

public class MergeTwoArrays {

    public static int[] mergeTwoArrays(int[] a, int[] b){
        int arr1Len = a.length;
        int arr2Len = b.length;
        int arr2Count = 0;
        int resultArrCount = 0;
        int[] newArr = new int[arr1Len+arr2Len];
        for(int i=0;i<arr1Len;i++){
            if(arr2Count<arr2Len){
                if(a[i]<=b[arr2Count]){
                    newArr[resultArrCount] = a[i];
                    resultArrCount++;
                }
                else{
                    newArr[resultArrCount] = b[arr2Count];
                    arr2Count++;
                    resultArrCount++;
                    i--;
                }
            }
        }
        return newArr;
    }

    public static void printArr(int[] arr){
        for(int i:arr){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {10,20,40,60,65,68,81};
        int[] arr2 = {5,6,7};
        int[] result = mergeTwoArrays(arr1,arr2);
        printArr(result);
    }
}
