package week1;

public class sort_colors {
    public static void sortColors(int[] nums) {
        // This algorithm sorts from least to greatest using a swapping in-place algotithm. Time complexity is o(n^2).
        int len = nums.length;

        boolean done = false;
        while (!done) {
            int high_index = 0;
            for (int i = 0; i < len; i++) {
                if (nums[i] > nums[high_index]) {
                   high_index = i;
                }
            }

            int last_digit = nums[len - 1];
            nums[len - 1] = nums[high_index];
            nums[high_index] = last_digit;
            
            if (len - 1 > 0) {
                len--;
            } else {
                done = true;
            }
        } 
    }
}
