// Last updated: 09/07/2026, 15:09:24
class Solution {
    public int lengthOfLastWord(String s) {
        int len = 0;
        int i = s.length() - 1;

        // Skip trailing spaces
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // Count last word length
        while (i >= 0 && s.charAt(i) != ' ') {
            len++;
            i--;
        }

        return len;
    }
}