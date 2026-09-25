// 3. Longest Substring Without Repeating Characters (Medium)
// https://leetcode.com/problems/longest-substring-without-repeating-characters/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int left = 0;
        int max = 0;
        int [] freq = new int[128];
        for(int right = 0;right<n;right++){
            freq[s.charAt(right)]++;
            while( freq[s.charAt(right)] > 1){
                freq[s.charAt(left)]--;
                left++;
            }
            int len = right - left + 1;
            max = Math.max(len , max);
        }
        return max;
    }
}