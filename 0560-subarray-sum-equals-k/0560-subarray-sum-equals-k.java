import java.util.HashMap;

class Solution {
    public int subarraySum(int[] nums, int k) {
        int prefixsum = 0;
        int count = 0;
        
        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();
        
        prefixSumMap.put(0, 1);
        
        for (int num : nums) {

            prefixsum += num;
            if (prefixSumMap.containsKey(prefixsum - k)) {
                count += prefixSumMap.get(prefixsum - k);
            }
            
            prefixSumMap.put(prefixsum, prefixSumMap.getOrDefault(prefixsum, 0) + 1);
        }
        
        return count;
    }
}
