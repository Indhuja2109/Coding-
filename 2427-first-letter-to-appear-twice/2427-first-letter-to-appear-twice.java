class Solution {
    public char repeatedCharacter(String s) {
        HashSet<Character> st=new HashSet<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(st.contains(c)){
                return c;
            }
            else{
                st.add(c);
            }
        }
        return '\0';
    }
}