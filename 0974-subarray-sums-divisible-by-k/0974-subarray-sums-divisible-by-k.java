class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer,Integer> pm=new HashMap<>();
        pm.put(0,1);
        int count=0;
        int ps=0;
        for(int num : nums){
            ps+=num;
            int mod=ps%k;
            if(mod<0){
                mod+=k;
            }
            if(pm.containsKey(mod)){
                count+=pm.get(mod);
                pm.put(mod,pm.get(mod)+1);
            }else{
                pm.put(mod,1);
            }
        }
        return count;
    }
}