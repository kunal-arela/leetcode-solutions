// 680. Valid Palindrome II (Easy)
// https://leetcode.com/problems/valid-palindrome-ii/

class Solution {
    public boolean validPalindrome(String s) {
        int n = s.length();
        int left = 0;
        int right = n - 1;
        while(left < right){
            if(s.charAt(left) == s.charAt(right)){
                return true;
            }
            left++;
            right--;
        }
        return false;
    }
}