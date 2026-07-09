// Last updated: 09/07/2026, 15:05:50
class Solution {
    public String winningPlayer(int x, int y) {
        int turn = Math.min(x,y/4);
        return (turn%2!=0)?"Alice":"Bob";
    }
}