public class Find_Minimum_in_Rotated_Sorted_Array {

    public static void main(String[] args) {
        Find_Minimum_in_Rotated_Sorted_Array f = new Find_Minimum_in_Rotated_Sorted_Array();
        int[] nums = {4, 5, 6, 7,  1, 2};
        System.out.println(f.findMin(nums));
    }
    public int findMin(int[] nums) {
        return binarySearch(0, nums.length - 1, nums);
    }

    private int binarySearch(int low, int high, int[] nums) {

        int index = ((high - low) / 2) + low;

        if (high == low) {
            return nums[low];
        }
        if (high - low == 1) {
            return Math.min(nums[low], nums[high]);
        }

        if (nums[index] > nums[high]) {
            low = index;
        } else {
            high = index;
        }
        return binarySearch(low, high, nums);
    }

}
