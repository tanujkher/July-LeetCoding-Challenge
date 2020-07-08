import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class three_sum{
    public static void main(String[] args) {
        System.out.println("Simple three pointer approach");
    }
}

class st {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        for(int val : nums){
            System.out.print(val + " ");
        }
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i <= nums.length - 3; i++){
            if(i == 0 || (i > 0 && nums[i] != nums[i - 1])){
            int ele = nums[i];
            int l = i + 1;
            int r = nums.length - 1;
            while(l < r){
                if(ele + nums[l] + nums[r] == 0){
                    ans.add(Arrays.asList(ele,nums[l],nums[r]));
                    while(l < r && nums[l] == nums[l + 1]){
                        l++;
                    }
                    while(l < r && nums[r] == nums[r - 1]){
                        r--;
                    }
                    l++;
                    r--;
                }else if(nums[l] + nums[r] + ele < 0){
                    l++;
                }else{
                    r--;
                }
            }
        }
        }
        return ans;
    }
}