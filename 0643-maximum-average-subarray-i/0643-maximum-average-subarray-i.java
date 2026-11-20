class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) sum += nums[i];
        int max=sum;
        int si=0;
        int ei=k;
        while(ei<nums.length){
            sum-=nums[si];
            si++;
            sum+=nums[ei];
            ei++;
            max=Math.max(max,sum);
        }
        return (double)max/k;    
    }
}