public class Find_Minimum_in_Rotated_Sorted_Array {

    public int findMin(int[] nums) {
        return bSearch(0, nums.length - 1, nums);
    }

    private int bSearch(int i, int j, int[] nums) {
        int index = ((j - i) / 2) + i;
        if (j == i) {
            return nums[i];
        }
        if (j - i == 1) {
            return Math.min(nums[i], nums[j]);
        }

        if (nums[index] > nums[j]) {
            i = index;
        } else {
            j = index;
        }

        return bSearch(i, j, nums);
    }

}
