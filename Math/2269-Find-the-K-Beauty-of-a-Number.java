// 2269. Find the K-Beauty of a Number (Easy)
// https://leetcode.com/problems/find-the-k-beauty-of-a-number/

class Solution {
    public int divisorSubstrings(int num, int k) {
        String s = String.valueOf(num);
        int kb = 0;
        for (int i = 0; i <= s.length() - k; i++) {
            String part = s.substring(i, i + k);
            int value = Integer.parseInt(part);
            if (value != 0 && num % value == 0) {
                kb++;
            }
        }
        return kb;
    }
}