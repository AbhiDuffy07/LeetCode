import java.util.*;
class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes, (a, b) -> {
            if (a[0] == b[0]) {
                return b[1] - a[1];
            }
            return a[0] - b[0];
        });
        int n = envelopes.length;
        int[] lis = new int[n];
        int len = 0;
        for (int i = 0; i < n; i++) {
            int height = envelopes[i][1];
            int low = 0;
            int high = len;
            while (low < high) {
                int mid = (high+low) / 2;
                if (lis[mid] < height) {
                    low = mid + 1;
                } else {
                    high = mid;
                }
            }
            lis[low] = height;
            if (low == len) {
                len++;
            }
        }
        return len;
    }
}