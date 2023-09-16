import java.util.HashSet;

public class Contains_Duplicate { // https://leetcode.com/problems/contains-duplicate/?envType=list&envId=r3vkj01i
  
    public static boolean containsDuplicate(int[] nums) {
        HashSet set = new HashSet();
        for(int i : nums){
            set.add(i);
        }

        return nums.length != set.size();
    }

}
