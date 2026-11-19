class Solution {
    public boolean isAnagram(String s, String t) {
        char[] m=s.toCharArray();
        char[] n=t.toCharArray();
        Arrays.sort(m);
        Arrays.sort(n);
        return Arrays.equals(m,n);
    }
}