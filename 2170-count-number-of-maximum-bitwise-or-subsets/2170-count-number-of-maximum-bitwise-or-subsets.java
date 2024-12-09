class Solution {
    
    private void solve(int ind, int[] nums, int[] ans, int m, int maxor, int ds) {
        if (ind == m) {
            if (ds == maxor) {
                ans[0]++;
            }
            return;
        }        
        solve(ind + 1, nums, ans, m, maxor, ds | nums[ind]);        
        solve(ind + 1, nums, ans, m, maxor, ds);
    }

    public int countMaxOrSubsets(int[] nums) {
        int m = nums.length;
        int maxor = 0;
        for (int num : nums) {
            maxor |= num;
        }
        int ds = 0;
        int[] ans = {0};  
        solve(0, nums, ans, m, maxor, ds);
        return ans[0];
    }
}