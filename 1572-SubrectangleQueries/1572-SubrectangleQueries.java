// Last updated: 09/07/2026, 15:06:25
class SubrectangleQueries {
    private int[][] grid;

    public SubrectangleQueries(int[][] rectangle) {
        this.grid=rectangle;
    }
    
    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        for(int r=row1;r<=row2;r++){
        for(int c=col1;c<=col2;c++){
            this.grid[r][c]=newValue;
        }
    }
}
    public int getValue(int row, int col) {
        return this.grid[row][col];
    }
}

/**
 * Your SubrectangleQueries object will be instantiated and called as such:
 * SubrectangleQueries obj = new SubrectangleQueries(rectangle);
 * obj.updateSubrectangle(row1,col1,row2,col2,newValue);
 * int param_2 = obj.getValue(row,col);
 */