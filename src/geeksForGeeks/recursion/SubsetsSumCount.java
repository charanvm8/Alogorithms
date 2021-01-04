package geeksForGeeks.recursion;

public class SubsetsSumCount {

    public static int countSubSetsSum(int[] numbers,int index,int target){
        if(index==0){
            return target == 0 ? 1 : 0;
        }

        return countSubSetsSum(numbers,index-1,target-numbers[index-1])+
                countSubSetsSum(numbers,index-1,target);

    }

    public static void main(String[] args) {
        int[] arr={10,20,15};
        System.out.println(countSubSetsSum(arr,arr.length,0));
    }
}
