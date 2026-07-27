// 3760. Maximum Substrings With Distinct Start (Medium)
// https://leetcode.com/problems/maximum-substrings-with-distinct-start/

class Solution {
    public int maxDistinct(String s) {
        int[] arr = new int[26];
        int freq = 0;
        
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            if (arr[index] == 0) {
                freq++;
                arr[index] = 1;
            }
        }
        return freq;
    }
}