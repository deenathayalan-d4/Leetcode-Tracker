// Last updated: 09/07/2026, 15:10:28
class Solution {
    public int myAtoi(String s) {
        int i = 0, n = s.length();

        // Skip leading spaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // Handle sign
        int sign = 1;
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        long result = 0;

        // Process digits
        while (i < n && Character.isDigit(s.charAt(i))) {
            result = result * 10 + (s.charAt(i) - '0');

            // Clamp to 32-bit signed integer range
            if (sign * result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (sign * result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            i++;
        }

        return (int) (sign * result);
    }
}