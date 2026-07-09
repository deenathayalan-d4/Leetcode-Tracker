// Last updated: 09/07/2026, 15:05:33
class Solution {
    public int maxDistance(String moves) {
        int h=0;
        int v=0;
        int w=0;
        int n=moves.length();
        for(int i=0;i<n;i++){
            char c=moves.charAt(i);
            if(c=='R') h++;
            else if(c=='L') h--;
            else if(c=='U') v++;
            else if(c=='D') v--;
            else w++;
        }
        return Math.abs(h)+Math.abs(v) + w;
    }
}