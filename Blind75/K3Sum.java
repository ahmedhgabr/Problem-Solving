import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class K3Sum {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> resultSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int j = i+1;
            int k = nums.length - 1;
            while (j < k) {
                if(j > 0 || k < 0){
                    break;
                }
                if (nums[i] + nums[j] + nums[k] == 0) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    resultSet.add(temp);
                    j++;
                    k--;
                } else if (nums[i] + nums[j] + nums[k] < 0) {
                    j++;
                } else {
                    k--;
                }
            }

        }

        List<List<Integer>> result = new ArrayList<>();
        result.addAll(resultSet);

        return result;
    }

}
