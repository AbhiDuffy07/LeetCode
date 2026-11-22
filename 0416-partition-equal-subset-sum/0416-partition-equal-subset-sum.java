class Solution {
    public boolean canPartition(int[] nums) {
        int ts=0;
        for(int num :nums) ts+=num;
        if(ts%2!=0) return false;
        int tgt=ts/2;
        boolean[] dp=new boolean[tgt+1];
        dp[0]=true;
        for(int num : nums){
            for(int cs=tgt;cs>=num;cs--){
                dp[cs]=dp[cs]||dp[cs-num];
                if(dp[tgt]) return true;
            }
        }
        return dp[tgt];
    }
}