// 3110. Score of a String (Easy)
// https://leetcode.com/problems/score-of-a-string/

class Solution {
    public int scoreOfString(String s) {
        int sc = 0;
        for(int i = 0;i<s.length() - 1;i++){
            sc  +=   Math.abs(s.charAt(i) - s.charAt(i +1)); 
        }
        return sc;
    }
}