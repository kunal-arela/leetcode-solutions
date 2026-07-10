// 3. Longest Substring Without Repeating Characters (Medium)
// https://leetcode.com/problems/longest-substring-without-repeating-characters/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        for(int i = 0;i<n;i++){
            String sum = "";
            for(int j = i;j<n;j++){
                sum += charAt(j);
            }
        }
    }
}