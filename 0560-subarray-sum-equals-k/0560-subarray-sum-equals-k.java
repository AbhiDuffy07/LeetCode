class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> scm=new HashMap<>();
        scm.put(0,1);
        int ps=0,res=0;
        for(int num:nums){
            ps+=num;
            if(scm.containsKey(ps-k)){
                res+=scm.get(ps-k);
            }
            scm.put(ps,scm.getOrDefault(ps,0)+1);
        }
        return res;
    }
}