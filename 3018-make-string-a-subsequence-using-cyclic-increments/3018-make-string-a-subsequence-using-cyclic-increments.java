class Solution {
    public boolean canMakeSubsequence(String source, String target) {
        int i = 0, j = 0;
        int n = source.length(), m = target.length();
        
        while (i < n && j < m) {
            // Current character in str1
            char currentChar = source.charAt(i);
            // Next character cyclically (handling 'z' to 'a')
            char nextChar = (currentChar == 'z') ? 'a' : (char) (currentChar + 1);
            
            // Check if the character matches str2[j] directly or after increment
            if (currentChar == target.charAt(j) || nextChar == target.charAt(j)) {
                j++;
            }
            i++;
        }
        
        // If we traversed all characters in str2, return true
        return j == m;
    }
}