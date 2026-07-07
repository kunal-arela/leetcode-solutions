// 409. Longest Palindrome (Easy)
// https://leetcode.com/problems/longest-palindrome/

class Solution {
    public int longestPalindrome(String s) {
        int[] count = new int[128];
        for (char c : s.toCharArray()) {
            count[c]++;
        }

        int length = 0;
        boolean hasOdd = false;

        for (int c : count) {
            // Add the largest even part of the frequency
            length += (c / 2) * 2;
            
            // Check if there is at least one odd frequency character available
            if (c % 2 != 0) {
                hasOdd = true;
            }
        }

        // If at least one character had an odd frequency, we can use one in the center
        return hasOdd ? length + 1 : length;
    }
}