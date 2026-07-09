// Last updated: 09/07/2026, 15:07:39
class Solution {
    public int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (s.indexOf(ch) == s.lastIndexOf(ch)) {
                return i;
            }
        }
        return -1;
    }
}
