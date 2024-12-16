class Solution {
    public int findMaxLength(int[] nums) {
        
        Map<Integer,Integer> preMap=new HashMap<Integer,Integer>();
        int maxlength=0;
        int prefixsum=0;
        preMap.put(0,-1);

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                prefixsum+=-1;
            }
            else{
                prefixsum+=1;
            }

            if(preMap.containsKey(prefixsum)){
                 int index=preMap.get(prefixsum);
                 int length=i-index;
                 maxlength=Math.max(maxlength,length);

            }else{
                preMap.put(prefixsum,i);
            }
        }
        return maxlength;
    }
}