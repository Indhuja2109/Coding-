class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int l = s.length();
        for(int win = 1; win<=l/2; win++){
            if(l%win==0){
                String window = s.substring(0,win);
                StringBuilder str = new StringBuilder();
                for(int i=0; i<l/win; i++){
                    str.append(window);
                }
                if(str.toString().equals(s)) return true;
            }
        }
        return false;
    }
}