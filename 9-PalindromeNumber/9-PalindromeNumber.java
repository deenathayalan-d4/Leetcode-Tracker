// Last updated: 09/07/2026, 15:10:26
import java.util.Scanner;
class Solution {
    public boolean isPalindrome(int x) {
        int original = x;
        int reversed = 0;

        while (x > 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x = x / 10;
        }

        return original == reversed;     
  }
}