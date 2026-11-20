class Solution {
    public int maximumWealth(int[][] accounts) {
        int mw=0;
        int rows=accounts.length;
        int cols=accounts[0].length;
        for(int i=0;i<rows;i++){
            int w=0;
            for(int j=0;j<cols;j++){
                w+=accounts[i][j];
            }
            mw=Math.max(mw,w);
        }
        return mw;
    }
}