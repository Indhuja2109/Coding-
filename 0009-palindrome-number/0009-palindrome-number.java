class Solution {
  public boolean isPalindrome(int x) {
   if(x<0){
      return false;
   }

   int y=x;
   long rev=0;

   while(y>0){
    int rem=y%10;
    rev=rev*10+rem;
    y/=10;
   }
   
    return rev==x;
  }
}