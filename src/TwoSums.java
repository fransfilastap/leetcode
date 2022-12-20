import java.util.HashMap;
import java.util.Stack;

public class TwoSums {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> dict = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int remain = target - nums[i];
            if (dict.containsKey(remain)) {
                return new int[]{dict.get(remain), i};
            }
            dict.put(nums[i], i);
        }

        return new int[]{0, 0};
    }
}
