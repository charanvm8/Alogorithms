package geeksForGeeks.arrays;

public class ArrayImp {

    public static void deleteElement(int[] arr,int ele){
        int index = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==ele){
                index=i;
                break;
            }
        }
        if(index==-1){
            return;
        }
        for(int i=index+1;i<arr.length;i++){
            arr[i-1]=arr[i];
            arr[i]=0;
        }
    }

    public static void removeDuplicates(int[] arr){
        if(arr.length<1){
            return;
        }
        int start = arr[0];
        int index = 1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>start){
                start = arr[i];
                arr[i]=0;
                arr[index++]=start;
            }
            else{
                arr[i]=0;
            }
        }
    }

    public static void leftRotateByOne(int[] arr){
        if(arr.length<=1){
            return;
        }
        int start = arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=start;
    }

    public static void leftRotateByN(int[] arr,int n) {
        int len = arr.length;
        if (len < 1 || n > len) {
            return;
        }
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = arr[i];
        }
        int tempIndex = 0;
        int storedArrIndex = 0;
        for (int i = n; i < arr.length; i++) {
            arr[tempIndex++] = arr[i];
        }
        for (int k = tempIndex; k < arr.length; k++) {
            arr[k] = temp[storedArrIndex++];
        }
    }

    public static int leaderInArray(int[] arr){
        if(arr.length<1){
            return 0;
        }
        if(arr.length==1){
            return arr[0];
        }
        int leader = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>leader){
                leader = arr[i];
            }
        }
        return leader;
    }

    public static int countConsecutiveOnes(int[] arr){
        if(arr.length<1){
            return 0;
        }
        int consecutives = 0;
        int maxConsecutives = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                consecutives++;
                maxConsecutives = Math.max(consecutives,maxConsecutives);
            }
            else{
                consecutives = 0;
            }
        }
        return maxConsecutives;
    }



    public static void main(String[] args) {
        int[] arr = {10,30,23,34,54,64};
        //leftRotateByOne(arr);
        leftRotateByN(arr,2);
        int[] arr1 = {10,20,20,30,30,30,30};
        removeDuplicates(arr1);
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        int[] arr3 = {0,1,1,1,0,1,1};
        System.out.println(countConsecutiveOnes(arr3));
    }
}
