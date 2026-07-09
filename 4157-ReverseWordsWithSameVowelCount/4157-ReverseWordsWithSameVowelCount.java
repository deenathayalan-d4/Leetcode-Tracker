// Last updated: 09/07/2026, 15:05:42
class Solution {
    public String reverseWords(String s) {
        String[] n = s.split(" ");
        int first = (int)n[0].chars().filter(d->"aeiou".indexOf(d) >=0).count();
        for(int i=1;i<n.length;i++){
            int cc=(int) n[i].chars().filter(d->"aeiou".indexOf(d)>=0).count();
            if (cc==first)
                n[i] = new StringBuilder(n[i]).reverse().toString();
        }
        return String.join(" ",n);
    }
}