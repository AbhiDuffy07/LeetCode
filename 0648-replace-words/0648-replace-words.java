class Solution {
    public String replaceWords(List<String> dict, String sentence) {
        Set<String> s = new HashSet<>(dict);
        StringBuilder res = new StringBuilder();
        String[] words = sentence.split(" ");
        int maxLen = 0;
        for (String root : dict) {
            maxLen = Math.max(maxLen, root.length());
        }
        for (String t : words) {
            boolean found = false;
            for (int i = 1; i <= Math.min(t.length(), maxLen); i++) {
                String curr = t.substring(0, i);
                if (s.contains(curr)) {
                    res.append(curr);
                    found = true;
                    break;
                }
            }
            if (!found) {
                res.append(t);
            }
            res.append(" ");
        }
        res.deleteCharAt(res.length() - 1);
        return res.toString();
    }
}