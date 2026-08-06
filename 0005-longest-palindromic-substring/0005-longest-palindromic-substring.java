class Solution {
    public String longestPalindrome(String s) {
        if(s.length()<=1){
            return s;
        }
        int ml=1;
        String ms=s.substring(0,1);
        for(int i=0;i<s.length();i++){
            for(int j=i+ml;j<=s.length();j++){
                if(j-i>ml&& isPalindrome(s.substring(i,j))){
                    ml=j-i;
                    ms=s.substring(i,j);
                }
            }
        }
        return ms;        
    }
    private boolean isPalindrome(String str){
    int l=0;
    int r=str.length()-1;
    while(l<r){
        if(str.charAt(l)!=str.charAt(r)){
            return false;
        }
        l++;
        r--;
    }
    return true;
}
}
