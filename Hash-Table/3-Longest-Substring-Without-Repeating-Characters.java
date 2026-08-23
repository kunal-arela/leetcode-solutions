// 3. Longest Substring Without Repeating Characters (Medium)
// https://leetcode.com/problems/longest-substring-without-repeating-characters/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int [] freq = new int[26];
        int left = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
             freq[s.charAt(i) - 'a']++;
            
           while(freq[s.charAt(i)] == 1){
             int len =  s.substring(left , i);
             left++;
             max = Math.max(len , max);

           }
        }
        return max; 
    }
}