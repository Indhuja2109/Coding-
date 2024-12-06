class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        Set<Integer> ban=new HashSet<Integer>();

        for(int num:banned){
            ban.add(num);
        }
        int count=0;
        int sum=0;

        for(int i=1;i<=n;i++){
            if(!ban.contains(i) && sum+i <=maxSum){
                sum+=i;
                count++;

            }
            if(sum>maxSum){
                break;
            }
        }
        return count;
    }
}