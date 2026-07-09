// Last updated: 09/07/2026, 15:06:31
class Solution {
    public int minCostToMoveChips(int[] position) {
        int even = 0;
        int odd = 0;
        for(int n : position){
            if(n%2==0){
              even++;
            }else{
               odd++;
            }
        }
        return even>odd?odd:even;
    }   


}