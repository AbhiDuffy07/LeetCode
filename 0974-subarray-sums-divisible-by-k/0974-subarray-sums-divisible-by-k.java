class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        int ans=0,p=0;
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            p=p+nums[i];
            int r=((p%k)+k)%k;
            if(map.containsKey(r)){
                ans+=map.get(r);
            }
            map.put(r,map.getOrDefault(r,0)+1);
        }

        return ans;
    }
}