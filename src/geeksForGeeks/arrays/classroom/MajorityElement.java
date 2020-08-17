package geeksForGeeks.arrays.classroom;

public class MajorityElement {

    //naive
    static int majEle(int[] arr){
        for(int i=0;i<arr.length;i++){
            int count = 0;
            for(int j=i;j<arr.length;j++){
                if(arr[j]==arr[i]){
                    count++;
                }
            }
            if(count>(arr.length/2)){
                return i;
            }
        }
        return -1;
    }

    static int majorityElement(int[] arr){
        int index = 0;
        int curr = arr[0];
        int counter = 1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==curr){
                counter++;
            }
            else if(arr[i]!=curr && counter>1){
                counter--;
            }
            else{
                index = i;
                curr = arr[i];
            }
        }
        return counter>1?index:-1;
    }
}
