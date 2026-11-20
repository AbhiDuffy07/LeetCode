class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int[] rem = new int[k];
        int offset = 0, res = 0;
        for (int cur : nums) {
            offset = Math.floorMod(offset + cur, k);
            rem[Math.floorMod(Math.floorMod(cur, k) - offset, k)]++;
            res += rem[Math.floorMod(-offset, k)];
        }
        return res;
    }
}