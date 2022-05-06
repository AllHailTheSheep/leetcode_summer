package week1;

public class binary_search {
    // This algorithm is O(log2(n)) time as the while loop will half the size of the array each time,
    // meaning the loop will execute log2(n) times where n is the number of elements in the array.
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int index = -1;
        while (start <= end) {
            int mid = start  + ((end - start) / 2);
            if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] == target) {
                index = mid;
                break;
            }
        }
        return index;
    }
}
