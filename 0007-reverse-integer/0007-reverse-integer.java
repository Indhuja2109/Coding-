class Solution {
    public int reverse(int x) {
        int n=Math.abs(x);
       long finalnum=0;
       while(n>0){
        int rem=n%10;
        finalnum+=rem;
        finalnum=finalnum*10;
        n=n/10;
       }

       finalnum=finalnum/10;
       if(finalnum>Integer.MAX_VALUE || finalnum<Integer.MIN_VALUE){
        return 0;
       }

       if(x<0){
        return (int)(-1*finalnum);
       }
       return (int)finalnum;
    }
}