import java.util.HashSet;

public class Contains_Duplicate { // https://leetcode.com/problems/contains-duplicate/?envType=list&envId=r3vkj01i
  
    public static boolean containsDuplicate(int[] nums) {
        HashSet set = new HashSet();
        for(int i : nums){
            set.add(i);
        }

        return nums.length != set.size();
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(nums));
    }
}
