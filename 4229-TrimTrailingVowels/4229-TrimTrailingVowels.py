# Last updated: 09/07/2026, 15:05:37
class Solution:
    def trimTrailingVowels(self, s: str) -> str:
        n = len(s)
        i = n - 1
        while i >= 0:
            if s[i]=='a' or s[i]=='e' or s[i]=='i' or s[i]=='o' or s[i]=='u':
                i = i - 1
            else:
                break
        result = ""
        j = 0
        while j <= i:
            result = result + s[j]
            j = j + 1
        return result