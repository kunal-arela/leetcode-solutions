// 3090. Maximum Length Substring With Two Occurrences (Easy)
// https://leetcode.com/problems/maximum-length-substring-with-two-occurrences/

class Solution {
    public int maximumLengthSubstring(String s) {
        int [] freq = new int[26];
        int n = s.length();
        int left = 0;
        int Max = 0;
        for(int i = 0;i<n;i++){
            freq[s.charAt(i) - 'a']++;
            while(freq[s.charAt(i) - 'a'] > 2){
                freq[s.charAt(left) - 'a']--;
                left++;
            }
            Max = Math.max(Max , i - left + 1);
        }
        return Max;
    }
}