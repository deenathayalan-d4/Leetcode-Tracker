// Last updated: 09/07/2026, 15:06:19
class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int total = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j||(i+j)==n-1)
                total+=mat[i][j];
            }
        }
        return total;
    }
}