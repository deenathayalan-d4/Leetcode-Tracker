// Last updated: 09/07/2026, 15:05:31
class Solution {
    public boolean checkGoodInteger(int n) {
        int d=0;
        int s=0;
        while(n>0){
            int digit=n%10;
            d+=digit;
            s+=digit*digit;
            n/=10;
        }
        return (s-d)>=50;
    }
}