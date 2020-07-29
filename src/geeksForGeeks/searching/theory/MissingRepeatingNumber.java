package geeksForGeeks.searching.theory;

        import java.util.Arrays;

public class MissingRepeatingNumber {

    public static void missingRepeatingNumber(int[] nums){
        Arrays.sort(nums);
        int compare = 1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==compare){
                compare++;
            }
            else if(nums[i]-compare>0){
                System.out.println("Missing Number"+compare);
                i--;
                compare++;
            }
            else{
                System.out.println("repeat"+(compare-1));
            }
        }
    }
}
