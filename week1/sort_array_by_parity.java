package week1;

public class sort_array_by_parity {
    public static int[] sortArrayByParity(int[] nums) {
        // This algotithm has a O(n) time complexity as it has one for loop, so the run time will
        // be dependent on the size of the array determining the for loop limits.
        int[] result = new int[nums.length];
        int odd_index = nums.length - 1;
        int even_index = 0;
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            if (temp % 2 == 0) {
                result[even_index] = temp;
                even_index++;
            } else {
                result[odd_index] = temp;
                odd_index--;
            }
        }
        return result;
    }
}