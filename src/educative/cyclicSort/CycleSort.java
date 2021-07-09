package educative.cyclicSort;

public class CycleSort {

    public static void sort(int[] nums) {
        // TODO: Write your code here
        int i = 0;
        while (i < nums.length) {
            int j = nums[i] - 1;
            if (nums[i] != nums[j])
                swap(nums, i, j);
            else
                i++;
        }
    }



    public static void swap (int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2};
        sort(arr);
        for (int i : arr) {
            System.out.println(i+ " ");
        }
        System.out.println('a' - 97);
    }
}
