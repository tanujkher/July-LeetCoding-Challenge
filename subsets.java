import java.util.ArrayList;
import java.util.List;

public class subsets {
    public static void main(String[] args) {
        System.out.println("Simple recursive solution two calls include not include");
    }
}

class ti {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        getSubsets(ans, nums, new ArrayList<>(), 0);
        return ans;
    }
    private void getSubsets(List<List<Integer>> ans, int[] nums, List<Integer> cans, int curr){
        if(curr == nums.length){
            ans.add(cans);
            return;
        }
        List<Integer> bans = new ArrayList<>();
        for(int val : cans){
            bans.add(val);
        }
        bans.add(nums[curr]);
        getSubsets(ans, nums, bans, curr + 1);
        getSubsets(ans, nums, cans, curr + 1);
    }
}