class Solution {
    public int chalkReplacer(int[] chalks, int k) {
        long sum=0;
        for(int i=0; i<chalks.length; i++){
            sum+=chalks[i];
        }
        k%=sum;
        int i=0;
        for(i=0; i<chalks.length; i++){
            if(k>=chalks[i]){
                k-=chalks[i];
            }else{
                break;
            }
        }
        return i;
    }
}