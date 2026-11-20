class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer,Integer> remim=new HashMap<>();
        remim.put(0,-1);
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int rem=sum%k;
            if(remim.containsKey(rem)){
                if(i-remim.get(rem)>1){
                    return true;
                }
            }else {
                remim.put(rem,i);
            }
        }
        return false;

    }
}