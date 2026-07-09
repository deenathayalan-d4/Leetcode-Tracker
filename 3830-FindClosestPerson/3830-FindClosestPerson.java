// Last updated: 09/07/2026, 15:05:46
class Solution {
    public int findClosest(int x, int y, int z) {
        int disx = x-z;
        if(disx<0) disx = -disx;
        int disy = y-z;
        if(disy<0) disy = -disy;
        if(disx==disy){
            return 0;
        }else if(disx<disy){
            return 1;
        }else{
            return 2;
        }
    }
}